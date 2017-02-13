homeApp.controller('customersCtrl', function($scope,$rootScope, $http,useridService) {
	
	 //console.log("***from dataservi---------ce*****"+useridService.getUserId());
	console.log(useridService.getUserId());
	$rootScope.host='';
	//$rootScope.host = $rootScope.host+"";
	//$rootScope.host = "http://localhost:8080/PrecipiceIP/";
	//$rootScope.host = "http://pipservices.us-west-2.elasticbeanstalk.com/";
	var userID = useridService.getUserId();
	
	$rootScope.userId = userID;
	 if(userID == "" || userID == null){
		 console.log("Redirect To Login Page : But Not Working");
		 console.log("----1----");
		 window.location= '../index.html';
	 }
	 //var host = useridService.getHost("aws");
	 
	 
	 console.log("-----useridService.getHost>"+$rootScope.host);
	$http.get($rootScope.host+"../rest/reg/userDetails/"+userID)
	// $http.get($rootScope.host+"../rest/reg/userDetails/"+userID)
	 .success(function(response){
		 console.log("=======> " + response);
		 if(response != "" && response != null){
			 $rootScope.userDetail = response;
		 } else{
			 console.log("----2----");
			 window.location= '../index.html';
		 }
	 });
	 $scope.create = function() {
		 alert("");
	      /* $location.path('/tab/newpost'); */   /* this variant doesnt work */
	      $state.go('form.report'); 
	    };

});



homeApp.controller('compDetailCtrl', function($scope,$rootScope,$window,$state, $http,useridService) {
	// Page:Registaration:CompanyDetail :: Submit
	
	$scope.compDetSubmit = function(userDetail){
		
		
	    console.log("cookie extracted in compDetailCtrl===>"+$rootScope.userId);
	    //userDetail.userID = $rootScope.userId;
	    

	    userDetail.formID = 2;
//	    $scope.lclUserDetail = userDetail;
	    //userdetService.set(userDetail);
	    
	    $rootScope.userDetail = userDetail;
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
		//	 $('.nav-tabs > .active').next('li').find('a').trigger('click');
			 //$state.go('eventmenu.financedet', {}, {reload : true});
			 $state.go('form.finance');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
		//$scope.lclUserDetail = userDetail;
	}
});

//Finance Detail Page
homeApp.controller('financeDetailCtrl', function($scope,$rootScope,$state, $http,useridService ) {
	// Page:FinanceDetail :: Submit
	$scope.financeDetSubmit = function(userDetail){
//		userDetail = $scope.lclUserDetail;
		console.log("***********Finance Management Detail Controller************");
		userDetail.formID = 2;
		//userDetail.userID = $rootScope.userId;
		userDetail.userID = useridService.getUserId();
		console.log("ROOT OBJECT====>"+$rootScope.userDetail.formID);
		//userDetail = angular.extend($rootScope.userDetail);
		$rootScope.userDetail.formID = 2;
		$rootScope.userDetail.annualRev = userDetail.annualRev;
		$rootScope.userDetail.noOfEmp = userDetail.noOfEmp;
		$rootScope.userDetail.investInRnD = userDetail.investInRnD;
		$rootScope.userDetail.thirdPartyProd = userDetail.thirdPartyProd;
		$rootScope.userDetail.compBusType = userDetail.compBusType;
		$rootScope.userDetail.sellService = userDetail.sellService;
		$rootScope.userDetail.sellProdAndSvc = userDetail.sellProdAndSvc;
		$rootScope.userDetail.licProp = userDetail.licProp;
		$rootScope.userDetail.sellService = userDetail.sellService;
		
		
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
//			 $('.nav-tabs > .active').next('li').find('a').trigger('click');
			$state.go('form.biz');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
	}
	$scope.goBack = function(){
		$state.go('form.profile');
	}
	$scope.$watch("userDetail.compBusType", function(val){
		  if (val == "0") { // or, if (!val.length), to make it completely equivalent
		    $scope.userDetail.sellProd = null;
		  }
		});
});

homeApp.controller('businessDetailCtrl', function($scope,$rootScope,$state, $http,useridService) {
	// Page:FinanceDetail :: Submit
	$scope.businessDetSubmit = function(userDetail){
		userDetail.formID = 3;
		//userDetail.userID = $rootScope.userId;
		userDetail.userID = useridService.getUserId();
		$rootScope.userDetail.formID = 2;
		$rootScope.userDetail.compOverall = userDetail.compOverall;
		$rootScope.userDetail.compByBu = userDetail.compByBu;
		$rootScope.userDetail.compMarketAct = userDetail.compMarketAct;
		$rootScope.userDetail.compIpPolicy = userDetail.compIpPolicy;
		$rootScope.userDetail.compIpStrategy = userDetail.compIpStrategy;
		$rootScope.userDetail.businesStrategy = userDetail.businesStrategy;
		
		console.log("***********Business Detail Controller************");
		
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
//			 $('.nav-tabs > .active').next('li').find('a').trigger('click');
			 $state.go('form.trade');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
	}
	$scope.goBack = function(){
		$state.go('form.finance');
	}
});

