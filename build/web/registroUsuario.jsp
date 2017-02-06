<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>registrate</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
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
                <form  class="formulario" name="formulario_registro" action="Usuario" method="post">
                      <h1 class="titulo">REGISTRAR USUARIO</h1>
                        <br>
                           <div class="input-group">
                                <input type="text" id="nombre"  name="nombre"/>
                                <label class="label" for="nombre">Nombres</label>
                            </div>
                            <div class="input-group">
                                 <input type="text" id="apellido"  name="apellido"/>
                                   <label class="label" for="apellido">Apellidos</label>
                            </div>
                            <div class="input-group">
                                    <input type="text" id="cedula"  name="cedula"/>
                                    <label class="label" for="cedula">Cedula</label>
                            </div>
                            <div class="input-group">
                                    <input type="text" id="telefono"  name="telefono"/>
                                    <label class="label" for="telefono">Telefono</label>
                            </div>
                            <div class="input-group">
                                    <input type="text" id="direccion"  name="direccion"/>
                                    <label class="label" for="direccion">Direccion</label>
                            </div>
                            <div class="input-group">
                                    <input type="email" id="email"  name="correo"/>
                                    <label class="label" for="email">Correo Electronico</label>
                            </div>
                            <div class="input-group">
                                    <input type="password" id="pass"  name="contraseña"/>
                                    <label class="label" for="pass">Contraseña</label>
                            </div>
                        <input type="hidden" name="tipo" value="Usuario">
                            <div class="input-group radio">
                                <input type="radio" id="masculino"  name="sexo" onclick="value='Masculino'"/>
                        
                                <label  for="masculino">Masculino</label>
                                <input type="radio" id="femenino"  name="sexo" onclick="value='Femenino'"/>
                                <label for="femenino">Femenino</label>
                            </div>
                            
                    <input type="submit" value="SIGUIENTE" /> 
                    <input type="button" value="CANCELAR" onclick="location.href='InicioCoagronorte.jsp'"/> 
                </form>
                <script  src="Js/formulario.js"></script>  
                   
            
            </div>
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaSesion" align="center">
            </div>
        </footer>
    </body>
</html>
