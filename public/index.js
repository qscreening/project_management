$(document).ready(function() {
	searchViaAjax();
});

function searchViaAjax() {
	$.ajax({url: "UserController", success: function(result){
		console.log(result);
	}});
}

