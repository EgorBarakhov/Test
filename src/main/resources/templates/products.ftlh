<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/products" method="post">
    <input name="name" type="text" placeholder="NAME">
    <input name="description" type="text" placeholder="DESCRIPTION">
    <input name="price" type="number" placeholder="PRICE">
    <#list tag_list as tag>
        <label>
            <input type="checkbox" name="${tag.name}">${tag.name}
        </label>
    </#list>
    <input type="submit" value="POST NEW PRODUCT">
</form>
<table>
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Tags</th>
    </tr>
    <#list product_list as product>
        <tr>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td></td>
        </tr>
    </#list>
</table>
</body>
</html>