<?php
// Connect to Database
$DBConnect = mysqli_connect("localhost", "root", "", "my1stdatabase");

if ($DBConnect->connect_error) {
    die("You are not connected to Database!!! " . $DBConnect->error);
}

// Get the contact details
if (isset($_POST["submit"])) {

    $fname = $DBConnect->real_escape_string($_POST['fname']);
    $lname = $DBConnect->real_escape_string($_POST['lname']);
    $email = $DBConnect->real_escape_string($_POST['email']);
    $message = $DBConnect->real_escape_string($_POST['message']);

    // Save to Database
    $sql = "INSERT INTO contacts (fname, lname, email, message)
            VALUES ('$fname', '$lname', '$email', '$message')";

    if (!$result = $DBConnect->query($sql)) {
        die("Error Saving to Database [" . $DBConnect->error . "]");
    } else {
        header("Location: act4thankyou.php");
        exit();
    }
}
?>