<%-- 
    Document   : PainelUsuario
    Created on : 13/04/2017, 10:52:42
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
        <h1>Painel Usuário</h1>
        <hr>
        <a href="javascript:history.back()">Voltar</a><br>
        <a href="Logout">Logout</a><br>
        <h3>Somente usuário Logado terá acesso</h3>
        Olá Sr(a). ${usuarioAutenticado} BOM DIA ou BOA NOITE!
    </body>
</html>
