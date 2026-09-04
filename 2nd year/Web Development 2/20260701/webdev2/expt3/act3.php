<html lang="en">
    <head>
        <title> Experiment 3 Activity 3</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1>Create Table using Code</h1>
        <?php
        //Create New Connection
        $DBConnect = new mysqli("localhost", "root", "", "my1stdatabase");
        //Check New Connection
        if ($DBConnect ->connect_error){
            die("You are not Connceted!!!" . $DBConnect -> connect_error);
        }
        //Create New Table
        $myQueryName = "CREATE TABLE contacts
        (id INT (10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        Fname VARCHAR(30) NOT NULL,
        Iname VARCHAR(30) NOT NULL,
        email VARCHAR(30),
        message VARCHAR(100),
        reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP)";
        
        if ($DBConnect -> query($myQueryName) === TRUE) {
        echo "Your Database is Created Successfuly";
        }
        else {
        echo "Your Database is not Created:" . $DBConnect->error;
        }
        //Close Database
        $DBConnect->close();
        ?>
</body>
</html>