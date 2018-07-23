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
    .when("/posts/new",{
      controller: "NewPostController",
      templateUrl: "templates/post_form.html"
    })
    .when("/",{
      controller: "MainController",
      templateUrl: "libro.html"
    })

    .when("/post/:titulo",{
       controller: "PostController",
       templateUrl: "libro.html"
    })
      .otherwise({redirectTo:"/"});

});
