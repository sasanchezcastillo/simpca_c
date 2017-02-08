<%-- 
    Document   : cosecha
    Created on : 11/08/2016, 01:53:54 PM
    Author     : LENOVO
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
    <title>Cosecha</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="imagenes/favicon.ico" rel="icon"/>
    <link href="css/estilos_cosecha.css" rel="stylesheet" type="text/css" />
    <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
    <link href="imagenes/favicon.ico" rel="icon"/>
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
                    <a href="SiembraManual.jsp">
                        <input type="button" value="SIEMBRA" class="imput-general"/>
                        <img src="imagenes/u30.png" width="155" height="180" style="border-radius:200px; " />
                    </a>
                </div>
                <div class="conte-imagenes">
                    <a href="abonadas.jsp">
                        <input type="button" value="ABONADAS" class="imput-general" />
                        <img src="imagenes/u42.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div> 
                <div class="conte-imagenes">
                    <a href="inicio_fumigas.jsp">
                        <input type="submit" value="FUMIGAS" class="imput-general" />
                        <img src="imagenes/u44.png" width="155" height="180" style="border-radius:200px;"/>
                    </a>
                </div>
            </div>
            <div class="cont-general2">
                <div class="conte-imagenes">   
                    <a href="Bombeo1.jsp">
                        <input type="submit" value="RIEGOS" class="imput-general"/>
                        <img src="imagenes/u54.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>  
                <div class="conte-imagenes">
                    <a href="despalille.jsp">
                        <input type="submit" value="DESPALILLE" class="imput-general"/>
                        <img src="imagenes/u56.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>
                <div class="conte-imagenes">
                    <a href="pajareo.jsp">
                        <input type="submit" value="PAJAREO" class="imput-general"/>
                        <img src="imagenes/u62.png" width="155" height="180" style="border-radius:200px;" />
                    </a>
                </div>
            </div>    
            <a href="Inicio.jsp">
<<<<<<< HEAD
                <input type="image" src="imagenes/BOTON FLECHA.png" width="72" height="60" /><br>
=======
                <input type="image" src="imagenes/BOTON FLECHA.png" width="66" height="66" /><br>
>>>>>>> c5ebec0ecd993e9b7a465c6ebb080ac3ab015227
                <font color="#000000">REGRESAR</font>
            </a>
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaCosecha" align="center">
            </div>
        </footer> 
</body>
</html>