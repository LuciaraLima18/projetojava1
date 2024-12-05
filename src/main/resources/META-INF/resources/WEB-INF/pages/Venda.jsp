<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SistemaDeVendas</title>
</head>
<body>


    <h1>Bem vindo!Faça sua compra:</h1>
    <form:form method="POST" modelAttribute="preco">
    <fieldset>
    <legend> Insira os dados que pede para realizar sua compra</legend>
    <label for="codigo">Coloque o código do produto:</label><br/>
    <input type="number" min="1" max="40" name="codigo" placeholder="Código do produto"/><br/>

    <label for="quantidade">Coloque a quantidade de produtos:</label><br/>
    <input type="number" min="1" step="1" name="quantidade" placeholder="Quantidade de produtos"/><br/>
    <button type="submit">Calcular</button>
    </fieldset>
    
    </form:form>
    <% if(request.getMethod().equals("POST")){%>

    <table border="1">
    <tr>
        <th>Dados da compra</th>
        <th>Valores</th>
    </tr>
    <tr>
        <th>Preço unitário</th>
        <th>${preco.valor}</th>
    </tr>
    <tr>
         <th>Preço total</th>
         <th>${valorTotal}</th>
     </tr>
    <tr>
          <th>Desconto</th>
          <th>${preco.desconto}%</th>
     </tr>
     <tr>
           <th>Valor Final</th>
           <th>${valorFinal}</th>
     </tr>
    </table>
    <%}%>
</body>
</html>
