
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession objSession = request.getSession();
            String cedula = (String) objSession.getAttribute("cedula");
            String nombre = (String) objSession.getAttribute("pass");
        %>
           
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>Iniciar Sesion</title>
    </head>
    <body class="fondoS" onload="volver();">
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
                    </ul>
                </nav>
            </section>
        </header>
        <img src="ImagenesR/Sesion-1.png" style="width: 100%; height: 400px; position: absolute">
        <div class="contenedor-formulario">
            <div class="wrap" >
           <form action="Iniciar" class="formulario" name="formulario_registro" method="post">
            <h1 class="titulo">Iniciar Sesión</h1>
                    <br>
                    <div class="input-group">
                         <input type="text" id="cedula"  name="cedula"/>
                         <label class="label" for="cedula">Usuario "Cédula"</label>
                    </div>
                    <div class="input-group">
                        <input type="password" id="contraseña"  name="pass"/>
                        <label class="label" for="contraseña">Contraseña</label>
                        <c:if test="${not empty _mensajeErrorInicio}">
                            <div style="margin-left: 15px; color:red; font-size: 12px;" role="alert">${_mensajeErrorInicio}</div>
                        </c:if>
                        <br>
                        </br>
                        <div 
                        style="text-align: center; font-size: 24px; color: red; ">
                        </div>
                    </div>
                        <div style="text-align: center; font-size: 20px; text-decoration:">
                            <a style="text-decoration: none; " href="registroUsuario.jsp"><h4 style="font-family: Times New Roman; color: #588157 ;">Registrarse</h4></a>
                        </div>
                    <br>
                        <div style="text-align: center; font-size: 20px; text-decoration:">
                            <a style="text-decoration: none;  " href="restablecerC.jsp"><h4 style="font-family: Times New Roman; color: #588157 ;">¿Has olvidado tu contrase&ntilde;a?</h4></a>
                        </div>
                    <br><br>
                    <input id="ver" type="submit"   value="INGRESAR" />
                    <input type="button"  value="CANCELAR" onclick="location.href='InicioCoagronorte.jsp'"/>
            <script src="Js/formulario.js"></script>
        </form>
    </div>
    </div>
 <script type="text/javascript">
        function ocultar(){
        document.getElementById("ver").style.display = 'none';}
    
    function volver(){
        
        window.location.hash="si-funciona";
        window.location.hash="si-Proyecto";
        window.onhashchange=function (){window.location.hash="";};
    }
</script>
         <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaSesion" align="center">
                </div>
         </footer>
   </body>
</html>