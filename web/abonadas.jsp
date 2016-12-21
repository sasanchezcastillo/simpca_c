<!DOCTYPE html>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<title>Inicio Abonadas</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="imagenes/favicon.ico" rel="icon"/>
<link href="css/CssAbonadas.css" rel="stylesheet" type="text/css"/>
<link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
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
                <div  class="conte-imagenes">
                    <a href="pre-abonada.jsp">
                        <input type="button" value="PRE-ABONADA" class="imput-general"/>
                        <img src="ImagenesAbonadas/u58.png" width="155" height="180" style="border-radius:200px; " />
                    </a>
                </div>
                <div class="conte-imagenes">
                    <a href="abonada1.jsp">
                        <input type="button" value="ABONADA 1" class="imput-general" />
                        <img src="ImagenesAbonadas/u58.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div> 
                <div class="conte-imagenes">
                    <a href="abonada2.jsp">
                        <input type="submit" value="ABONADA 2" class="imput-general" />
                        <img src="ImagenesAbonadas/u58.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div>
            </div>
            <div class="cont-general2">
                <div class="conte-imagenes">   
                    <a href="abonada3.jsp">
                        <input type="submit" value="ABONADA 3" class="imput-general"/>
                        <img src="ImagenesAbonadas/u64.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>  
                <div class="conte-imagenes">
                    <a href="abonada4.jsp">
                        <input type="submit" value="ABONADA 4" class="imput-general"/>
                        <img src="ImagenesAbonadas/u64.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>
                <div class="conte-imagenes">
                    <a href="resale.jsp">
                        <input type="submit" value="RESALE" class="imput-general"/>
                        <img src="ImagenesAbonadas/u64.png" width="155" height="180" style="border-radius:200px;" />
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
            <div id="pie_paginaP" align="center">
            </div>
        </footer> 
    </body>
    
</html>
