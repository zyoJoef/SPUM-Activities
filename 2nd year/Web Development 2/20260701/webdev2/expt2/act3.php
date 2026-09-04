<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Experiment 2 - Activity 3</title>
</head>
<body>
	<header>
		<img src="pic.jpg" alt="My Logo" height="200">
		<nav>
			My navigation here...
		</nav>
	</header>
	<main>
		<h1>PHP Forms</h1>
		<h2>COGNATE423</h2>
		<h2>Laboratory Experiment 2</h2>
		<h2>Contact Us</h2>
		<form method = "post" action="act3thankyou.php">
		<table border = "3">
			<tr>
				<th><label>First Name:</label></th>
				<td><input type="text" name="fname" id="fname"></td>
			</tr>
			<tr>
				<th><label>Last Name: </label></th>
				<td><input type="text" name="lname" id="lname"></td>
			</tr>
			<tr>
				<th><label>Email:</label></th>
				<td><input type="email" name="email" id="email"></td>
			</tr>
			<tr>
				<th><label>Message: </label></th>
				<td><textarea name="message" id="message" rows="4" cols "22"></textarea></td>
			</tr>
			<tr>
				<td colspan = "2">
					<input type="submit" value "Submit" >
					<input type="reset" value = "Clear">
				</td>
			</tr>
		</table>
		</form>
		
	</main>
	<footer>
		<hr>
			copyright 2020 hello '95'
		</footer>
</body>
</html>