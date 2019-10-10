$("enter").onClick(function()
{
	var login=$('inputLogin').html().val();
	var pass="s1s2s3s4";
	var email="newgamernazar@gmail.com";
	alert(" "+login+" "+ pass+" "+ email);
	$.post(login,pass,email);
}
	)
$('nav_button').mouseenter(function()
{
	$(this).css({background-color:black,color:white;});
}
	)


	saveUser(login:Login,email:Email,password: Password,r_password: R_Password)

