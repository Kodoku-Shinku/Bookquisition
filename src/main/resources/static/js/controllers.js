angular.module("Bookquisition")
.controller("MainController",function($scope, $resource){
  Post = $resource("/libros/:titulo", {titulo: "@titulo"});
  $scope.posts = Post.query();

})

.controller("PostController",function($scope, $resource, $routeParams){
    Post = $resource("/libros/:titulo", {titulo: "@titulo"});
    $scope.posts = Post.get({titulo: $routeParams.titulo});
})


.controller("PerfilController",function($scope, $resource, $routeParams, $http){
	 $scope.perfil;
	 
	 console.log($routeParams.pass);
	 
	$http.get("/usuario/danyelcrz")
		.success(function(data) {
			 $scope.perfil = data;
		})
		.error(function(err) {			
		});
})


.controller("AddBookController",function($scope, $resource, $routeParams){
   
})

.controller("BiblioController",function($scope, $resource, $routeParams){
	  Post = $resource("/libros/:titulo", {titulo: "@titulo"});
	  $scope.posts = Post.query();
})
.controller("SolicitController",function($scope, $resource, $routeParams){
    Post = $resource("/libros/:titulo", {titulo: "@titulo"});
    $scope.posts = Post.get({titulo: $routeParams.titulo});
})
.controller("InterController",function($scope, $resource, $routeParams){
    Post = $resource("/libros/:titulo", {titulo: "@titulo"});
    $scope.posts = Post.get({titulo: $routeParams.titulo});
})
.controller("AddLibroController",function($scope, $resource, $routeParams){

})

.controller("NewPostController",function($scope, $resource){
    Post = $resource("/libros/:titulo", {titulo: "@titulo"});
    $scope.post = {};
    $scope.savePost = function(){
        Post.save({data : $scope.post})
    }
});
