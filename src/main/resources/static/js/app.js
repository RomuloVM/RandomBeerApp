angular.module("RandomBeerApp", []).controller("beerInfo", function($scope, $http) {
	
	var fetch = function() {
		
		$http.get("/randomBeer/").then(function(response) {
			$scope.beer = response.data;
			console.log(response);
		})
	}
	
	fetch();
	
	$scope.httpCall = function(){
		fetch(); 
	}
	
});