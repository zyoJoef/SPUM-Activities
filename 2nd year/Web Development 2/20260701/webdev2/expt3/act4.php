<!DOCTYPE html>
<html lang="en">
    <head>
        <title> Experiment 3 Activity 4</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <header>
            <img src="Logo.png" alt="My Logo" height="200">
            <nav>
                My Navigation Here.....
            </nav>
        </header>
        <main>
            <h1>PHP Forms with MySQL</h1>
            <h2>Cognate3</h2>
            <h2>Laboratory Experiment 3</h2>
            <h2>Contact Us</h2>
            <form method="post" action="config.php">
                <table border="3">
                    <tr>
                        <th><label>First Name</label></th>
                        <td><input type="text" name="fname" id="fname"></td>
                    </tr>
                    <tr>
                        <th><label>Last Name:</label></th>
                        <td><input type="text" name="lname" id="lname"></td>
                    </tr>
                    <tr>
                        <th><label>E-mail:</label></th>
                        <td><input type="text" name="email" id="email"></td>
                    </tr>
                    <tr>
                        <th><label>Message:</label></th>
                        <td><textarea name="message" id="message" rows="4" cols="22"></textarea></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" name="submit" value="Submit">
                            <input type="reset" value="Clear">
                        </td>
                    </tr>
                </table>
            </form>
        </main>
        <footer>
            Copyright 2020 Hello '95
        </footer>
    </body>
</html>