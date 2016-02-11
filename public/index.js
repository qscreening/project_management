$(document).ready(function() {

	var atPos = 0;
	var dotPos = 0;

	$("#signInForm").submit(function(e) {

		var emailId = $("#userId").val();
		var password = $("#password").val();
		var passwordLength = $("#password").length;

		atPos = emailId.indexOf("@");
		var afterAt = emailId.split("@");
		dotPos = afterAt[1].lastIndexOf(".");
		dotPos = (++dotPos) + atPos;
		if (atPos === 0 || dotPos === ++atPos || dotPos < atPos) {
			alert("Please, Enter a valid email ID (abcdef@xyz.com)");
		}

		if (passwordLength <= 5 && passwordLength >= 15) {
			alert("Please enter the password (Min 5 & max 15 Charaters)");
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
				}
				else{
					alert("Invalid User ID or Password!!");
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

		atPos = emailId.indexOf("@");
		var afterAt = emailId.split("@");
		dotPos = afterAt[1].lastIndexOf(".");
		dotPos = (++dotPos) + atPos;
		if (atPos === 0 || dotPos === ++atPos || dotPos < atPos) {
			alert("Please, Enter a valid email ID (abcdef@xyz.com)");
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
