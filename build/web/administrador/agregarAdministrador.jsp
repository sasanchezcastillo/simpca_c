
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
        <form  class="formulario" name="formulario_registro" action="../RegistrarAdministrador" method="post">
            <h4 style="text-align: center;" >REGISTRE UN ADMINISTRADOR</h4>
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
                <input type="email" id="email" name="correo"/>
                <label class="label" for="email">Correo</label>
            </div>
            <div class="input-group" id="myform">
                <input type="password" id="password" id="myPassword"  name="pass"/>
                <label class="label" for="pass">Contraseña</label>
            </div>
            <!--   <form id="myform" action="" method="get" accept-charset="utf-8">

            <div class="" id="myform">
                <input id="myPassword" type="password" name="" value="">
            </div>
            </form>-->


            <!-- <div class="input-group">
                 <input type="password" id="mypassword"  name="contrasena"/>
                 <label class="label" for="pass">Contraseña</label>
             </div>-->
            <div class="input-group radio">
                <input type="radio" id="masculino"  name="sexo" onclick="value = 'Masculino'"/>

                <label  for="masculino">Masculino</label>
                <input type="radio" id="femenino"  name="sexo" onclick="value = 'Femenino'"/>
                <label for="femenino">Femenino</label>
            </div>
            <input type="hidden" name="tipo" value="Administrador">
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
<style>
    #myform input[type="password"],#myform input[type="text"]{
        background:transparent;
        border: 2px solid #46AC84;
        color: #777;
        font-family: "Lato", sans-serif;
        font-size: 14px;
        padding: 9px 5px;
        height: 21px;
        text-indent: 6px;
        -webkit-appearance: none;
        -webkit-border-radius: 6px;
        -moz-border-radius: 6px;
        border-radius: 6px;
        -webkit-box-shadow: none;
        -moz-box-shadow: none;
        box-shadow: none;
        -webkit-transition: border .25s linear, color .25s linear;
        -moz-transition: border .25s linear, color .25s linear;
        -o-transition: border .25s linear, color .25s linear;
        transition: border .25s linear, color .25s linear;
        -webkit-backface-visibility: hidden;
        width:100%;
    }
    #myform input[type="password"]:focus,#myform input[type="text"]:focus{
        outline:0;
    }
    #myform{
        width: 500px;
        margin: 0 auto;
        position: relative;
        margin-bottom:60px;
    }
    .strength_meter{
        position: absolute;
        left: 0px;
        top: 0px;
        width: 100%;
        height: 43px;
        z-index:-1;
        border-radius:5px;
        padding-right:13px;
    }
    .button_strength {
        text-decoration: none;
        color: #000;
        font-size: 13px;
        padding: 3px;
        border: 1px solid #588157;
        border-radius: 5px;
    }
    .strength_meter div{
        width:0%;
        height: 43px;
        text-align: right;
        color: #000;
        line-height: 43px;
        -webkit-transition: all .3s ease-in-out;
        -moz-transition: all .3s ease-in-out;
        -o-transition: all .3s ease-in-out;
        -ms-transition: all .3s ease-in-out;
        transition: all .3s ease-in-out;
        padding-right: 12px;
        border-radius:5px;
    }
    .strength_meter div p{
        position: absolute;
        top: 22px;
        right: 0px;
        color: #000;
        font-size:13px;
    }

    .veryweak{
        background-color: #FFA0A0;
        border-color: #F04040!important;
        width:25%!important;
    }
    .weak{
        background-color: #FFB78C;
        border-color: #FF853C!important;
        width:50%!important;
    }
    .medium{
        background-color: #FFEC8B;
        border-color: #FC0!important;
        width:75%!important;
    }
    .strong{
        background-color: #C3FF88;
        border-color: #8DFF1C!important;
        width:100%!important;
    }
    h1{
        color:white;
        font-size:50px;
        text-align:center;
        padding-top:30px;
        margin-bottom:20px;
    }
    h1 span{
        font-weight:bold;
        color:white;
        opacity:.3;
    }
</style>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="js/strength.js"></script>
<script>
                $(document).ready(function ($) {

                    $('#myPassword').strength({
                        strengthClass: 'strength',
                        strengthMeterClass: 'strength_meter',
                        strengthButtonClass: 'button_strength',
                        strengthButtonText: 'Ver Contraseña',
                        strengthButtonTextToggle: 'Ocultar Contraseña'
                    });

                });
</script>
