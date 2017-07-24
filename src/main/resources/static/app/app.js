define([
    'angular',
    'angular-cookies',
    'angular-route',
    'angular-translate',
    'angular-translate-loader-static-files',
    'angular-translate-storage-cookie',
    'controllers/index',
    'directives/index',
    'filters/index',
    'services/index',
    'common/index',
    'account/index'
], function (angular) {
    'use strict';

    return angular.module('app', ['pascalprecht.translate', 'ngCookies',
        'controllers',
        'directives',
        'filters',
        'services',
        'ngRoute',
        'account',
        'common'
    ])
    .config(['$translateProvider', function($translateProvider){
              // Register a loader for the static files
              // So, the module will search missing translation tables under the specified urls.
              // Those urls are [prefix][langKey][suffix].
              $translateProvider.useStaticFilesLoader({
                prefix: '../l10n/',
                suffix: '.json'
              });
              // Tell the module what language to use by default
              $translateProvider.preferredLanguage('en_US');
              // Tell the module to store the language in the cookies
              $translateProvider.useCookieStorage();
            }]);
});
