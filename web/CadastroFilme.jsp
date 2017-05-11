<%-- 
    Document   : CadastroFilme
    Created on : 11/05/2017, 11:19:19
    Author     : sala308b
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
        <div class="erro">${msgErro}</div>
        <!-- Method = post os dados não vão ser enviados via URL
        e sim dentro do corpo da requisição -->
        <form action="CadastrarUsuario" method="post">
            <!--Perfil pode escrever Administrador ou Funcionario-->
            Perfil:
            <select>
                <option value="Admim">Administrador</option>
                <option value="Func">Funcionário</option>
            </select><br>
            Nome: <input type="text" name="txtNome" value="${usuario.login}"><br>
            Login: <input type="text" name="txtLogin" value=""><br>
            Senha: <input type="password" name="txtSenha"><br>
            <input type="submit" value="Logar">
            
        </form>
    </body>
</html>
