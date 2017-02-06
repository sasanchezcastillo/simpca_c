<%-- 
    Document   : buscarEliminar
    Created on : 4/12/2016, 03:53:30 PM
    Author     : LUIS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <link href="css/buscador.css" rel="stylesheet" type="text/css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="imagenes/favicon.ico" rel="icon"/>
</head>
<div class="flexsearch">
    <div class="flexsearch--wrapper">
        <form name="consulta" class="flexsearch--form" id="consulta" action="" method="post">
            <div class="flexsearch--input-wrapper">
                <input class="flexsearch--input" type="search" name="cedula" id="cedula" placeholder="Buscar">
                <input class="flexsearch--submit" type="button" id="submit"  value="&#10140;"/>
            </div>
        </form> 
        <div  class="result-tabla"id="tabla">
            
        </div>
    </div>
    <div id="contenedor">
    </div>
    <script src="../Js/javascript.js" type="text/javascript"></script>
    <script src="../Js/jquery-1.7.1.min.js" type="text/javascript"></script>
    <script src="../Js/jquery.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function() {
		$("#submit").click(function(event) {
                    //el id del parametro que vammos a enviar el que recibe el servlet 
			var cedula = $("#cedula").val();
			// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
                        //colocamos el action de el formulario  en este caso es buscar
			$.post("../Buscar", {
                            // decimos que la variable cedula es cedula y es lo que se va a enviar a el servlet
                                cedula : cedula
			}, function(responseText) {
                            //colocamos la id de el contenedor o el div donde mostraremos lo  que nos devulve el servlet
				$("#tabla").html(responseText);
			});
		});
	});
    </script>
</div>
