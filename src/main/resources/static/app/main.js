/**
 * 定义RequireJS配置
 */
require.config({
    baseUrl:'/app',
    paths: {
        'angular': '../lib/angular',
        'angular-route': '../lib/angular-route/angular-route',
        'angular-cookies': '../lib/angular-cookies/angular-cookies',
        'domReady': '../lib/domReady',
        'angular-translate':'../lib/angular-translate/angular-translate',
        'angular-translate-loader-static-files':'../lib/angular-translate/angular-translate-loader-static-files/angular-translate-loader-static-files',
        'angular-translate-storage-cookie':'../lib/angular-translate/angular-translate-storage-cookie/angular-translate-storage-cookie'
//        'angular-translate-storage-local':'../lib/angular-translate/angular-translate-storage-local/angular-translate-storage-local'
    },
    shim: {
        'angular': {
            exports: 'angular'
        },
        'angular-route': {
            deps: ['angular']
        },
        'angular-cookies':{
            deps:['angular']
        },
        'angular-translate-storage-cookie': {
            deps: [
                'angular-cookies',
                'angular-translate'
            ]
        },
//        'angular-translate-storage-local':{
//            deps: [
//                 'angular-translate-storage-cookies',
//               'angular-translate'
//            ]
//        },
        'angular-translate-loader-static-files': {
            deps: ['angular-translate']
        },
        'angular-translate':{
            deps:['angular']
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
