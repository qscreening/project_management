$(document).ready(function() {

	$("#signIn").click(function() {
		var emailId = $("#userId").val();
		var password = $("#password").val();
		var passwordLength = $("#password").length;
		var atpos = emailId.indexOf("@");
		var dotpos = emailId.lastIndexOf(".");
		if (atpos < 1 || ( dotpos - atpos < 6 )) {
			alert("Please enter correct email ID (abcdef@xyz.com)");
			$("#userId").focus();
		}
		if (password === null || password === "") {
			alert("Please enter the password.");
		}
		if (passwordLength >= 5 && passwordLength <= 15) {
			alert('Login successful');
		}else{
			alert("Must be between 5 and 15");
		}
		$.ajax({
			url: "signin", 
			data: {
				email: emailId,
				Password: password        
			},
			method: "post",
			success: function(result) {
			     console.log(result);
				if(result){
					window.location.href = "home.html";
					alert("logged in");
				}
				else{
					alert("user not exist");
				}
			}, error:function() {
				alert("Error!!!")
			}
		});
	});

	$("#signUp").click(function () {
		var emailId = $("#emailId").val();
		var atpos = emailId.indexOf("@");
		var dotpos = emailId.lastIndexOf(".");
		if (atpos < 1 || ( dotpos - atpos < 6 )) {
			alert("Please enter correct email ID (abcdef@xyz.com)");
			$("#emailId").focus();
		}
		var password = $("#SignUpPswd").val();
		var confirmPassword = $("#confirmPassword").val();
		var compare = password.localeCompare(confirmPassword);
		if (compare === 0){
			alert("Passwords matched.");
		}
	});
	
});
