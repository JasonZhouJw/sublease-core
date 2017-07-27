define(['./../account'], function (account) {
    'use strict';
    account.controller('UserLoginCtrl', ['$scope','$http','$location',function ($scope,$http,$location) {

        $scope.name="demo";

        var self=this;

        var authenticate=function(credentials, callback){
            var headers = credentials ? {authorization : "Basic " + btoa(credentials.username + ":" + credentials.password)} : {};
            $http({
                method: 'POST',
                url: 'login',
                data: $.param(credentials),
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
                              if (response.data.name) {
                                $scope.authenticated = true;
                              } else {
                                $scope.authenticated = false;
                              }
                              callback && callback();
                            }, function() {
                              $scope.authenticated = false;
                              callback && callback();
                            }
            )
//            $http.post('login', credentials)
//                .then(function(response) {
//                  if (response.data.name) {
//                    $scope.authenticated = true;
//                  } else {
//                    $scope.authenticated = false;
//                  }
//                  callback && callback();
//                }, function() {
//                  $scope.authenticated = false;
//                  callback && callback();
//                });
        }

//        authenticate();
        $scope.credentials = {};
        $scope.login = function(form) {
            if(form){
                console.log(form);
            }
            authenticate($scope.credentials, function() {
                if ($scope.authenticated) {
                    $location.path("/");
                    self.error = false;
                } else {
                    $location.path("/login");
                    self.error = true;
                }
            });
        };
    }]);
});
