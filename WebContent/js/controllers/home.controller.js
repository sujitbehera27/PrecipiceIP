homeApp.controller('customersCtrl', function($scope, $rootScope, $http, useridService) {
    console.log(useridService.getUserId());
    $rootScope.host = '';
    //$rootScope.host = $rootScope.host+"";
    //$rootScope.host = "http://localhost:8080/PrecipiceIP/";
    //$rootScope.host = "http://pipservices.us-west-2.elasticbeanstalk.com/";
    var userID = useridService.getUserId();

    $rootScope.userId = userID;
    if (userID == "" || userID == null) {
        window.location = '../index.html';
    }
    //var host = useridService.getHost("aws");

    console.log("-----useridService.getHost>" + $rootScope.host);
    $http.get($rootScope.host + "../rest/reg/userDetails/" + userID)
        .success(function(response) {
            if (response != "" && response != null) {
                $rootScope.userDetail = response;
            } else {
                window.location = '../index.html';
            }
        });
    $scope.create = function() {
        $state.go('form.report');
    };

});



homeApp.controller('compDetailCtrl', function($scope, $rootScope, $window, $state, $http, useridService) {

    $scope.compDetSubmit = function(userDetail) {
        userDetail.formID = 2;
        $rootScope.userDetail = userDetail;
        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.finance');
            });
    }
});

//Finance Detail Page
homeApp.controller('financeDetailCtrl', function($scope, $rootScope, $state, $http, useridService) {
    $scope.financeDetSubmit = function(userDetail) {
        userDetail.formID = 2;
        userDetail.userID = useridService.getUserId();
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

        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                console.log("=======> " + response);
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.biz');
            });
    }
    $scope.goBack = function() {
        $state.go('form.profile');
    }
    $scope.$watch("userDetail.compBusType", function(val) {
        if (val == "0") { // or, if (!val.length), to make it completely equivalent
            $scope.userDetail.sellProd = null;
        }
    });
});

homeApp.controller('businessDetailCtrl', function($scope, $rootScope, $state, $http, useridService) {
    $scope.businessDetSubmit = function(userDetail) {
        userDetail.formID = 3;
        userDetail.userID = useridService.getUserId();
        $rootScope.userDetail.formID = 2;
        $rootScope.userDetail.compOverall = userDetail.compOverall;
        $rootScope.userDetail.compByBu = userDetail.compByBu;
        $rootScope.userDetail.compMarketAct = userDetail.compMarketAct;
        $rootScope.userDetail.compIpPolicy = userDetail.compIpPolicy;
        $rootScope.userDetail.compIpStrategy = userDetail.compIpStrategy;
        $rootScope.userDetail.businesStrategy = userDetail.businesStrategy;

        console.log("***********Business Detail Controller************");

        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.trade');
            });
    }
    $scope.goBack = function() {
        $state.go('form.finance');
    }
});

homeApp.controller('tradeDetailCtrl', function($scope, $rootScope, $state, $http, useridService) {
    // Page:TradeDetails :: Submit
    $scope.tradeDetSubmit = function(userDetail) {
        console.log("***********Trade Controller************");
        userDetail.formID = 4;
        userDetail.userID = useridService.getUserId();
        $rootScope.userDetail.formID = 2;
        $rootScope.userDetail.preserveCopyRight = userDetail.preserveCopyRight;
        $rootScope.userDetail.preserveCopyRight = userDetail.preserveCopyRight;
        $rootScope.userDetail.regTradeMark = userDetail.regTradeMark;
        $rootScope.userDetail.domainRefBN = userDetail.domainRefBN;
        $rootScope.userDetail.domainRefPN = userDetail.domainRefPN;
        $rootScope.userDetail.tradeSec = userDetail.tradeSec;
        $rootScope.userDetail.categoriTradeSec = userDetail.categoriTradeSec;
        $rootScope.userDetail.mngCyberSecRisk = userDetail.mngCyberSecRisk
        $rootScope.userDetail.protectTradeSec = userDetail.protectTradeSec;
        $rootScope.userDetail.protectConfInfo = userDetail.protectConfInfo;

        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.risk');
            });
    }
    $scope.goBack = function() {
        $state.go('form.biz');
    }
});


homeApp.controller('riskMngDetailCtrl', function($scope, $rootScope, $state, $http, useridService) {
    // Page:Risk Management :: Submit
    $scope.riskMngDetSubmit = function(userDetail) {
        console.log("***********Risk Detail Controller************");
        userDetail.formID = 5;
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
        $rootScope.userDetail.compBenchmark = userDetail.compBenchmark;

        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.r&d');
            });
    }
    $scope.goBack = function() {
        $state.go('form.trade');
    }
});
homeApp.controller('researchDeveleopmentCtrl', function($scope, $rootScope, $state, $http, useridService) {
    // Page:Risk Management :: Submit
    $scope.resDevDetSubmit = function(userDetail) {
        console.log("***********Risk Detail Controller************");
        userDetail.formID = 6;
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


        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                console.log("=======> " + response);
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.ipgovern');
            });
    }
    $scope.goBack = function() {
        $state.go('form.risk');
    }
});
homeApp.controller('ipGovernCtrl', function($scope, $rootScope, $state, $http, useridService) {
    // Page:Risk Management :: Submit
    $scope.ipGovernDetSubmit = function(userDetail) {
        console.log("***********Risk Detail Controller************");
        userDetail.formID = 7;
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


        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.thirdparty');
            });
    }
    $scope.goBack = function() {
        $state.go('form.r&d');
    }
});
homeApp.controller('thirdPartyCtrl', function($scope, $rootScope, $state, $http, useridService) {
    // Page:Risk Management :: Submit
    $scope.thirdPartDetDetSubmit = function(userDetail) {
        console.log("***********Risk Detail Controller************");
        userDetail.formID = 8;
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


        $http.post($rootScope.host + "../rest/reg/user", $rootScope.userDetail)
            .success(function(response) {
                if (response != "") {
                    $rootScope.userDetail = response;
                }
                $state.go('form.summary');
            });
    }
    $scope.goBack = function() {
        $state.go('form.ipgovern');
    }
});
homeApp.controller('logoutController', function($location, $scope, $rootScope, $state) {
    $scope.logout = function(userDetail) {
        if (confirm('Are you sure you want to log out?')) {
            window.location = '../index.html';
        } else {
            return false;
        }

    }

});
homeApp.controller('summaryCtrl', function($scope, $rootScope, $state, $http, useridService) {
    // Page:Risk Management :: Submit
    $scope.goBack = function() {
        $state.go('form.risk');
    }
    $scope.viewRiskScore = function() {
        console.log("***********Summaryl Controller************");


        $state.go('riskScore');

    }
    $scope.$watch("userDetail.hasIpPolicy", function(val) {
        if (val == "0") { // or, if (!val.length), to make it completely equivalent
            $scope.userDetail.hasIpPolicyList = null;
        }
    });

    $scope.$watch("userDetail.agreementMngProt", function(val) {
        if (val == "0") { // or, if (!val.length), to make it completely equivalent
            $scope.userDetail.agreementMngProtList = null;
        }
    });

    $scope.$watch("userDetail.hasErm", function(val) {
        if (val == "0") { // or, if (!val.length), to make it completely equivalent
            $scope.userDetail.hasErmList = null;
        }
    });

    $scope.$watch("userDetail.purchedThirdPartyIns", function(val) {
        if (val == "0") { // or, if (!val.length), to make it completely equivalent
            $scope.userDetail.thirdPartyIns = null;
        }
    });
});