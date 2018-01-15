/**
 * Created by alessandra on 2018/01/14.
 */

'use strict';

var appControllers = angular.module('appControllers', []);



appControllers.controller('VooCtrl', ['$scope', '$routeParams', 'vooServices', '$httpParamSerializer',
    function($scope, $routeParams, vooServices, $httpParamSerializer) {

        // Get all voos
        vooServices.all(function(response) {
            $scope.voos = response.data.content;
        });

        $scope.applyFilter = function() {

            var params = {"cidadeOrigem":$scope.cidadeOrigem, "cidadeDestino":$scope.cidadeDestino, "status":$scope.status};

            params = clean(params);

            var qs = $httpParamSerializer(params);

            vooServices.allByFilter(qs ,function(response){
               $scope.voos = response.data.content;
            });

            function clean(obj) {
                for (var prop in obj) {
                    if (obj[prop] === null || obj[prop] === undefined || obj[prop] === "") {
                        delete obj[prop];
                    }
                }
                return obj;
            }
        };
    }]
);

appControllers.controller('VooDetailCtrl', ['$scope', '$routeParams', 'vooServices',
    function($scope, $routeParams, vooServices) {
        // Get voo by id
        vooServices.get($routeParams.id, function(response) {
            $scope.voo = response.data;
        });
    }]
);
