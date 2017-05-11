<%-- 
    Document   : Login
    Created on : 13/04/2017, 10:48:47
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Autenticação</h1>
        <hr>
        <a href="javascript:history.back()">Voltar</a><br>
        <!-- Method = post os dados não vão ser enviados via URL
        e sim dentro do corpo da requisição -->
        <form action="Autenticar" method="post">
            Nome: <input type="text" name="txtNome"><br>
            Senha: <input type="password" name="txtSenha"><br>
            <input type="submit" value="Logar">
            
        </form>
    </body>
</html>
