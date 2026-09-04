<?php

include 'db.php';

if($_SERVER["REQUEST_METHOD"]=="POST"){

$fname=$_POST["firstname"];
$lname=$_POST["lastname"];
$email=$_POST["email"];
$subject=$_POST["subject"];
$message=$_POST["message"];

$sql="INSERT INTO contacts
(firstname,lastname,email,subject,message)

VALUES

(?,?,?,?,?)";

$stmt=$conn->prepare($sql);

$stmt->bind_param(
"sssss",
$fname,
$lname,
$email,
$subject,
$message
);

$stmt->execute();

echo "Message Sent!";

}

?>

<form method="POST">

<input name="firstname">

<input name="lastname">

<input name="email">

<input name="subject">

<textarea name="message"></textarea>

<button type="submit">

Send

</button>

</form>