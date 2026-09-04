<!DOCTYPE html>
<html lang="en">
<head>
<title> Experiment 3 - Activity 1</title>
<meta charset="UTF-8">
</head>
<body>
<h1>MySQL Database Server Info</h1>
<?php
$DBConnect = mysqli_connect("localhost", "root", "");
echo "<p>MySQL version: " . mysqli_get_client_info() . "</p>\n";
if ($DBConnect == FALSE) {
echo "<p>Walang Koneksyon!!!!</p>\n";
} else {
    echo "<p>MySQL connection: " 
        . mysqli_get_host_info($DBConnect) . "</p>\n";
    echo "<p>MySQL protocol versions: " 
        . mysqli_get_proto_info($DBConnect) . "</p>\n";
    echo "<p>MySQL server versions: "
        . mysqli_get_server_info($DBConnect) . "</p>\n";
    mysqli_close($DBConnect);
}
?>
</body> </html>
