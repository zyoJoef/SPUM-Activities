<?php

include "../config/database.php";

if ($_SERVER["REQUEST_METHOD"] === "POST") {

$firstname = trim($_POST["firstname"]);
$lastname  = trim($_POST["lastname"]);
$email     = trim($_POST["email"]);
$subject   = trim($_POST["subject"]);
$message   = trim($_POST["message"]);

$stmt = mysqli_prepare(
$conn,
"INSERT INTO contacts
(firstname, lastname, email, subject, message)
VALUES (?, ?, ?, ?, ?)"
);

if (!$stmt) {
die("Prepare failed: " . mysqli_error($conn));
}

mysqli_stmt_bind_param(
$stmt,
"sssss",
$firstname,
$lastname,
$email,
$subject,
$message
);

if (mysqli_stmt_execute($stmt)) {

header("Location: ../contact.php?success=1");
exit();

} else {

echo "Insert failed: " . mysqli_error($conn);

}

mysqli_stmt_close($stmt);

}

mysqli_close($conn);

?>