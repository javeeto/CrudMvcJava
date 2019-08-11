<%-- 
    Document   : editar
    Created on : 10/08/2019, 12:24:38 PM
    Author     : javeeto
--%>

<%@page import="modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <%
                    PersonaDAO dao = new PersonaDAO();
                    int id = Integer.parseInt((String) request.getAttribute("idper"));
                    Persona p = (Persona) dao.list(id);
                %>
                <h1>Modificar Persona</h1>
                <form action="Controlador">
                    ID:<br>
                    <input class="form-control" type="text" name="txtDni" value="<%= p.getDni()%>"><br>
                    Nombres:<br>
                    <input class="form-control" type="text" name="txtNom" value="<%= p.getNombre()%>""><br>
                    <input type="hidden" name="txtId" value="<%= p.getId()%>"><br>
                    <input  class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>
                </form> 
            </div>

        </div>
    </body>
</html>
