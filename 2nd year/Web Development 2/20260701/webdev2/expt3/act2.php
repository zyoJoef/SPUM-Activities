<!DOCTYPE html>
<html lang="en">
<head>
<title>Experiment 3 - Activity 2</title>
<meta charset="UTF-8">
</head>
<body>
<h1>Create Database using code</h1>
<?php
//Create New Connection
$DBConnect = new mysqli ("localhost","root", "");
//Check new Connection

if($DBConnect->connect_error) {
die ("You are not connected!!!" . $DBConnect->connect_error);
}
//Create New Database
$myQueryName = "CREATE DATABASE my1stDatabase";
if($DBConnect->query($myQueryName) === TRUE) {
    echo " Your Databese is Created Successfully";
}
else{
    echo "Your Database is not created : " . $DBConnect->error;
}
//Close Database
$DBConnect->close ();
?>
</body>
</html>