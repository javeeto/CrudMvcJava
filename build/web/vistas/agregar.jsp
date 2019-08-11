<%-- 
    Document   : agregar
    Created on : 10/08/2019, 12:24:28 PM
    Author     : javeeto
--%>

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
                <h1>Agregar Persona</h1>
                <form action="Controlador">
                    ID:<br>
                    <input class="form-control" type="text" name="txtDni"><br>
                    Nombres:<br>
                    <input class="form-control" type="text" name="txtNom"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
                </form>    
            </div>

        </div>
    </body>
</html>
