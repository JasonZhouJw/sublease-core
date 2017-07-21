define([
    'angular',
    'angular-route'
    ],
    function (angular) {
    'use strict';
    return angular.module('account', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/login', {
                templateUrl : 'app/account/views/login.html',
                controller : 'UserLoginCtrl'
              });
            }]);
});
