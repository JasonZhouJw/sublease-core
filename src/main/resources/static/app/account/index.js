//define([
//    'angular',
//    'account/controllers/UserLoginCtrl',
//    'account/services/UserService'
//], function (angular) {
//    return angular
//        .config(['$stateProvider', function ($stateProvider) {
//
//         $routeProvider.when('/login', {
//             templateUrl : 'app/account/views/login.html',
//             controller : 'userLoginCtrl'
//         });
//       }]);
//});

define( [
       'account/controllers/UserLoginCtrl',
       'account/services/UserService' ],
    function() {}
);
