<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Experiment 2 Activity 1</title>
</head>
<body>
	<header>
		<img src="pic.jpg" alt="My Logo" height="200">
		<nav>
			My navigation here...
		</nav>
</header>
<main>
		<h1>Dr. Yanga College INC.</h1>
		<h2>College of Computer Studies</h2>
		<h2>Computer Engineering</h2>
		<?php
			$newMediaCluster = array("BSCPE", "BSCS", "BSIT");
			echo "Bachelor of Science in Computer Engineering - " . $newMediaCluster[0];
			echo "<br> Bachelor of Science in Computer Science - " . $newMediaCluster[1];
			echo "<br> Bachelor of Science in Information Technology - " . $newMediaCluster[0];
		?>
	</main>
	<article>
		<h2>Computer Engineering Program</h2>
		<section>
			<h3>Web Development Track</h3>
			<p>
			Web Development Track is a composed of ..
			</p>
		</section>
		<section>
			<h3>Audio Video Track</h3>
			<p>
				Audio Video Track is a composed of ...
			</p>
		</section>

	</article>
	<aside>
			<p>My Advertisment here...</p>
		</aside>
		<footer>
		<hr>
			copyright 2020 hello '95' -
		</footer>
</body>
</html>