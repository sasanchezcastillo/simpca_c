<%-- 
    Document   : preparacion_de_lotes
    Created on : 12/08/2016, 01:14:10 PM
    Author     : Aprendiz: Deiby Brayan Diaz R. ADSI 954687
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
        <img src="ImagenesR/lote-1.png" style="width: 100%; height: 400px; position: absolute">
        <div class="wrapper-preparacion" >
            <div class="cont-general1">    
                <div  class="conte-imagenes">
                    <a href="QuemaFisica.jsp">
                        <input type="button" value="QUEMA FÍSICA" class="imput-general"/>
                        <img src="imagenes/quema_ficica.png" width="155" height="180" style="border-radius:200px; " />
                    </a>
                </div>
                <div class="conte-imagenes">
                    <a href="QuemaQuimica.jsp">
                        
                        <input type="button" value="QUEMA QUÍMICA" class="imput-general" />
                        <img src="imagenes/quema_quimica.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div> 
                <div class="conte-imagenes">
                    <a href="preparacionSuelo.jsp">
                        <input type="submit" value="PREPARACIÓN DE SUELO" class="imput-general" />
                        <img src="imagenes/nivelacion_suelo3.jpg" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div>
            </div>
            <div class="cont-general2">
                <div class="conte-imagenes">   
                    <a href="Cortamaleza.jsp">
                        <input type="submit" value="CORTA MALEZA" class="imput-general"/>
                        <img src="imagenes/corta.jpg" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>  
                <div class="conte-imagenes">
                    <a href="mantenimiento.jsp">
                        <input type="submit" value="MANTENIMIENTO" class="imput-general"/>
                        <img src="imagenes/mantenimiento.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>
            </div>  
            <input type="image" src="imagenes/BOTON FLECHA.png" width="72" height="60" onclick="location.href='Inicio.jsp'" /><br>
                <font color="#000000">REGRESAR</font>
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_pagina2" align="center">
            </div>
        </footer> 
    </body>
    
</html>
