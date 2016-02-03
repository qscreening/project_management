$(document).ready(function() {
	searchViaAjax();
});

function searchViaAjax() {
	$.ajax({url: "projectmanagement", success: function(result){
		console.log(result);
	}});
}