homeApp.controller('tradeDetailCtrl', function($scope,$rootScope,$state, $http,useridService) {
	// Page:TradeDetails :: Submit
	$scope.tradeDetSubmit = function(userDetail){
		console.log("***********Trade Controller************");
		userDetail.formID = 4;
		//userDetail.userID = $rootScope.userId;
		userDetail.userID = useridService.getUserId();
		$rootScope.userDetail.formID = 2;
		$rootScope.userDetail.preserveCopyRight = userDetail.preserveCopyRight;
		$rootScope.userDetail.preserveCopyRight=userDetail.preserveCopyRight;
		$rootScope.userDetail.regTradeMark=userDetail.regTradeMark;
		$rootScope.userDetail.domainRefBN=userDetail.domainRefBN;
		$rootScope.userDetail.domainRefPN=userDetail.domainRefPN;
		$rootScope.userDetail.tradeSec=userDetail.tradeSec;
		$rootScope.userDetail.categoriTradeSec=userDetail.categoriTradeSec;
		$rootScope.userDetail.mngCyberSecRisk = userDetail.mngCyberSecRisk
		$rootScope.userDetail.protectTradeSec = userDetail.protectTradeSec;
		$rootScope.userDetail.protectConfInfo = userDetail.protectConfInfo;
		
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
//			 $('.nav-tabs > .active').next('li').find('a').trigger('click');
			// $state.go('eventmenu.financedet');
			 $state.go('form.risk');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
	}
	$scope.goBack = function(){
		$state.go('form.biz');
	}
});


