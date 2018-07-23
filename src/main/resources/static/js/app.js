angular.module("Bookquisition",["ngRoute", "ngResource"])
.config(function($routeProvider){
  $routeProvider
    .when("/",{
      controller: "MainController",
      templateUrl: "templates/home.html"
    })

        .when("/elements",{
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
        .when("/editarPerfil",{
       controller: "PerfilController",
       templateUrl: "editarPerfil.html"
    })
    .when("/biblioteca",{
       controller: "BiblioController",
       templateUrl: "libro.html"
    })
        .when("/agregarLibro",{
       controller: "AddLibroController",
       templateUrl: "agregarLibro.html"
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
