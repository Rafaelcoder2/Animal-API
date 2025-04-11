<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Animal</title>
</head>
<body>
<h1>${title}</h1>
<#assign a = animal>
<form id="update-animal" action="/animals/update/${a.animalId?c}" method="post">
    <input type="text" id="animalId" name="animalId" value="${a.animalId?c}" readonly/>
    <input type="text" id="name" name="name" value="${a.name}" placeholder="Name"/>
    <input type="number" id="age" name="age" value="${a.age}" placeholder="Age"/>
    <input type="text" id="description" name="description" value="${a.description}" placeholder="Description"/>
    <button type="submit" class="btn btn-primary">Save</button>
    <a href="/animals/${a.animalId?c}" class="btn btn-outline-danger">Cancel</a>
</form>

</body>
</html>