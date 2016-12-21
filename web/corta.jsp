<%-- 
    Document   : corta
    Created on : 04-ago-2016, 15:07:23
    Author     : DAYA
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/css1preparacion de lote.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>Preparacion de Lotes</title>

        <%
            HttpSession objSession = request.getSession();
            String nombre = (String) objSession.getAttribute("nombre");
            String lote = (String) objSession.getAttribute("lote");
            objSession.setAttribute("sesion","cerrar");
          
                if(nombre == null){
                    if(lote == null){
                        response.sendRedirect("Inicio_sesion.jsp");
                    }
                }

        %>
    </head>

    <body class="fondo">
        <div id="toplogo">
            <h1 id="logo">
                <a href="Inicio.jsp" title="Coagronorte-Cooperativa Agropecuaria Norte de Santander"></a>
            </h1>
        </div>
        <header>
            <section>
                <nav>
                    <ul>
                        <li><a href="#">Coagronorte</a>
                        <li><a href="#">Productos</a>
                        <li><a href="#">Servicios</a>
                        <li><a href="#">Blog</a>
                        <li><a href="#">Contacto </a>
                        <li><a href="#"><%=nombre%></a>
                        <li><a href="Session">Cerrar Sesion</a>
                    </ul>
                </nav>
            </section>
        </header>
        <img src="ImagenesR/corta-1.png" style="width: 100%; height: 400px; position: absolute">
        <div class="wrapper-preparacionCorta" >
            <div class="cont-general1">    
                <div  class="conte-imagenes1">
                    <a href="corta_bultos.jsp">
                        <input type="button" value="CORTA POR BULTOS" class="imput-general"/>
                        <img src="imagenes/CORTA BULTOS.png" width="155" height="180" style="border-radius:200px; " />
                    </a>
                </div>
                <div class="conte-imagenes2">
                    <a href="corta_granel.jsp">
                        <input type="submit" value="CORTA POR GRANEL" class="imput-general" />
                        <img src="imagenes/CORTA GRANEL.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div>
            </div>
            <div class="cont-general2Corta">
                <div class="conte-imagenesCorta">
                    <a href="liquidacion.jsp">
                        <input type="submit" value="LIQUIDACION" class="imput-general"/>
                        <img src="img-con/u61.jpg" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>
            </div>    
            <a href="Inicio.jsp">
                <input type="image" src="imagenes/BOTON FLECHA.png" width="72" height="60" /><br>
                <font color="#000000">REGRESAR</font>
            </a>
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaC" align="center">
            </div>
        </footer> 
    </body>
    
</html>
