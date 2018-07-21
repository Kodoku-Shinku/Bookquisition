angular.module("Bookquisition")
.controller("MainController",function($scope, $resource){
  Post = $resource("/libros/:titulo", {titulo: "@titulo"});
  $scope.posts = Post.query();
})
.controller("PostController",function($scope, $resource, $routeParams){
    Post = $resource("/libros/:titulo", {titulo: "@titulo"});
    $scope.posts = Post.get({titulo: $routeParams.titulo});
})
.controller("NewPostController",function($scope, $resource){
    Post = $resource("/libros/:titulo", {titulo: "@titulo"});
    $scope.post = {};
    $scope.savePost = function(){
        Post.save({data : $scope.post})
    }
});
