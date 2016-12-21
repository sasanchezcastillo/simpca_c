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
    <script type="text/javascript">
        $(document).ready(function () {

            $("#lote").click(function () {
                limpiar();
               /* alert("Aqui va el codigo"); 
                if(document.forms[consulta].submit() === true){
                    alert("se ejecutó el método");
                    $("#contenedor-acciones").load("seleccioneLote.jsp");
                }else{
                    alert("NO se ejecutó el método");
                }
        me va ayudar o no  ya me estoy quedadno dormidp o viene aka ala casa y tranaja desde aka?  lue mmm dnooyo l o dey lco mo pedre ee l! pere ! !  ! ajajaja y como me pasa el proyecto ? :'( ust puede copiar lk la cqaure pET?A  esta '
            });
        });

        function limpiar() {
            var d = document.getElementById("contenedor");//pere
            while (d.hasChildNodes())
                d.removeChild(d.firstChild);
        }// no porque le estoy diciendo que me ejecute el metodo al dar clic en el id
        //yo creo que es por que es un tipo sutbi  y negalecesita enviar los parametros no cree ?
    </script>

</div>