homeApp.controller('riskMngDetailCtrl', function($scope,$rootScope,$state, $http,useridService) {
	// Page:Risk Management :: Submit
	$scope.riskMngDetSubmit = function(userDetail){
		console.log("***********Risk Detail Controller************");
		userDetail.formID = 5;
		//userDetail.userID = $rootScope.userId;
		userDetail.userID = useridService.getUserId();
		$rootScope.userDetail.formID = 2;
		$rootScope.userDetail.hasConfInfo = userDetail.hasConfInfo;
		$rootScope.userDetail.hasIpPolicy = userDetail.hasIpPolicy;
		$rootScope.userDetail.agreementMngProt = userDetail.agreementMngProt;
		$rootScope.userDetail.agreementMngProt = userDetail.agreementMngProt;
		$rootScope.userDetail.hasErm = userDetail.hasErm;
		$rootScope.userDetail.thirdPartyLia = userDetail.thirdPartyLia;
		$rootScope.userDetail.selfInsIpLose = userDetail.selfInsIpLose;
		$rootScope.userDetail.purchedThirdPartyIns = userDetail.purchedThirdPartyIns;
		$rootScope.userDetail.hasOverIpGov = userDetail.hasOverIpGov;
		
		
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
			// $('.nav-tabs > .active').next('li').find('a').trigger('click');
			// $state.go('eventmenu.financedet');
			 $state.go('form.r&d');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
	}
	$scope.goBack = function(){
		$state.go('form.trade');
	}
});
homeApp.controller('researchDeveleopmentCtrl', function($scope,$rootScope,$state, $http,useridService) {
	// Page:Risk Management :: Submit
	$scope.resDevDetSubmit = function(userDetail){
		console.log("***********Risk Detail Controller************");
		userDetail.formID = 6;
		//userDetail.userID = $rootScope.userId;
		userDetail.userID = useridService.getUserId();
		$rootScope.userDetail.formID = 2;
		$rootScope.userDetail.compCondIpPolicy = userDetail.compCondIpPolicy;
		$rootScope.userDetail.intelliMonitor = userDetail.intelliMonitor;
		$rootScope.userDetail.spaceAnaly = userDetail.spaceAnaly;
		$rootScope.userDetail.randDInCentOrg = userDetail.randDInCentOrg;
		$rootScope.userDetail.innovFromIntEmp = userDetail.innovFromIntEmp;
		$rootScope.userDetail.bizUnitConduct = userDetail.bizUnitConduct;
		$rootScope.userDetail.empSignNDA = userDetail.empSignNDA;
		$rootScope.userDetail.openInnovPortal = userDetail.openInnovPortal;
		$rootScope.userDetail.openInnovThirdParty = userDetail.openInnovThirdParty;
		
		
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
			// $('.nav-tabs > .active').next('li').find('a').trigger('click');
			// $state.go('eventmenu.financedet');
			 $state.go('form.ipgovern');
//			 $state.go('form.summary');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
	}
	$scope.goBack = function(){
		$state.go('form.risk');
	}
});
homeApp.controller('ipGovernCtrl', function($scope,$rootScope,$state, $http,useridService) {
	// Page:Risk Management :: Submit
	$scope.ipGovernDetSubmit = function(userDetail){
		console.log("***********Risk Detail Controller************");
		userDetail.formID = 7;
		//userDetail.userID = $rootScope.userId;
		userDetail.userID = useridService.getUserId();
		$rootScope.userDetail.formID = 2;
		$rootScope.userDetail.extractValue = userDetail.extractValue;
		$rootScope.userDetail.compExtValue = userDetail.compExtValue;
		$rootScope.userDetail.compExtThrough = userDetail.compExtThrough;
		$rootScope.userDetail.interCompIpAgree = userDetail.interCompIpAgree;
		$rootScope.userDetail.trainForSecure = userDetail.trainForSecure;
		$rootScope.userDetail.empHandbook = userDetail.empHandbook;
		$rootScope.userDetail.ipAsFinReport = userDetail.ipAsFinReport;
		$rootScope.userDetail.reviewAggr = userDetail.reviewAggr;
		$rootScope.userDetail.defIpStratg = userDetail.defIpStratg;
		$rootScope.userDetail.ipAudits = userDetail.ipAudits;
		$rootScope.userDetail.ipRightsAtEmptTime = userDetail.ipRightsAtEmptTime;
		$rootScope.userDetail.empRecvAddIncent = userDetail.empRecvAddIncent;
		
		
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
			// $('.nav-tabs > .active').next('li').find('a').trigger('click');
			// $state.go('eventmenu.financedet');
			 $state.go('form.thirdparty');
//			 $state.go('form.summary');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
	}
	$scope.goBack = function(){
		$state.go('form.r&d');
	}
});
homeApp.controller('thirdPartyCtrl', function($scope,$rootScope,$state, $http,useridService) {
	// Page:Risk Management :: Submit
	$scope.thirdPartDetDetSubmit = function(userDetail){
		console.log("***********Risk Detail Controller************");
		userDetail.formID = 8;
		//userDetail.userID = $rootScope.userId;
		userDetail.userID = useridService.getUserId();
		$rootScope.userDetail.formID = 2;
		$rootScope.userDetail.compForInvest = userDetail.compForInvest;
		$rootScope.userDetail.acqProcMandA = userDetail.acqProcMandA;
		$rootScope.userDetail.engJointDev = userDetail.engJointDev;
		$rootScope.userDetail.contractResOrg = userDetail.contractResOrg;
		$rootScope.userDetail.orgCompInt = userDetail.orgCompInt;
		$rootScope.userDetail.bizUnitConduct = userDetail.bizUnitConduct;
		$rootScope.userDetail.pastIpRights = userDetail.pastIpRights;
		$rootScope.userDetail.dedicatStafRes = userDetail.dedicatStafRes;
		$rootScope.userDetail.coPromoAgree = userDetail.coPromoAgree;
		$rootScope.userDetail.indSubmitIdea = userDetail.indSubmitIdea;
		$rootScope.userDetail.gatherIdeas = userDetail.gatherIdeas;
		
		
		$http.post($rootScope.host+"../rest/reg/user", $rootScope.userDetail)
		 .success(function(response){
			 console.log("=======> " + response);
			 if(response != ""){
				 $rootScope.userDetail = response;
			 }
			// $('.nav-tabs > .active').next('li').find('a').trigger('click');
			// $state.go('eventmenu.financedet');
			 $state.go('form.summary');
//			 $scope.lclUserDetail = userDetail;
			// $window.location.href= './financedet.html'
		 });
	}
	$scope.goBack = function(){
		$state.go('form.ipgovern');
	}
});
homeApp.controller('logoutController',function($location, $scope,$rootScope,$state){
	$scope.logout = function(userDetail){
		if (confirm('Are you sure you want to log out?')) {
			window.location= '../index.html';
		} else {
			return false;
		}
		
	}
	
});
homeApp.controller('summaryCtrl', function($scope,$rootScope,$state, $http,useridService) {
	// Page:Risk Management :: Submit
	$scope.goBack = function(){
		$state.go('form.risk');
	}
	$scope.viewRiskScore = function(){
		console.log("***********Summaryl Controller************");
		
		
		$state.go('form.report');
	
	}
	$scope.$watch("userDetail.hasIpPolicy", function(val){
	  if (val == "0") { // or, if (!val.length), to make it completely equivalent
	    $scope.userDetail.hasIpPolicyList = null;
	  }
	});
	
	$scope.$watch("userDetail.agreementMngProt", function(val){
	  if (val == "0") { // or, if (!val.length), to make it completely equivalent
	    $scope.userDetail.agreementMngProtList = null;
	  }
	});
	
	$scope.$watch("userDetail.hasErm", function(val){
	  if (val == "0") { // or, if (!val.length), to make it completely equivalent
	    $scope.userDetail.hasErmList = null;
	  }
	});
	
	$scope.$watch("userDetail.purchedThirdPartyIns", function(val){
	  if (val == "0") { // or, if (!val.length), to make it completely equivalent
	    $scope.userDetail.thirdPartyIns = null;
	  }
	});
});






