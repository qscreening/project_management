$(document).ready(function() {

	$("#signIn").click(function() {
		var emailId = $("#userName").val();
		var password = $("password").val();
		var atpos = emailId.indexOf("@");
		var dotpos = emailId.lastIndexOf(".");
		if (atpos < 1 || ( dotpos - atpos < 6 )) {
			alert("Please enter correct email ID");
			$("#userName").focus();
		}
		if (password === null || password === "") {
			alert("Please enter the password.");
		}
		if (password.length >= 5 && password.length <= 15) {
			alert('Login successful');
		}else{
			alert("Must be between 5 and 15");
		}
	});

	$("#signUp").click(function () {
		var password = $("#SignUpPswd").val();
		var confirmPassword = $("#confirmPassword").val();
		var compare = password.localeCompare(confirmPassword);
		if (compare === 0){
			alert("Passwords match.");
		}
	});
	
});
