<!DOCTYPE html> 
<html>
<head>
<meta charset="utf-8">
 <title>Podchives - Home</title> 
 <style>
  @import url(ssheet.css); 
 </style>
<div class="row">
<h1><img class="mainlogo" src="podchives-logos/homelogo.png" alt="logo"></h1>

<nav>
 <ul>
  <li><a href="seasonmenu.html" target="_blank">TRENDING</a></li>
  <li><a href="about.html" target="_blank">LISTS</a></li>
  <li><a href="requests.html" target="_blank">BLOG</a></li>
  <li><a href="conversions.html" target="_blank">DISCOVER</a></li>
  <li><a href="archives.html" target="_blank"><img class ="icons" src="magnifying-glass.png" alt="logo"></a></li>
  <li><a href="veganmenu.html" target="_blank"><img class ="icons" src="icon.png" alt="logo"></a>
 </ul>
</nav>
</head>
</div>
<body>
<?php

if (empty($_POST["username"])) {
    die("username is required");
}
if (empty($_POST["username"])) {
    die("Password is required");
}
if (empty($_POST["firstname"])) {
    die("Name is required");
}
if (empty($_POST["lastname"])) {
    die("Name is required");
}
if (strlen($_POST["password"]) < 8) {
    die("Password must be at least 8 characters");
}
$password_hash = password_hash($_POST["password"], PASSWORD_DEFAULT);

// get the post records
$username = $_POST['username'];
$password = $_POST['password'];
$firstname = $_POST['firstname'];
$lastname = $_POST['lastname'];
$email = $_POST['email'];

$con = mysqli_connect('localhost', 'root', 'root1234','database_newaccount');

if(mysqli_connect_errno())
{
	die("connection error: " .mysqli_connect_error());
}

echo "Account has been created.";

$sql = "INSERT INTO user (username, password, firstname, lastname, email) VALUES (?,?,?,?,?)";

$stmt = mysqli_stmt_init($con);

if(! mysqli_stmt_prepare($stmt, $sql)){
die(mysqli_error($conn));
}

mysqli_stmt_bind_param($stmt, "sssss", $username, $password, $firstname, $lastname, $email);

?>

<a href="inhome.html"><button type="button">Click Here to continue</button></a>
</body>
</html>
