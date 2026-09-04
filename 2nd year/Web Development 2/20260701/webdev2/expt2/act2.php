<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Experiment 2 Activity 2</title>
	<?php
			function welcome($name){
				echo "<p>Welcome to Cognate $name</p>";
			}
			function addTwoNumbers ($x,$y) {
				$a= $x + $y;
				echo "The sum of $x and $y is " . $a;
			}
			function randomNumbers10(){
				$x = rand(1,10);
				echo "<p>Your lucky number from 1 to 10 is: <h1><u>$x</u></h1></p>";
				echo "Click refresh button of the browser for your next lucky number. ";
			}
			function randomNumbers100(){
				$x = rand(1,100);
				echo "<p>Your lucky number from 1 to 100 is: <h1><u>$x</u></h1></p>";
				echo "Click refresh button of the browser for your next lucky number. ";
			}
	?>
</head>
<body>
<header>
		<img src="pic.jpg" alt="My Logo" height="200">
		<nav>
			My navigation here...
		</nav>
	</header>
	<main>
		<h1>Function in PHP</h1>
		<h2>COGNATE423</h2>
		<h2>Laboratory Experiment 2</h2>
		<?php
			$name = "Joeffrey Cadorna";
			welcome($name);
			$num1 = 23;
			$num2 = 17;
			addTwoNumbers($num1,$num2);
			randomNumbers10();
			randomNumbers100();
		?>
	</main>
	<footer>
		<hr>
			copyright 2020 hello '95'
		</footer>
</body>
</html>