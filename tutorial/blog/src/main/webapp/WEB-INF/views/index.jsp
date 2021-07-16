<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>My Blog</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <a class="navbar-brand" href="/blog">Kelly's Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/user/login">login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user/join">sign in</a>
            </li>
        </ul>
    </div>
</nav>
<br>

<div class="container">

    <div class="card m-2">
        <div class="card-body">
            <h4 class="card-title">title</h4>
            <p class="card-text">contents</p>
            <a href="#" class="btn btn-primary">see details</a>
        </div>
    </div>

</div>

<div class="jumbotron text-center" style="margin-bottom:0">
    <p>Created by Kelly</p>
    <p>📞 010-9999-0000</p>
    <p>🏴 Seoul</p>
</div>

</body>
</html>
