/**
 * 定义RequireJS配置
 */
require.config({
    baseUrl:'/app',
    paths: {
        'angular': '../lib/angular',
        'angular-route': '../lib/angular-route',
        'domReady': '../lib/domReady',
        'angular-translate':'../lib/angular-translate'
    },
    shim: {
        'angular': {
            exports: 'angular'
        },
        'angular-route': {
            deps: ['angular']
        }
    },

    map:{
        '*':{
            'app': 'app'
        }
    },

    deps: [
        // kick start application... see bootstrap.js
        'bootstrap'
    ]
});

 require( [
         'app',
         'bootstrap',//AngularJS bootstrap
         'controllers/controllers',
         'services/services',
         'directives/directives',
         'account/account',
         'common/common',
         'filters/filters' ],
     function(app) {
//         'use strict';
//         return app.config( [ '$routeProvider', function($routeProvider) {
//             $routeProvider.when('/view1', {
//                 templateUrl : './home.html',
//                 controller : 'MyCtrl1'
//             });
//
//             $routeProvider.when('/view2', {
//                 templateUrl : 'temp.html',
//                 controller : 'MyCtrl2'
//             });
//
//             $routeProvider.otherwise( {
//                redirectTo : '/view2'
//                 // templateUrl : 'error.html'
//             });
//         } ]);
     }
 );
