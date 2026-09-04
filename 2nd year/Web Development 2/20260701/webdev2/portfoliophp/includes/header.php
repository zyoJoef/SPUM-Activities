<?php

$isActivity =
strpos(
$_SERVER['PHP_SELF'],
'activity/'
)!==false;

$path =
$isActivity
?
'../'
:
'';

?>

<header class="header">

    <!-- FOR THE CLICKABLE LOGO AND TITLE -->

    <a href="<?= $path ?>index.php" class="home-link">
        <div class="header-left">
            <img src="<?= $path ?>pictures/logo.jpg" alt="Portfolio Logo" class="logo">
            <h1>Cadorna's Portfolio</h1>
        </div>
    </a>

    <nav class="nav-box" id="navMenu">
        <a href="<?= $path ?>index.php">Home</a>
        <a href="<?= $path ?>about.php">About</a>
        <a href="<?= $path ?>project.php">Project</a>
        <a href="<?= $path ?>contact.php">Contact</a>
    </nav>

</header>

<script>

function toggleMenu(){

document
.getElementById(
"navMenu"
)
.classList
.toggle(
"active"
);

}

</script>