<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>New User Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
    <h1 class="text-center">New User Registration</h1>
    <form action="processregister" method="post">
    <label for="name">Enter your Name</label>
    <input name="name" type="text" required="true"><br><br>
    <label for="email">Enter your Email</label>
    <input name="email" type="email" required="true"><br><br>
        <label for="password">Enter password</label>
    <input name="password" type="password" required="true"><br><br>
    <button class="btn btn-primary" type="submit">Register</button>
    </form>
    </div>
  </body>
</html>