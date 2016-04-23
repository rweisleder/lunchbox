(function() {
  'use strict';

  angular
    .module('lunchboxWebapp')
    .config(routeConfig);

  // Route-Konfiguration
  function routeConfig($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'app/offers/offers.html',
        controller: 'OffersController',
        navbarName: 'Mittagsangebote'
      })
      .when('/about', {
        templateUrl: 'app/about/about.html',
        navbarName: 'Info'
      })
      .otherwise({
        redirectTo: '/'
      });
  }

})();
