<%-- 
    Document   : registro_lote
    Created on : ago 12, 2016, 4:16:53 p.m.
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    HttpSession objSession = request.getSession();
    String cedula = (String) objSession.getAttribute("cedula");
    String nombre =(String) objSession.getAttribute("nombre");
    objSession.setAttribute("sesion", "cerrar");
    if(nombre == null){
        response.sendRedirect("Inicio_sesion.jsp");
    }
%> 


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Lotes</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'/>
        <style type="text/css"></style>
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
                                    <li><a href="#"><%=nombre%></a>
                                </ul>
                        </nav>
                </section>
        </header>
        <img src="ImagenesR/Sesion-1.png" style="width: 100%; height: 400px; position: absolute">
        <div class="contenedor-formulario">
            <div class="wrap">
                <form action="Lote" class="formulario" name="formulario_registro" method="post" id="form-lote" onsubmit="">
                    <h1 class="titulo"> REGISTRE UN LOTE</h1>
                    <br>
                    <div class="input-group">
                        <input type="text" id="telefono"  required="" name="num_lote"/>
                        <label class="label" for="Numero Del Lote">NUMERO DE LOTE</label>
                        <c:if test="${not empty _mensajeErrorLote}">
                        <div style="margin-left: 15px; color:red; font-size: 12px;" role="alert">${_mensajeErrorLote}</div>
                    </c:if>
                    </div>
                    
                    <div class="input-group">
                        <input type="text" id="nombre"   required="" name="area_lote"/>
                        <label class="label" for="Area Del Lote">HECTAREAS DEL LOTE</label>
                    </div>
                    <div class="input-group">
                        <input type="text" id="apellido"  name="arriendo_lote"/>
                        <label class="label" for="Valor Del lote">PRECIO DEL ARRIENDO 'OPCIONAL'</label>

                    </div>

                    <input type="submit" id="botn-submit" name="registrar1" value="REGISTRAR UN NUEVO LOTE"/>

                    <input type="submit" id="submit"  name="registrar2" value="GUARDAR Y FINALIZAR"/>


                </form>
                <script  src="Js/formulario_lotes.js"></script> 
            </div>
        </div>
        <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaSesion" align="center">
                </div>
            </footer>
    </body>
</html>
