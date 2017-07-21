define([
    'angular',
    'angular-route',
    'controllers/index',
    'directives/index',
    'filters/index',
    'services/index',
    'common/index',
    'account/index'
], function (angular) {
    'use strict';

    return angular.module('app', [
        'controllers',
        'directives',
        'filters',
        'services',
        'ngRoute',
        'account',
        'common'
    ]);
});
