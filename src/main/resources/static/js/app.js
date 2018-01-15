/**
 * Created by alessandra on 2018/01/14.
 */
'use strict';

var app = angular.module('app', [
    'ngRoute',
    'appControllers',
    'appServices'
]);

app.config(['$routeProvider',
    function($routeProvider) {

        $routeProvider.
        when('/', {
            templateUrl: 'views/voos.html',
            controller: 'VooCtrl'
        }).
        when('/voo', {
            templateUrl: 'views/voos.html',
            controller: 'VooCtrl'
        }).
        when('/voo/:id', {
            templateUrl: 'views/voo-detail.html',
            controller: 'VooDetailCtrl'
        }).
        otherwise({
            redirectTo: '/'
        });

    }]
);
