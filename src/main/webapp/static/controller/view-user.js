'use strict';

var addexpv=angular.module('viewUserModule',[ ]);

addexpv.controller('viewController',[ '$scope', '$http', '$location' ,function($scope,$http,$location){
	
	console.log("Reached the Angular controller");
	var vm= this;
	vm.users={};
	
	
	
	$http.get('getallusers.json').success(function(response) {
		   //console.log('response',response);
		  console.log('success');
		   vm.users = response;		   
	    }).error(function(err){ 
	    	//bootbox.alert("Cannot edit row (error in console)");
	    	console.dir(err); 
	    	//alert(response);
	    	//vm.expenses = resposne;
	    	console.log('error');
});
	
	 
	
}]);