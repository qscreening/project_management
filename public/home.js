$(document).ready(function(){
	$("#btn3").click(function(){
		alert("enter into + button block");
	$.ajax({
		url:"sesClose",
		method:"post",
		success:function(result){
			if(result){
				window.location.href="index.html";
			}
			else{
				window.location.href="home.html";
			}
		},error:function(){
				alert("error occured")
  				}	
		});
	});
});
    
