<html>
<head>

<title>Login Page</title>

</head>
<body>

<h1> Hello, this is the welcome page </h1>

<form name="Login" action="/ShoppingCart/cs" method="post">
	UserName : <input type="text" name="username"/>

	Password : <input type="password" name="password" />
	<input type="submit"  name="action" value="Login"/>
	<input type="reset" value ="Reset"/>
	<input type="hidden" name="page" value="login"/>
</form>
	
</body>

</html>