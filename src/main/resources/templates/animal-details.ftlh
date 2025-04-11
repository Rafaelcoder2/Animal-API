<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title> Information</title>
</head>
<style>
    body {
     background-color: linen;
    }

    h1 {
    color: maroon;
    margin-left: 40px;
    }

</style>
<form action="file:///C:/Users/rafae/Downloads/animals/index.html" method="POST">
    <input type="submit" value ="Pictures"/>
</form>
<form action="file:///C:/Users/rafae/Downloads/animals/details.html" method="POST">
    <input type="submit" value ="Information"/>
</form>
<form action="file:///C:/Users/rafae/Downloads/animals/about.html" method="POST">
    <input type="submit" value ="About Us"/>
</form>

<h1> Information</h1>
<body>
<h2>${animal.name}</h2>
<p>${animal.description}</p>
<img src="${animal.animalImg}" alt="Animal Image" width="500" height ="300"/>

</body>
</html>