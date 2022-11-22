<%-- 
    Document   : resultado
    Created on : 22 nov. 2022, 11:37:21
    Author     : yanni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <%
        String valor = request.getParameter("valor");
    %>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <h2>Resultado</h2> 
                    <div class="form-floating mb-3">
                        <input name="txtValor" value="<%=valor%>" type="text" class="form-control" id="floatingInput" placeholder="" disabled>
                        <label for="floatingInput">Resultado</label>
                    </div>
                </div>
            </div>  
    </body>
</html>
