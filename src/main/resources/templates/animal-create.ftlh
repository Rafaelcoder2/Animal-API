<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add New Animal</title>
</head>
<body>
<h1>${title}</h1>
<#assign a = animal>
<form id="new-animal" action="/animals/new" method="post">
    <input type="text" id="name" name="name" value="${a.name!}" placeholder="Name"/>
    <input type="number" id="age" name="age" value="${a.age!}" placeholder="Age"/>
    <input type="text" id="description" name="description" value="${a.description!}" placeholder="Description"/>
    <button type="submit" class="btn btn-primary">Save</button>
    <a href="/animals/all" class="btn btn-outline-danger">Cancel</a>
</form>


</body>
</html>