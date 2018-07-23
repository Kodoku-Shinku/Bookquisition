function iniciarSesion(googleUser) {
	var profile = googleUser.getBasicProfile();
	window.location.replace("bookInicio.html");
}
function getUsuario(googleUser) {
	var auth2 = gapi.auth2.getAuthInstance();
	var profile = auth2.currentUser.get().getBasicProfile();
	return profile;
}
function cerrarSesion() {
	var auth2 = gapi.auth2.getAuthInstance();
	auth2.signOut().then(function() {
		window.location.replace("index.html");
	});
}

function onLoad() {
	gapi.load('auth2', function() {
		gapi.auth2.init();
	});
}