<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Welcome</title>
  </head>
  <body>
    <div class="container mt-7">
    <h1 class="text-center">Welcome to Banglore Bus booking </h1>
    <br><br><br><br><br><br>
    <div class="row">
    <div class="col">
    <h1>Login</h1>
    <form action="userlogin" method="post">
    <label for="email">Enter your Email</label>
    <input name="email" type="email" required="true"><br><br>
        <label for="password">Enter your Password</label>
    <input name="password" type="password" required="true"><br><br>
    <button class="btn btn-primary" type="submit">Login</button>
    </form>
    <p>Not registered yet?<a href="userregister">Register</a></p>
    </div>
    <div class="col">
    <h1>Login as Admin</h1>
     <form action="adminlogin" method="post">
    <label for="email">Enter Username</label>
    <input name="username" type="text" required="true"><br><br>
        <label for="password">Enter password</label>
    <input name="password" type="password" required="true"><br><br>
    <button class="btn btn-primary" type="submit">Login</button>
    </form>
    </div>
    
    </div>
    
    </div>
  </body>
</html>