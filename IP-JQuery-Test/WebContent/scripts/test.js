$(document).ready(function() {
	"use strict"
	
	$(document).on('click', '#remove', function() {
		$('div').remove();
	});
	
	$(document).on('click', '#add', function() {
		var input = $('<input>');
		$('span span').append(input);
		input.val('auto');
	});
	
	$(document).on('click', '.autofill-action', function() {
		$('.autofill-data').each(function() {
			var attr = $(this).attr('data-autofill-value');
			$(this).append(attr);
		});
	});
});