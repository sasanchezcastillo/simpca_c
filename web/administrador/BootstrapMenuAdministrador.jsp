<%-- 
    Document   : BootstrapMenuAdministrador
    Created on : nov 30, 2016, 12:08:04 p.m.
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nombre = (String) session.getAttribute("nombre");
    HttpSession ObjSession = request.getSession();
    ObjSession.setAttribute("sesion","cerrar");
    if(nombre == null ){
        response.sendRedirect("/Inicio_sesion.jsp");
    }
%>
<html>
    <head>
        <meta charset="utf-8" name="viewport" content="width=device-width,user-scalable=no, initial-scale=1.0, maximum-scalable=1.0,minimum-scale=1.0"/>
        <link href="imagenes/favicon.ico" rel="icon"/>
        <title>Administrador</title>
        <link href="css/EstilosBootstrapAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="css/css.css">
        <link href="css/css.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div id="throbber" style="display:none; min-height:120px;">
        </div>

        <div id="noty-holder">
        </div>

        <div id="wrapper">

            <nav class="navbar navbar-inverse navbar-fixed-top navegacion" style="background:url(../img-admin/fondo2.png);" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    </a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-left top-nav" >
                    <img class="img-icono navbar-left" id="logo-navegacion" src="../imagenes/favicon.png" alt="LOGO">          
                </ul>
                <ul class="nav navbar-right top-nav ">    
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <%= nombre %><b class="fa fa-angle-down"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="../Session" id="menu-derecha"><i class="fa fa-fw fa-power-off"></i>Cerrar Sesion</a></li>
                        </ul>
                    </li>
                </ul>
                <div class="collapse navbar-collapse navbar-ex1-collapse navegacion">
                    <ul class="nav navbar-nav side-nav navegacion">
                        <li>
                            <a href="#" data-toggle="collapse" data-target="#submenu-1">
                                <i class="fa fa-fw fa-search-plus"></i>Buscar<i class="fa fa-fw fa-angle-down pull-right"></i></a>
                            <ul id="submenu-1" class="collapse ">
                                <li><a href="#" id="buscarusuario"><i class="fa fa-angle-double-right"></i>Usuario</a></li>

                            </ul>
                        </li>
                        <li>
                            <a href="#" data-toggle="collapse" data-target="#submenu-2">
                                <i class="fa fa-fw fa-user-plus"></i>Agregar<i class="fa fa-fw fa-angle-down pull-right"></i></a>
                            <ul id="submenu-2" class="collapse">
                                <li><a href="#" id="AgregarUsuario"><i class="fa fa-angle-double-right"></i> Usuario</a></li>
                                <li><a href="#" id="AgregarAdministrador"><i class="fa fa-angle-double-right"></i>Administrador</a></li>
                                <li><a href="#" id="AgregarInsumo"><i class="fa fa-angle-double-right"></i>Insumo</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#" data-toggle="collapse" data-target="#submenu-3">
                                <i class="fa fa-fw fa-cog"></i>Eliminar<i class="fa fa-fw fa-angle-down pull-right"></i></a>
                            <ul id="submenu-3" class="collapse">
                                <li><a href="#" id="usuario"><i class="fa fa-angle-double-right"></i>Usuario</a></li>
                            </ul>
                        </li>
                         <li>
                            <a href="#" data-toggle="collapse" data-target="#submenu-4">
                                <i class="fa fa-fw fa-signal"></i>Graficas<i class="fa fa-fw fa-angle-down pull-right"></i></a>
                            <ul id="submenu-4" class="collapse">
                                <li><a href="../GraficaAdministrador" id="Areporte"><i class="fa fa-angle-double-right"></i>Reportes</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>
          </div>  
            <div id="container">
                <div class="container" id="container">
                    <div class="fondo2">
                        <img src="../img-admin/comprometidos.jpg" class="img-fondo" alt=""/>
                    </div>
                </div>
                
            </div>
            <!-- /.container-fluid -->

            <!-- /#page-wrapper -->
            <!-- /#wrapper -->
            <div class="container contenedores " >
                <div id="contenedor-acciones" class="text-center col-xm-12 col-xm-offset-0 col-sm-offset-4 col-sm-8 col-md-6 col-md-offset-5  col-lg-6 col-lg-offset-5">
                </div>
              
                    
                </div>

                
            </div>  
        
        <script src="js/js.js"></script>
        <script src="../Js/jquery.js" type="text/javascript"></script>
        <script src="../Js/bootstrap.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#AgregarUsuario").click(function () {
                    $("#contenedor-acciones").load("agregarusuario.jsp");
                });
                $("#AgregarAdministrador").click(function () {
                    $("#contenedor-acciones").load("agregarAdministrador.jsp");

                });
                $("#AgregarInsumo").click(function () {
                    $("#contenedor-acciones").load("agregarInsumo.jsp");
                });

                $("#buscarusuario").click(function () {
                    $("#contenedor-acciones").load("buscador.jsp");
                });
                
                $("#usuario").click(function (){
                    $("#contenedor-acciones").load("buscarEliminar.jsp");
                });
                
            });
        </script>
        
        
        <script type="text/javascript">
        $(document).ready(function() {
		$("#Areportesa").click(function(event) {
                    //el id del parametro que vammos a enviar el que recibe el servlet 
			
			// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
                        //colocamos el action de el formulario  en este caso es buscar
			$.post("../GraficaAdministrador", {
                            // decimos que la variable cedula es cedula y es lo que se va a enviar a el servlet
                                
			}, function(responseText) {
                            //colocamos la id de el contenedor o el div donde mostraremos lo  que nos devulve el servlet
				$("#contenedor-acciones").html(responseText);
			});
		});
	});
    </script>
        <script src="../Js/exporting.js" type="text/javascript"></script>
    <script src="../Js/higchart-3d.js" type="text/javascript"></script>
    <script src="../Js/higchart.js" type="text/javascript"></script>
    <script src="https://code.highcharts.com/highcharts-3d.js"></script>
    <script src="../Js/jquery-1.7.1.min.js" type="text/javascript"></script>
    </body>
</html> 
