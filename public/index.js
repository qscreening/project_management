$(document).ready(function() {
	searchViaAjax();
});

function searchViaAjax() {
	$.ajax({url: "project_managementController", success: function(result){
		console.log(result);
	}});
}
