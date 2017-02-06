

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<head>
<link href="css/nuevo_insumo.css" rel="stylesheet" type="text/css"/>
<link href="imagenes/favicon.ico" rel="icon"/>
</head>
<body>

                        <div class="contenedor-a_insumo" >                
                            <div class="ima-a_insumo">

                                <div class="form-insumos">
                                    <form action="../insumonuevo" method="post">
                                        <h1>AGREGUE UN INSUMO</h1>
                                        <table class="table-form">
                                            <td>
                                                <h3>TIPO</h3>
                                                <select class="textbox" name="clasificacion" id="clasificacion" >
                                                    <option >Seleccione</option>
                                                    <option value="HERBICIDAS">HERBICIDAS</option>
                                                    <option value="INSECTICIDAS">INSECTICIDAS</option>
                                                    <option value="FUNGICIDAS">FUNGICIDAS</option>
                                                    <option value="COAYUDANTES">COAYUDANTES</option>
                                                    <option value="FERTILIZANTES">FERTILIZANTES</option>
                                                    <option value="BIOESTIMULANTES">BIOESTIMULANTES</option>
                                                </select>
                                            </td>
                                            <td class="td-space">
                                            </td>
                                            <td>
                                                <h3>NOMBRE</h3>
                                                <input type="text" name="nombre_insumo" id="nombre_insumo" class="textbox" placeholder="Insumo">
                                            </td>
                                        </table>

                                        <div class="pruebas-botones2" style="margin-top: 30px;">
                                            <input type="button" name="guardar" value="AGREGAR " class="agregar-insumo" onclick="javascript: agregarInsumo();">
                                            <input type="button" id="close" name="guardar" value="CERRAR" class="agregar-insumo">


                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    

</body>

