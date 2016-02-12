$(document).ready(function(){
	$("#logout").click(function(){
		alert("enter into + button block");
		$.ajax({
			url:"/logout",
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
    
