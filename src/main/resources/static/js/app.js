angular.module("Bookquisition",["ngRoute", "ngResource"])
.config(function($routeProvider){
  $routeProvider
    .when("/",{
      controller: "MainController",
      templateUrl: "templates/home.html"
    })
    .when("/post/:titulo",{
       controller: "PostController",
       templateUrl: "templates/post.html"
    })
    .when("/perfil",{
       controller: "PerfilController",
       templateUrl: "perfil.html"
    })
    .when("/posts/new",{
      controller: "NewPostController",
      templateUrl: "templates/post_form.html"
    })
      .otherwise({redirectTo:"/"});
});

