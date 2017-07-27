define([
    'angular',
    'angular-route'
    ],
    function (angular) {
    'use strict';
    return angular.module('common', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/home', {
                templateUrl : 'app/common/views/home.html',
                controller : 'HomeCtrl'
              });
//            $routeProvider.when('/login', {
//                templateUrl : 'app/common/views/login.html'
//            });
            $routeProvider.otherwise({
                redirectTo : '/home'
            });
            }]);
});
