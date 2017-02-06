<%-- 
    Document   : buscador
    Created on : dic 2, 2016, 11:53:42 a.m.
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <link href="css/buscador.css" rel="stylesheet" type="text/css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="imagenes/favicon.ico" rel="icon"/>
</head>
<div class="flexsearch">
    <div class="flexsearch--wrapper">
        <form name="consulta" class="flexsearch--form" id="consulta" action="../selectlote" method="post">
            <div class="flexsearch--input-wrapper">
                <input class="flexsearch--input" type="search" name="cedula" placeholder="Buscar Usuario..">
                <a href=""id="lote"><input class="flexsearch--submit" type="submit" id="lote" value="&#10140;"/></a>
            </div>
        </form> 
    </div>
    <div id="contenedor">

    </div>
    <script src="../Js/javascript.js" type="text/javascript"></script>
    <script src="../Js/jquery-1.7.1.min.js" type="text/javascript"></script>
    <script src="../Js/jquery.js" type="text/javascript"></script>
    

</div>


