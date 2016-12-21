<%-- 
    Document   : inicio_fumigas
    Created on : 6/10/2016, 08:04:09 PM
    Author     : LUIS
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <%
           HttpSession objSession = request.getSession();
           String lote = (String) objSession.getAttribute("lote");
           String nombre = (String) objSession.getAttribute("nombre");
           objSession.setAttribute("sesion","cerrar");
          
                if(nombre == null){
                    if(lote == null){
                        response.sendRedirect("Inicio_sesion.jsp");
                    }
                }
  %>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="imagenes/favicon.ico" rel="icon"/>
        <title>Inicio_Fumigas</title>
        <link href="css/inicio_fumigas.css" rel="stylesheet" type="text/css">        
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
        <img src="ImagenesR/cosecha-1.png" style="width: 100%; height: 400px; position: absolute">
        <div class="wrapper-preparacion" >
            <div class="cont-general1">
                <div class="conte-imagenes">
                    <a href="fumigas1.jsp">
                        <input style="font-family: Times New Roman;" type="button" value="FUMIGA 1" class="imput-general" />
                        <img src="imagenes/fumiga 1.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div> 
                <div class="conte-imagenes">
                    <a href="fumigas2.jsp">
                        <input style="font-family: Times New Roman;" type="submit" value="FUMIGA 2" class="imput-general" />
                        <img src="imagenes/fumiga 2.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div>
            </div>
            <div class="cont-general2">
                <div class="conte-imagenes">   
                    <a href="fumigas3.jsp">
                        <input style="font-family: Times New Roman;" type="submit" value="FUMIGA 3" class="imput-general"/>
                        <img src="imagenes/fumiga 3.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>  
                <div class="conte-imagenes">
                    <a href="fumigas4.jsp">
                        <input style="font-family: Times New Roman;" type="submit" value="FUMIGA 4" class="imput-general"/>
                        <img src="imagenes/fumiga 4.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>
            </div>    
            <a href="cosecha.jsp">
                <input type="image" src="imagenes/BOTON FLECHA.png" width="72" height="60" /><br>
                <font color="#000000">REGRESAR</font>
            </a>
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaIF" align="center">
            </div>
        </footer> 
    </body>
    
</html>

