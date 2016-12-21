<%-- 
    Document   : asignarNuevaC
    Created on : 3/08/2016, 04:56:39 PM
    Author     : Angelita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>Asignar Nueva Contraseña</title>
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
                <H1 style="margin-top:15%">ASIGNAR NUEVA</H1>
                <H1>CONTRASE&Ntilde;A</H1>
                
                <form class="formulario" action="AsignarNC" method="post">
                            <div class="input-group">
                            <h4 style="font-weight:bold">Digite su nueva contrase&ntilde;a</h4>
                            <h5 style="color:black">*La contrase&ntilde;a debe estar compuesta de letras y n&uacute;meros</h5>
                            <br></br>
                            <input type="text" required="" name="password"/>
                            <br></br>
                            </div>
                            
                            <div class="input-group">
                            <h4 style="font-weight:bold">Vuelve a escribir la nueva contrase&ntilde;a</h4>
                            <br></br>
                            <input type="text" required="" name="confirmar"/>
                            <br></br>
                            <input type="submit" name="guardar" value="GUARDAR"/>
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
