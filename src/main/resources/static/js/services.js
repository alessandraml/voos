/**
 * Created by alessandra on 2018/01/14.
 */
'use strict';

var appServices = angular.module('appServices', []);

appServices.factory('vooServices', ['$http',
    function($http) {
        return {
            get: function(id, success, error) {
                $http.get('/api/voos/' + id).then(success).catch(error)
            },
            all: function(success, error) {
                $http.get('/api/voos').then(success).catch(error)
            },
            allByFilter: function(params, success, error) {
                $http.get('/api/voos?' + params).then(success).catch(error)
            }
        };
    }]
);
