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
<<<<<<< HEAD
                            <input type="image" title="Eliga Otro Lote" style="margin-left: 27%; cursor: pointer;"/><br><br>
=======
                            <input type="image" src="imagenes/BOTON FLECHA.png" title="Eliga Otro Lote" style="margin-left: 27%; cursor: pointer;"/><br><br>
>>>>>>> c5ebec0ecd993e9b7a465c6ebb080ac3ab015227
                            <h2 style="margin-left: 28%; margin-top: -5px;"id="h2-elegir">N° Lote: <%=lote%></h2>
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
<<<<<<< HEAD
                            <form action="DetallesTotal" method="post" style="margin-top: 25px;">
                                <a class="htitulos">CONSULTAR LOTE</a>
                                <br>
                                <input type="text" name="num_lote" hidden="" value="<%=lote%>"/>
                                <input class="agregar-insumo" style="margin-top: 10px;" type="submit" value="Consultar"/>

=======
                            <form action="DetallesTotal" method="post" style="margin-top: -5px;">
                                <a class="htitulos">CONSULTAR LOTE</a>
                                <br>
                                <input type="text" name="num_lote" hidden="" value="<%=lote%>"/>
                                <input class="agregar-insumo" style="margin-top: 10px;" type="button" onclick="consulta('TextCedula');" value="Consultar"/>
>>>>>>> c5ebec0ecd993e9b7a465c6ebb080ac3ab015227
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
<<<<<<< HEAD
=======
        <script>
            function consulta(idelemento) {
                window.location = '#miNodo';
                document.getElementById(idelemento).focus();
                var a = document.getElementById('TextCedula');
                a.value = "";
                a.focus();
            }
        </script>
        <style>
            /**/
            #usuarioModal{
                width: 80%;
                height: 30px;
                border-radius: 10px;
                margin-top: 10px;
                margin-left: 10%;
                padding: 15px;

            }
            #modal-bar p{
                text-align: center;
                margin: 0 auto;
            }

            /* definicon  contenedor de ventana modal con fonfo oscuro*/
            .modal{
                position: fixed;
                top: 0px;
                bottom: 0px;
                left: 0px;
                right: 0px;
                background: rgba(0,0,0,0.8);
                z-index: 999;
                opacity: 0;
                pointer-events: none;
                transition: all 1s;
            }

            /* ventana modal , con fondo blanco y centrada */
            .modal-content{
                background-color: #fff;
                position: relative;
                width: 400px;
                height: 180px;
                margin: 10% auto;
                box-shadow: 1px 2px 3px #000;
                font-family: Times New Roman;
                border-radius: 10px;
            }

            /* barra de boton de cerrado*/
            .modal-bar{
                font-family: arial;
                text-align: center;
                color: white;
                margin-bottom: 3px;
                background-color: rgb(105, 138, 94);
                padding: 5px;
                border-top: 10px;
            }

            /* boton de cerrado*/
            .modal-bar>a{
                color: #000;
                width: 20px;
                height: 20px;
                border-radius: 50%;
                display: inline-block;
                background-color: #fff;
                text-align: center;
                text-decoration: none;
                box-shadow: 1px 1px 1px #000;
            }

            /* hover sobre boton de cerrado*/
            .modal-close >a:hover{
                color: #1976D2;
            }

            /*  contenido del mensaje de la ventanda modal*/
            .modal-text{
                padding: 10px;
            }

            /* activar el elemtno modal , con el evento click */
            #miNodo:target{
                opacity: 1;
                pointer-events: auto;
            }

            #inputModal{
                width: 35%;
                height: 30px;
                color:white;
                border: none;
                cursor: pointer;
                margin-top: 10px;
                margin-left: 10%;
                border-radius: 5px;
                background-color: #D38400;
            }
        </style>
        <div id="miNodo" class="modal">
            <div class="modal-content">
                <div class="modal-bar">Confirmar Inicio de Sesión</div>
                <div class="modal-text">
                    <form method="post" action="SesionConsulta">
                        <input type="text" name="cedula"  placeholder="Usuario 'Cédula'" autofocus id="usuarioModal" id="TextCedula"/><br/>
                        <input type="password" name="pass" placeholder="Contraseña" id="usuarioModal"/>
                        <input type="button" value="Cancelar" onclick="window.location = '#'" id="inputModal"/>
                        <input type="submit" value="Aceptar" id="inputModal"/>

                    </form> 
                </div>
            </div>
        </div>
>>>>>>> c5ebec0ecd993e9b7a465c6ebb080ac3ab015227
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaInicio" align="center">
            </div>
        </footer>
    </body>
</html>