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
		<?php
				$fname = $_POST['fname'];
				$lname = $_POST['lname'];
				$email = $_POST['email'];
				$message = $_POST['message'];
				
				echo "<h2>Thank you!!! <u>$fname";
				echo " $lname </u></h2>";
				echo "<p>Have you recorded your email adress as shown here. <h3><u>$email</u></h3></p>";
				echo "Rest assured to recieve our response regarding your message within 24 hours.";
		?>
		
	</main>	
	<footer>
		<hr>
			copyright 2020 hello '95'
		</footer>
</body>
</html>