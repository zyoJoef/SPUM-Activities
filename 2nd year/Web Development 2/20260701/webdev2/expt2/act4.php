<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Experiment Activity 4</title>
	<?php
			function ifStatement($age){
				if ((int)$age < 60)
					echo "<p>You are not senior citizen!!!</p>";
			}
			function ifelseStatement($age){
				if ((int)$age < 60)
					echo "<p>You are not senior citizen!!!</p>";
				else
					echo "<p>Welcome!!! You are a senior citizen!!!</p>";
			}			
			function ifelseifStatement($age){
				if ((int)$age < 13)
					echo "<p>You are still a child!!!</p>";
				elseif ((int)$age < 20)
					echo "<p>You are still a teenager!!!</p>";
				elseif ((int)$age < 60)
					echo "<p>You are not senior citizen!!!</p>";
				else
					echo "<p>Welcome!!! You are a senior citizen!!!</p>";
			}
	?>	

</head>
<body>
	<header>
		<img src="pic.jpg" alt="My Logo" height="200">
		<nav>
			My navigation here...
		</nav>
		<h1>Condition Statements in PHP</h1>
		<h2>COGNATE423</h2>
		<h2>Laboratory Experiment 2</h2>
		<h2>Senior Citizen Check Form</h2>
	</header>
	<main>
	<form method="post" action="act4.php">
	<table border="3">
		<tr>
			<th><label>First Name:</label></th>
			<td><input type="text" name="fname" id="fname"></td>
		</tr>
		<tr>
			<th><label>Last Name:</label></th>
			<td><input type="text" name="lname" id="lname"></td>
		</tr>
		<tr>
			<th><label>Age:</label></th>
			<td><input type="text" name="age" id="age"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit">
				<input type="reset" value="Clear">
			</td>
		</tr>
	</table>
	</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $fname = $_POST['fname'];
    $lname = $_POST['lname'];
    $age = $_POST['age'];

    if ($fname == "" || $lname == "" || $age == "") {
        echo "<br><br>Please fill-up the form above!!!";
    } else {

        echo "<p>Good Day!!! $fname $lname</p>";
        echo "<p>Your age is $age</p>";

        echo "<hr><h3>PHP if Statement</h3>";
        ifStatement($age);

        echo "<hr><h3>PHP if-else Statement</h3>";
        ifelseStatement($age);

        echo "<hr><h3>PHP if-elseif Statement</h3>";
        ifelseifStatement($age);
    }
}
?>

</main>

<footer>
<hr>
copyright 2020 hello '95
</footer>

</body>
</html>