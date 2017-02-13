var homeApp = angular.module('HomeApp', ['ui.router']).run(function($rootScope){
$rootScope.userId = "";
$rootScope.userDetail;

});

var loginregApp = angular.module('LoginRegApp', []);
var homeApp = angular.module('formApp', ['ngAnimate', 'ui.router']).run(function($rootScope){
	$rootScope.userId = "";
	$rootScope.userDetail;
	
	})

//configuring our routes 
//=============================================================================
.config(function($stateProvider, $urlRouterProvider) {
 
 $stateProvider
 
     // route to show our basic form (/form)
	.state('riskScore', {
	     url: '/riskScore',
	     templateUrl: 'report.html',
	     controller: 'reportController'
	 })
     .state('form', {
         url: '/form',
         templateUrl: 'form.html',
         controller: 'formController'
     })
     
     // nested states 
     // each of these sections will have their own view
     // url will be nested (/form/profile)
     .state('form.profile', {
         url: '/profile',
         templateUrl: 'companydet.html'
     })
     
     // url will be /form/interests
     .state('form.finance', {
         url: '/finance',
         templateUrl: 'financedet.html'
     })
     
     // url will be /form/payment
     .state('form.biz', {
         url: '/biz',
         templateUrl: 'bizdet.html'
     })
     
      // url will be /form/payment
     .state('form.trade', {
         url: '/trade',
         templateUrl: 'tradedet.html'
     })
 
	//url will be /form/payment
	 .state('form.risk', {
	     url: '/risk',
	     templateUrl: 'riskdet.html'
	 })
	 .state('form.r&d', {
	     url: '/r&d',
	     templateUrl: 'r&d.html'
	 })
	 .state('form.ipgovern', {
	     url: '/ipgovern',
	     templateUrl: 'ipgovern.html'
	 })
	 .state('form.thirdparty', {
	     url: '/thirdparty',
	     templateUrl: 'thirdparty.html'
	 })
	  // url will be /form/payment
     .state('form.report', {
         url: '/report',
         templateUrl: 'report.html'
     }).state('form.summary', {
         url: '/summary',
         templateUrl: 'summary.html'
     });
    
 // catch all route
 // send users to the form page 
 $urlRouterProvider.otherwise('/form/profile');
})

//our controller for the form
//=============================================================================
.controller('formController', function($scope) {
 
 // we will store all of our form data in this object
 $scope.formData = {};
 
 // function to process the form
 $scope.processForm = function() {
     alert('awesome!');  
 };
// $scope.create = function() {
//	 alert("");
//     /* $location.path('/tab/newpost'); */   /* this variant doesnt work */
//     $state.go('form.report'); 
//   };
});
//homeApp.controller('navCtrl', function ($scope, $location, $state, Post, Auth) {
//   
//    $scope.create = function() {
//       $state.go('form.report'); 
//    };
//  });