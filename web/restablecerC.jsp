<%-- 
    Document   : restablecerC
    Created on : 3/08/2016, 04:56:53 PM
    Author     : Angelita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>Restablecer Contraseña</title>
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'/>
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
                        <li><a href="#">Coagronorte</a>
                        <li><a href="#">Productos</a>
                        <li><a href="#">Servicios</a>
                        <li><a href="#">Blog</a>
                        <li><a href="#">Contacto </a>
                        <li><a href="#">Ingresar</a>
                    </ul>
                </nav>
            </section>
        </header>
        <img src="ImagenesR/Sesion-1.png" style="width: 100%; height: 400px; position: absolute">

        <div class="contenedor-formulario"> 
            <div class="wrap">
                <H1>RESTABLECER CONTRASE&Ntilde;A</H1>
                

                <form class="formulario" action="RestablecerC" method="post">

                    <h2 style="margin-top: 30px;">¿Has olvidado tu contrase&ntilde;a?</h2>
                    <br>
                    <div class="input-group">
                        <h4>Introduce el correo electr&oacute;nico de recuperaci&oacute;n</h4>
                        <br></br>
                        <tr>
                            <td></td>
                            <td><input type="text" name="correo" value="${correo}"/></td>
                        </tr>
                        <c:if test="${not empty _mensajeErrorCorreo}">
                            <div style="margin-left: 15px; color:red; font-size: 12px;" role="alert">${_mensajeErrorCorreo}</div>
                        </c:if>
                        <br></br>
                        <input type="submit" name="verificar" value="VERIFICAR"/>
                    </div>

                </form>

                <form class="formulario" action="EnviarC" method="post">

                    <div class="input-group">
                        <h4>Te enviaremos un c&oacute;digo de verificaci&oacute;n de 4 digitos para</h4>
                        <h4>confirmar que tienes acceso a este correo electr&oacute;nico.</h4>
                        <br></br>

                        <input type="text" placeholder="Ingrese el codigo de verificación" name="codigo" id="codigo"/>
                        <br></br>
                        <input type="submit" name="continuar" value="CONTINUAR"/>
                        <input type="button" name="cancelar" value="CANCELAR" onclick="location.href='Inicio_sesion.jsp'"/>
                    </div>
                </form>           

            </div>

        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaSesion" align="center">
            </div>
        </footer>
    </body>
</html>
