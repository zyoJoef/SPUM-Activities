<!DOCTYPE html>
<html>
<head>
    <title>Cadorna's Portfolio | Contact</title>
        <link rel="stylesheet" href="./style.css">
        <link rel="icon" type="image/jpg" href="pictures/logo.jpg">
</head>

<header class="header">

    <div class="header-left">
        <img src="pictures/logo.jpg"
        alt="Portfolio Logo"
        class="logo">

        <h1>Cadorna's Portfolio</h1>
    </div>

    <nav class="nav-box">
        <a href="index.php">Home</a>
        <a href="about.php">About</a>
        <a href="project.php">Project</a>
        <a href="contact.php">Contact</a>
    </nav>

</header>

<h2 class="page-title">Contact</h2>

<section class="contact-card">

<form
id="contactForm"
action="process/save_contact.php"
method="POST">

<div class="name-row">

<div>
    <label>First Name</label>
    <input type="text" name="firstname" required>
</div>

<div>
    <label>Last Name</label>
    <input type="text" name="lastname" required>
</div>

</div>
    <label>Email Address</label>
    <input type="email" name="email" required>

    <label>Subject</label>
    <input type="text" name="subject" required>
    
    <label>Message</label>
    <textarea name="message" required></textarea>

<div class="counter">
    <span id="counter">0 / 500</span>
</div>

<button type="submit">Send Message</button>

</form>

<?php

if(
isset(
$_GET["success"]
)
){

echo
"<p>
Message Sent Successfully
</p>";

}

?>

</section>

<script>

const form = document.getElementById("contactForm");

const button = document.getElementById("sendBtn");

const message = document.getElementById("message");

const counter = document.getElementById("counter");

function validateForm(){

const fields = [

firstname,
lastname,
email,
subject,
message

];

const complete =
fields.every(
f =>
f.value
.trim()
!== ""
);

const validEmail =
email.checkValidity();

button.disabled =
!(
complete
&&
validEmail
);

}

message.addEventListener(
"input",
()=>{

counter.textContent =
`${message.value.length} / 500`;

validateForm();

}
);

form.addEventListener(
"input",
validateForm
);

form.addEventListener(
"submit",

function(e){

e.preventDefault();

if(
!form.checkValidity()
){

form.reportValidity();

return;

}

const body =

`First Name:
${firstname.value}

Last Name:
${lastname.value}

Email:
${email.value}

Message:

${message.value}`;

const gmail =

`https://mail.google.com/mail/?view=cm&fs=1&to=2024-0014@spumanila.edu.ph&su=${
encodeURIComponent(
subject.value
)
}&body=${
encodeURIComponent(
body
)
}`;

form.reset();

counter.textContent =
"0 / 500";

button.disabled =
true;

}

);

</script>

<br>

<?php include 'includes/footer.php'; ?>

</body>
</html>