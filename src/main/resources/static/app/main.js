/**
 * 定义RequireJS配置
 */
require.config({

    paths: {
        'angular': '../lib/angular',
        'angular-route': '../lib/angular-route',
        'domReady': '../lib/domReady'
    },
    shim: {
        'angular': {
            exports: 'angular'
        },
        'angular-route': {
            deps: ['angular']
        }
    },

    deps: [
        // kick start application... see bootstrap.js
        './bootstrap'
    ]
});

require( [
        'app',
        'bootstrap',//AngularJS bootstrap
        'controllers/controllers',
        'services/services',
        'directives/directives',
        'filters/filters' ],
    function(app) {
        'use strict';
        return app.config( [ '$routeProvider', function($routeProvider) {
            $routeProvider.when('/view1', {
                templateUrl : 'partials/partial1.html',
                controller : 'MyCtrl1'
            });

            $routeProvider.when('/view2', {
                templateUrl : 'partials/partial2.html',
                controller : 'MyCtrl2'
            });

            $routeProvider.otherwise( {
                redirectTo : '/view1'
            });
        } ]);
    }
);