<%-- 
    Document   : seleccioneLote
    Created on : dic 2, 2016, 9:03:19 p.m.
    Author     : USUARIO
--%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controladores.lote" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>Seleccione Lote</title>
    </head>
    <body class="fondoS">
        <div id="toplogo">
        <h1 id="logo">
            <a href="#" title="Coagronorte-Cooperativa Agropecuaria Norte de Santander"></a>
        </h1>
    </div>
        <header>
                <section>
                        <nav>
                            <ul>
                                <li><a href="#">Coagronorte</a></li>
                                <li><a href="#">Productos</a></li>
                                <li><a href="#">Servicios</a></li>
                                <li><a href="#">Blog</a></li>
                                <li><a href="#">Contacto</a></li>
                                <li><a href="#"></a></li>  
                            </ul>
                        </nav>
                </section>
        </header>
        <img src="ImagenesR/Sesion-1.png" style="width: 100%; height: 400px; position: absolute">
        
        <div class="contenedor-formulario">
            <div class="wrap">
                <form  class="formulario" name="formulario_registro" action="Lotes" method="post">

                    <h1 class="titulo"> Seleccione Un Lote Para consultar </h1> 

                    <%ArrayList<String> lista = (ArrayList<String>) request.getAttribute("lista");
                        for (String valor : lista) {
                    %>
                    <div class="input-group radio">
                        <br>
                        <input type="radio" id="<%=valor%>"  name="numlote"  required="'<%=valor%>' "onclick="value = '<%=valor%>'"/>

                        <label  for="<%=valor%>"><%=valor%></label>

                        <%
                                String lote = request.getParameter(valor);
                            }
                        %>


                   
                        <input type="submit" id="siguiente" value="CONTINUAR" name="siguiente1" /> 
                    <input type="button" id="siguiente" value="VOLVER"  onclick="location.href = 'administrador/BootstrapMenuAdministrador.jsp'" /> 
                    </div>
                </form>            
            </div>
        </div
        <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaSesion" align="center">
                </div>
        </footer>
    </body>
</html>
