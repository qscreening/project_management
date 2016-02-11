$(document).ready(function() {

	$("#signInForm").submit(function(e) {
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
			url: "/SignIn", 
			data: {
				userId: emailId,
				Password: password        
			},
			method: "post",
			success: function(result) {
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
		e.preventDefault();
	});

	$("#signUpForm").submit(function(e) {
		var fullName = $("#fullName").val();
		var emailId = $("#emailId").val();
		var password = $("#SignUpPswd").val();
		var confirmPassword = $("#confirmPassword").val();
		var atpos = emailId.indexOf("@");
		var dotpos = emailId.lastIndexOf(".");
		if (atpos < 1 || ( dotpos - atpos < 6 )) {
			alert("Please enter correct email ID (abcdef@xyz.com)");
			$("#emailId").focus();
		}
		
		var compare = password.localeCompare(confirmPassword);
		if (compare === 0){
			alert("Passwords matched.");
		}
		$.ajax({
			url: "/SignUp", 
			data: {
				fName: fullName,
				email: emailId,
				pswd: password        
			},
			method: "post",
			success: function(status) {
				if(status){
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
		e.preventDefault();
	});
});
