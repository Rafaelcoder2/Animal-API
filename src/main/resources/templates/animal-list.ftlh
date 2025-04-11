<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Pictures</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

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
    <input type="submit" value="Pictures"/>
</form>
<form action="file:///C:/Users/rafae/Downloads/animals/details.html" method="POST">
    <input type="submit" value="Information"/>
</form>
<form action="file:///C:/Users/rafae/Downloads/animals/about.html" method="POST">
    <input type="submit" value="About Us"/>
</form>

<h1>Pictures</h1>
<body>


<#list animal as a>
<h2>${a.name}</h2>
<p>${a.description}</p>
<img src="/images/${a.animalImg}" width="500" height="300"/>
</#list>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>



</body>
</html>

<!--

<h1> African Lion</h1>
<img src=https://www.nkuringosafaris.com/wp-content/uploads/2024/05/lion-pride-safari-kenya-___.jpg width="500"
     height="300">
<p> This animal is the African Lion. They are seen most in the eastern and southern Africa area and are known<br>
    for being at the top of the food chain being the top predator in Africa. They are known for being the biggest cats
    and<br>
    the most fierce hunters in Africa.</p>
<h1> African Elephant</h1>
<img src=https://www.nkuringosafaris.com/wp-content/uploads/2022/06/elephants-lake-manyara-tanzania-scaled.jpg
     width="500" height="300">
<p> This animal is the African Elephant. The elephant is the largest mammal on earth and are usually seen in the
    savannas<br>
    and forests in Africa. They are know for there distinct features such as their tusks and big ears.</p>
<h1> Mountain Gorilla</h1>
<img src=https://www.nkuringosafaris.com/wp-content/uploads/2024/04/mountain_gorilla_primate.jpg width="500"
     height="300">
<p> This animal is the Mountain Gorilla. They are known for being very big and having immense strength. They are<br>
    usually seen in the forests of central Africa but are known to be dificult to spot.</p>
<h1> Rhinoceros</h1>
<img src=https://www.nkuringosafaris.com/wp-content/uploads/2020/06/africa-safari-rhinos.jpg width="500" height="300">
<p> This animal is the Rhinoceros. They are known for being a very powerful animal with their distinct feature of horns.<br>
    They are also herbivores and have poor eyesight but have a great sense of hearing and smell to compensate.</p>-->

