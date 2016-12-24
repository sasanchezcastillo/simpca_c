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
        <link href="css/css1.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>Inicio</title>
        <%
            HttpSession objSession = request.getSession();
            String cedula = (String) objSession.getAttribute("cedula");
            String nombre = (String) objSession.getAttribute("nombre");
            String lote = (String) objSession.getAttribute("lote");
            objSession.setAttribute("sesion", "cerrar");

            if (cedula == null) {
                if (nombre == null) {
                    if (lote == null) {
                        response.sendRedirect("Inicio_sesion.jsp");
                    }
                }
            }
        %>
    </head>
    <!--Interfaz Inicio, permite que el agricultor pueda Ingresar al Menu de la pagina para ingresar la informacion correspondiente al lote -->
    <body class="fondoInicio">
        <div id="toplogo">
            <h1 id="logo">
                <a href="#" title="Coagronorte-Cooperativa Agropecuaria Norte de Santander"></a>
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

        <div class="wrapper-inicio" align="center">
            <div class="contenedor-a_insumo" style="border: none;" align="center" >    
                <div class="ima-a_insumo">
                    <img class="img-productos" src="imagenes/ArroZulia.png" >
                    <img class="img-productos" src="imagenes/arroz_oro.png">
                    <img class="img-productos" src="imagenes/arroz_premiun.png">
                    <img class="img-productos" src="imagenes/arroz_intregal.png">
                    <img class="img-productos" src="imagenes/arina_Arroz.png">
                </div>
                <div class="cuerpo">        
                    <div class="lote-atras">
                        <form method="post" action="lote" >
                            <input type="image" title="Elegir Lote" src="imagenes/atrasX32.png" />   
                            <h2 id="h2-elegir">N° Lote: <%=lote%></h2>
                        </form>

                    </div>

                    <div class="cont-pl">
                        <a class="htitulos" href="preparacion_de_lotes.jsp">PREPARACION DEL LOTE</a>
                        <div class="pl-img">
                            <a href="preparacion_de_lotes.jsp">
                                <img class="img1" src="imagenes/tractor.jpg" >
                                <img class="img2" src="imagenes/preparacion.jpg">
                            </a>
                        </div>
                    </div>
                    <div class="cont-c">
                        <a  href="cosecha.jsp" class="htitulos">COSECHA</a>
                        <div class="c-img">
                            <a href="cosecha.jsp">
                                <img src="imagenes/cosecha.jpg" /> 
                                <img src="imagenes/corta2.jpg"width="303" height="203"  />
                            </a>
                        </div>
                    </div>

                    <div class="cont-ct">
                        <a class="htitulos"href="corta.jsp">CORTA</a>
                        <div class="ct-img" style="text-decoration: none;">
                            <a href="corta.jsp">
                                <img src="imagenes/corta.jpg"  /> 
                                <img src="imagenes/corta3.jpg"  />
                            </a>                                
                        </div>
                    </div>

                    <div class="cont-ct">

                        <div class="form-consultar">
                            <form action="DetallesTotal" method="post" style="margin-top: 25px;">
                                <a class="htitulos">CONSULTAR LOTE</a>
                                <br>
                                <input type="text" name="num_lote" hidden="" value="<%=lote%>"/>
                                <input class="agregar-insumo" style="margin-top: 10px;" type="submit" value="Consultar"/>

                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaInicio" align="center">
            </div>
        </footer>
    </body>
</html>