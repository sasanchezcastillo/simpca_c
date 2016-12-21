<%-- 
    Document   : resultado
    Created on : 4/12/2016, 04:03:03 PM
    Author     : LUIS
--%>


<%@page import="controlador_admin.registrosAdministrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="utf-8" name="viewport" content="width=device-width,user-scalable=no, initial-scale=1.0, maximum-scalable=1.0,minimum-scale=1.0"/>
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <%
            registrosAdministrador dato = (registrosAdministrador) session.getAttribute("datos");
        %>


       
               <div class="contenedor-formulario" style="margin-top: -70%;">
                <div class="wrapper" >
                    <form class="formulario" name="formulario_registro" action="../eliminarU" method="post">
                        <h4 style="text-align: center;" >REGISTRE UN ADMINISTRADOR</h4>
                        <div class="input-group">
                            <input type="text" id="nombre" readonly="" name="nombre" value="<%= dato.getNombre()%>"/>
                            <label class="label" for="nombre"></label>
                        </div>
                        <div class="input-group">
                            <input type="text" id="apellido" readonly="" name="apellido" value="<%= dato.getApellido()%>"/>
                            <label class="label" for="apellido"></label>
                        </div>
                        <div class="input-group">
                            <input type="text" id="cedula" readonly="" name="cedula" value="<%= dato.getCedula()%>"/>
                            <label class="label" for="cedula"></label>
                        </div>
                        <div class="input-group">
                            <input type="text" id="telefono" readonly="" name="telefono" value="<%= dato.getTelefono()%>"/>
                            <label class="label" for="telefono"></label>
                        </div>
                        <div class="input-group">
                            <input type="text" id="direccion" readonly="" name="direccion" value="<%= dato.getDireccion()%>"/>
                            <label class="label" for="direccion"></label>
                        </div>
                        <div class="input-group">
                            <input type="email" id="email" readonly="" name="correo" value="<%= dato.getCorreo()%>"/>
                            <label class="label" for="email"></label>
                        </div>
                        <div class="input-group">
                            <input type="text" id="pass" readonly="" name="contrasena" value="<%= dato.getTipo()%>"/>
                            <label class="label" for="pass"></label>
                        </div>
                        <input type="submit" value="ELIMINAR"  /> 
                        <input type="button" value="CANCELAR" onclick="location.href = '../administrador/BootstrapMenuAdministrador.jsp'"/> 
                    </form>
                </div>
    </div>
            </div>
            

</div>

<script  src="../Js/formulario.js"></script>  
<script src="js/js.js"></script>
<script src="../Js/jquery.js" type="text/javascript"></script>
