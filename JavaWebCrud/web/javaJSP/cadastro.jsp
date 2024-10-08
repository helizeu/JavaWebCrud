<%-- 
    Document   : cadCliente
    Created on : 8 de out. de 2024, 11:32:00
    Author     : eliseu.lsilva2
--%>


<%@page import="javaBeans.Cliente"%>
<%
    Cliente cli = new Cliente();
    if ( cli.statusSQL == null )
    out.print("Tabela criada com sucesso");
    else
    out.print(cli.statusSQL);
   
   
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
