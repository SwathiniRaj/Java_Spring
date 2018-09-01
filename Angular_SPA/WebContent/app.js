var app = angular.module('myApp', ['ngRoute']);

app.config(function($routeProvider) {
	  $routeProvider

	  .when('/', {
	    templateUrl : 'views/home.jsp',
	    controller  : 'Home_Controller'
	  })

	  .when('/about', {
	    templateUrl : 'views/about.jsp',
	    controller  : 'About_Controller'
	  })

	  .when('/contact', {
	    templateUrl : 'views/contact.jsp',
	    controller  : 'Contact_Controller'
	  })

	  .otherwise({redirectTo: '/'});
	  
});

app.controller('Home_Controller', function($scope) {
	  $scope.message = 'Welcome to HealthAxis Group Solutions enable Medicaid and Medicare customers to provide high quality care and keep costs low while ensuring compliance with changing government and state regulations.';
	});

	app.controller('About_Controller', function($scope) {
	  $scope.message = 'HealthAxis Group strives to move the practice and delivery of healthcare towards the ideal through a holistic approach enabled through software, services, and a driving desire to embrace the future.';
	});

	app.controller('Contact_Controller', function($scope) {
	  $scope.message = 'HealthAxis Group<br/>888-974-2947 (AXIS)<br/>info@healthaxis.com<br/>www.healthaxis.com<br/>5509 W Gray St. Suite 200, Tampa, FL 33609';
	});