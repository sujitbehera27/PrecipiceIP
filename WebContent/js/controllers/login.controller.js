loginregApp.controller('loginController', function($scope, $rootScope, $http,$location) {
	// Hide & Seek : Login & Reg Div
	$scope.errorMsg = "";
	$rootScope.userDetail = "";
	$scope.show = 'false';
	$rootScope.userId = 'sujit';
	//$rootScope.host = '';
	$rootScope.host = "http://localhost:8080/PrecipiceIP/";
	// $rootScope.host = "http://pipservices.us-west-2.elasticbeanstalk.com/";
	$scope.showRegDiv = function() {
		$scope.show = 'true';
		$scope.loginRegistartion = "";
	}
	$scope.showLoginDiv = function() {
		$scope.show = 'false';
		$scope.loginRegistartion = "";
	}
	// Hide & Seek : End

	$scope.loginSubmit = function() {

		if (angular.isUndefined($scope.loginRegistartion)
				|| angular.isUndefined($scope.loginRegistartion.userId)
				|| angular.isUndefined($scope.loginRegistartion.password)) {
			$scope.errorMsg = "Please enter User ID and Password";
		} else {
			try{
				$http.post($rootScope.host + "rest/user/login",$scope.loginRegistartion).success(function(response) {
					console.log("response: " + response )
					if (response != "" && response != null) {
						document.cookie = 'userId=' + response;
						window.location = './views/home.html'
					} else {
						$scope.errorMsg = "Invalid User Name or Password";
						$scope.loginRegistartion = "";
					}
				})
				.error(function(data,status){
					$scope.errorMsg = "An error occurred contact support"
				});
			}catch(e){
				$scope.errorMsg = "An error occurred contact support"
			}
		}
	}

	// Registration Service Call
	$scope.registration = function() {
		$http.post($rootScope.host + "rest/user/registarion",
			$scope.loginRegistartion).success(function(response) {
			$rootScope.userId = response;
			document.cookie = 'userId=' + response;
			if (response != null) {
				window.location = './views/home.html';
			} else {
				$scope.errorMsg = "Registration failed, User ID already exists"
				$scope.loginRegistartion = "";
			}
		});
	}
});