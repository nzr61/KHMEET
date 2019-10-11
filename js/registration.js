$(".close").click(
function()
	{
	var a=document.getElementById('window_a')
	$(a).css({"display" : "none"});	
	var w=document.getElementById('window_r')
	$(w).css({"display" : "none"});	
	var g=document.getElementById('gray')
	$(g).css({"display" : "none"}); 		
	}	
	);
$("#reg").click(function()
	{
	var w=document.getElementById('window_r')
	$(w).css({"display" : "block"});	
	var g=document.getElementById('gray')
	$(g).css({"display" : "block"}); 		
	}	
	);
$("#aut").click(function()
	{
	var w=document.getElementById('window_a');
	$(w).css({"display" : "block"});	
	var g=document.getElementById('gray');
	$(g).css({"display" : "block"}); 		
	}	
	);
$("#sab2").click(function()
{location.href='index_aut.html';
	})
