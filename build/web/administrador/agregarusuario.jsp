
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
    <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    <link href="imagenes/favicon.ico" rel="icon"/>
    <script src="../Js/jquery.js" type="text/javascript"></script>
</head>

<div class="contenedor-formulario" >

    <div class="wrapper">
        <form  class="formulario" name="formulario_registro" action="../RegistroUsuari" method="post">
            <h4 style="text-align: center;" >REGISTRE UN USUARIO</h4>
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
                <label class="label" for="email">Correo</label>
            </div>
            <div class="input-group">
                <input type="password" id="pass"  name="contrasena"/>
                <label class="label" for="pass">Contraseña</label>
            </div>
            <div class="input-group radio">
                <input type="radio" id="masculino"  name="sexo" onclick="value = 'Masculino'"/>
                

                <label  for="masculino">Masculino</label>
                <input type="radio" id="femenino"  name="sexo" onclick="value = 'Femenino'"/>
                <label for="femenino">Femenino</label>
            </div>
            <input type="hidden" name="tipo" value="Usuario">
            <input type="submit" value="REGISTRAR"  /> 
            <input type="button" value="CANCELAR" onclick="location.href = '../administrador/BootstrapMenuAdministrador.jsp'"/> 
        </form>
        <script  src="../Js/formulario.js"></script>  
       <!-- <script type="text/javascript">
             function agregarusuario() {
                var nombre = $('#nombre').val();
                var apellido = $('#apellido').val();
                 var cedula = $('#cedula').val();
                  var telefono = $('#telefono').val();
                   var  direccion= $('#direccion').val();
                      var correo = $('#email').val();
                      var sexo =$('sexo');
                         var contrasena = $('#contrasena').val();
                //validar los datos
                
                
                nombre = encodeURIComponent(nombre);
                apellido = encodeURIComponent(apellido);
                cedula = encodeURIComponent(cedula);
                telefono = encodeURIComponent(telefono);
                direccion = encodeURIComponent(direccion);
                correo = encodeURIComponent(correo);
                contrasena = encodeURIComponent(contrasena);
                $.post("nuevo?usuario="+ nombre +"&apellido"+apellido+"&cedula"+cedula+"&telefono"+ telefono+"&direccion"+ direccion +"&sexo"+sexo+"&correo"+coreo+"&contrsena"+contrasena, function (data){
                    if (data.resultado === 'OK') {
                        alert("Se registro corretamente");
                    } else {
                        alert("no se pudo rgistrar");
                    }
                }, "json");
            }
            
        </script>-->
    </div>
</div>