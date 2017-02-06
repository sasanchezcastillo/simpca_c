<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/nuevo_insumo.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>Agrege Un Insumo</title>
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
        <div class="wrap-a_iinsumo">
            <div class="contenedor-a_insumo" >                
                <div class="ima-a_insumo">
                    <img class="img-productos" src="imagenes/ArroZulia.png" >
                    <img class="img-productos" src="imagenes/arroz_oro.png">
                    <img class="img-productos" src="imagenes/arroz_premiun.png">
                    <img class="img-productos" src="imagenes/arroz_intregal.png">
                    <div class="form-insumos">
                        <form action="RInsumos" method="post">
                            <h1>AGREGAR UN INSUMO</h1>
                            <table class="table-form">
                                <td>
                                    <h3>TIPO</h3>
                                    <select  class="textbox" name="tipo-insumo">
                                        <option >Selecciones</option>
                                        <option value="1">HERBICIDA</option>
                                        <option value="3">INSECTISIDA</option>
                                        <option value="2">FUNGISIDA</option>
                                        <option value="4">COAYUDANTE</option>
                                        <option value="5">FERTILIZANTE</option>
                                    </select>
                                </td>
                                <td class="td-space">
                                </td>
                                <td>
                                    <h3>NOMBRE</h3>
                                    <input type="text" name="nombre_insumo" class="textbox"placeholder="Insumo">
                                </td>
                            </table>
                            <input type="submit" name="guardar" value="AGREGAR Y GUARDAR" onclick="aceptar();"  class="agregar-insumo">
                        </form>
                        <script type="text/javascript">
                            function aceptar() {
                                aceptar = confirm("se registro su insumo correctamente desea salir");

                                if (aceptar === true)
                                    aceptar = window.close();
                            }
                        </script>
                    </div>
                </div>
            </div>
        </div>
        <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaNI" align="center">
                </div>
            </footer>
    </body>
</html>
