<%-- 
    Document   : pre-abonada
    Created on : 4/08/2016, 01:30:39 PM
    Author     : Drawly
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="con" class="Controladores.ConsultasSQL" scope="page"></jsp:useBean>
<%
    session.setAttribute("Abonada", "Abonada2");
%>

<!DOCTYPE html>
<html>
    
    <%
           HttpSession objSession = request.getSession();
           String lote = (String) objSession.getAttribute("lote");
           String nombre = (String) objSession.getAttribute("nombre");
           objSession.setAttribute("sesion","cerrar");
          
                if(nombre == null){
                    if(lote == null){
                        response.sendRedirect("Inicio_sesion.jsp");
                    }
                }
  %>
    
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="imagenes/favicon.ico" rel="icon"/>
        <script src="Js/funciones.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <link href="css/nuevo_insumo.css" rel="stylesheet" type="text/css"/>
        <link href="css/CssAbonadas.css" rel="stylesheet" type="text/css"/>
        <title>Abonada 2</title>
    </head>
<body class="fondo">
        <div id="wrapper">
            <section class="wrapper2">
                <div id="toplogo">
                    <h1 id="logo">
                        <a href="Inicio.jsp" title="Coagronorte-Cooperativa Agropecuaria Norte de Santander"></a>
                    </h1>
                </div>
            </section>
            <header>   
                <nav>
                    <ul>
                        <li><a href="#">Coagronorte</a>
                        <li><a href="#">Productos</a>
                        <li><a href="#">Servicios</a>
                        <li><a href="#">Blog</a>
                        <li><a href="#">Contacto </a>
                        <li><a href="#"><%=nombre%></a>
                        <li><a href="Session">Cerrar Sesion</a>
                    </ul>
                </nav>
            </header>
            <img src="ImagenesR/cosecha-1.png" style="width: 100%; height: 400px; position: absolute">
            <div id="cont">
                <form action="Abonadas" id="Abonadas" method="post">
                    <div align="center"><br>
                        <h3 style="margin-left: 570px; font-size: 22px; font-family: Times New Roman;">Lote: <input type="text" class="NUMLOTE" name="lote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"></h3>
                        <h1 style="margin-top: 50px; font-size: 28px; font-family: Times New Roman;">ABONADA 2</h1>
                        
                        <table border="0" style=" margin-left: 12px; margin-top: -25px;">
                        <tr>
                            <td><b style="font-size: 20px; font-family: Times New Roman;">Fecha:</b></td>
                            <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-tA" type="date" name="fecha"></td>
                        </tr>
                        </table>

                    </div>
                    <div align="center">
                        <h2 style="font-family: Times New Roman; font-size: 26px; margin-right: 30px;  margin-bottom: 30px;">Insumos</h2>
                        <br>
                        <div class="pruebas-botones">
                                    <input style="font-size: 14px; font-family: Times New Roman;" type="button" value="Agregar Nueva Fila" onclick="agregarFilaTabla()"  class="agregar-insumo2" />
                                    <input style="font-size: 14px; font-family: Times New Roman;" id="open" type="button" value="Agregar Nuevo Insumo" class="agregar-insumo2" />
                                </div>  
                        <div class="tabla2">
                            <table border="0" id="tablaPre-abonada" align="center" style="margin-top: 20px;">
                                <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Tipo</b></td>
                                <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Nombre</b></td>
                                <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Cantidad</b></td>
                                <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Unidad</b></td>
                                <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Valor</b></td>
                                <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Valor Total</b></td>
                                <tbody id="cuerpoTabla">
                                    <tr>
                                        <td style="width: 160px;">
                                            <div align="center">
                                                <%
                                                    ResultSet rs = con.listar_tipo_productos();
                                                    ResultSet rs2 = con.listar_tipo_productos();
                                                %>
                                                <select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;" name="tipo_insumo" id="tipo_insumo" class="textbox"  onchange="combo_insumo(this, 0)">
                                                    <option value="">Seleccione</option>
                                                    <% while (rs.next()) {%>
                                                    <option value="<%= rs.getString("tipo_insumo")%>"><%= rs.getString("tipo_insumo")%></option>
                                                    <%}%>
                                                </select>
                                            </div>
                                        </td>
                                        <td>
                                            <div align="center">
                                                <select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;" name="nombre_insumo"  class="textbox" id="insumo0">
                                                    <option value="">Seleccione</option>
                                                </select>
                                            </div>
                                        </td>
                                        <td align="center">
                                            <input class="textbox"  type="text" id="cantidadInsumos0"  name="cantidad" onchange="calcularInsumos(this, 0)"/>
                                        </td>
                                        <td align="center">
                                            <select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;" name="unidad" id="Seleccione" class="textbox">
                                                <option name="unidad" value="seleccione" >Seleccione</option>
                                                <option name="unidad" value="bultos">Bultos</option>
                                                <option name="unidad" value="canecas">Canecas</option>
                                                <option name="unidad" value="galones">Galones</option>
                                                <option name="unidad" value="litros">Litros</option>
                                                <option name="unidad" value="kilogramos">Kilogramos</option>
                                                <option name="unidad" value="gramos">Gramos</option>
                                                <option name="unidad" value="miligramos">Miligramos</option>
                                            </select>
                                        </td>
                                        <td align="center">
                                            <input type="text" class="textbox" id="valorInsumos0" placeholder="Unitario" name="valorunitario" onkeyup="format(this, 0); calcularInsumos(this, 0)" onchange="format(this, 0)"/>
                                        </td>
                                        <td align="center">
                                            <input type="text" class="textbox" style="background-color:#CCC; width: 120px; " id="valorTotalInsumos0" readonly="readonly" style="height:20px;width:110px;background: #CCC;" name="valortotal" onkeyup="format(this, 0); calcularTotales(this, 0)" onchange="format(this, 0)"/>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                                                
                    <table border="0" align="center" id="tablaPre-abonada2"  >
                        <tr>
                            <td></td>
                            <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Cantidad</b></td>
                            <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Unidad</b></td>
                            <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Costo Unitario</b></td>
                            <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Valor Total</b></td>
                        </tr>
                        <tr>
                            <td align="center"  style="width: 120px;"><b style="font-size: 20px; font-family: Times New Roman;">Mano De Obra</b></td>
                            <td align="center">
                                <input  type="text" class="textbox" id="cantidadManoObra" name="cantidadManoObra" onchange="calcularManoObra()"/>
                            </td>
                            <td align="center">
                                <label for="Seleccione"></label>
                                <select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;" name="unidadManoObra" class="textbox"  id="Seleccione">
                                    <option name="unidadManoObra">Seleccione</option>
                                    <option name="unidadManoObra">Bultos</option>
                                </select>
                            </td>
                            <td align="center">
                                <input type="text" class="textbox" id="costoUnitarioManoObra" name="costoUnitarioManoObra" onkeyup="format(this); calcularManoObra()" onchange="format()"/>
                            </td>
                            <td align="center">
                                <input type="text" class="textbox" style="background-color:#CCC" id="costoTotalManoObra" readonly="readonly" name="costoTotalManoObra" onkeyup="format(this); calcularManoObra()" onchange="format()"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Transporte</b></td>
                            <td align="center">
                                <input type="text" class="textbox" id="cantidadTransporte" name="cantidadTransporte" onchange="calcularTransporte()" />
                            </td>
                            <td align="center">
                                <label for="Seleccione"></label>
                                <select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;" name="unidadTransporte" class="textbox" id="Seleccione">
                                    <option name="unidadTransporte">Seleccione</option>
                                    <option name="unidadTransporte">Bultos</option>
                                </select>
                            </td>
                            <td align="center">
                                <input type="text" class="textbox" id="costoUnitarioTransporte" name="costoUnitario"  onkeyup="format(this); calcularTransporte()" onchange="format()"/>
                            </td>
                            <td align="center">
                                <input type="text" class="textbox" style="background-color:#CCC" id="costoTotalTransporte" readonly="readonly" name="costoTotalTransporte" onkeyup="format(this); calcularTransporte()" onchange="format()"/>
                            </td>
                        </tr>
                        <tr style="height: 60px;">
                            <td colspan="3" align="center"></td>
                            <td align="center"><b style="font-size: 20px; font-family: Times New Roman;">Costo Total</b></td>
                            <td align="center">
                                <input type="text" class="textbox" style="background-color:#CCC" id="sumaTotal" readonly="readonly" name="sumaTotal" onkeyup="format(this)" onchange="calcularTotales(this, 0); format(this)"/>
                            </td>
                        </tr>
                    </table> 
                   <div class="cont-inputs" style="margin-top: 18px;">
                       <input id="guardar" type="button" onclick="VentanaEmergente()" class="agregar-insumo" value="GUARDAR"/>
                        <input name="cerrar"  type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'abonadas.jsp'"/>
                   </div>
                </form>
            </div>
        </div>
                                                
<div id="popup" style="display: none; margin-top: -130%; margin-left: 50px;">
    <div class="">
        <div class="wrap-a_iinsumo">
            <div class="contenedor-a_insumo" >                
                <div class="ima-a_insumo">
                    <img class="img-productos" src="imagenes/ArroZulia.png" >
                    <img class="img-productos" src="imagenes/arroz_oro.png">
                    <img class="img-productos" src="imagenes/arroz_premiun.png">
                    <img class="img-productos" src="imagenes/arroz_intregal.png">
                    <div class="form-insumos">
                        <form action="insumonuevo" method="post">
                            <h1 style="font-size: 20px; font-family: Times New Roman;">AGREGUE UN INSUMO</h1>
                            <table class="table-form">
                                <td>
                                    <h3 style="font-size: 20px; font-family: Times New Roman;">TIPO</h3>
                                    <select style="font-size: 16px; font-family: Times New Roman;" class="textbox" name="clasificacion" id="clasificacion" >
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
                                    <h3 style="font-size: 20px; font-family: Times New Roman;">NOMBRE</h3>
                                    <input type="text" name="nombre_insumo" id="nombre_insumo" class="textbox" placeholder="Insumo">
                                </td>
                            </table>
                            <div class="pruebas-botones2">
                                <input type="button" name="guardar" value="AGREGAR " class="agregar-insumo" onclick="javascript: agregarInsumo();" >
                                <input type="button" id="close" name="guardar" value="CERRAR" class="agregar-insumo">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
            
        function agregarInsumo() {
            var clasificacion = $('#clasificacion').val();
            var nombre_insumo = $('#nombre_insumo').val();
            
            clasificacion = encodeURIComponent(clasificacion);
            nombre_insumo = encodeURIComponent(nombre_insumo);
            $.post("insumonuevo?clasificacion=" + clasificacion + "&nombre_insumo=" + nombre_insumo, function (data) {
                if (data.resultado == 'OK') {
                    
                    combo_insumo(document.getElementById('tipo_insumo'), 0);
                    cerrarDialogo();
                } else {
                    alert(data.error);
                }
            }, "json");
        }
            
            var contadorfilas = 0;
            function agregarFilaTabla() {
                contadorfilas++;
                var i = contadorfilas;
                var fila_nueva = '<tr>' +
                        '<td><div align="center"><select style="width: 120px; height: 25px;" class="textbox" name="tipo_insumo" id="tipo_insumo" onchange="combo_insumo(this,' + i + ')"><option value="">Seleccione</option><% while (rs2.next()) {%><option value="<%= rs2.getString("tipo_insumo")%>"><%= rs2.getString("tipo_insumo")%></option><%}%></select></div></td>' +
                        '<td><div align="center"><select style="width: 120px; height: 25px;" class="textbox" name="nombre_insumo" class="Seleccione" id="insumo' + i + '"><option value="">Seleccione</option></select></div></td>' +
                        '<td align="center"><input class="textbox" type="text" id="cantidadInsumos' + i + '" name="cantidad" onchange="calcularInsumos(this,' + i + ')"/></td>' +
                        '<td align="center"><select style="width: 120px; height: 25px;" class="textbox" name="unidad" id="Seleccione"><option name="unidad" value="seleccione" >Seleccione</option><option name="unidad" value="bultos">Bultos</option><option name="unidad" value="canecas">Canecas</option><option name="unidad" value="galones">Galones</option><option name="unidad" value="litros">Litros</option><option name="unidad" value="kilogramos">Kilogramos</option><option name="unidad" value="gramos">Gramos</option><option name="unidad" value="miligramos">Miligramos</option></select></td>' +
                        '<td align="center"><input class="textbox" type="text" id="valorInsumos' + i + '" placeholder="Unitario" name="valorunitario" onkeyup="format(this,' + i + '); calcularInsumos(this,' + i + ')" onchange="format(this,' + i + ')"/></td>' +
                        '<td align="center"><input class="textbox" style="background-color:#CCC; width: 120px;" type="text" id="valorTotalInsumos' + i + '" readonly="readonly" style="height:20px;width:110px;background: #CCC;" name="valortotal" onkeyup="format(this,' + i + '); calcularTotales(this,' + i + ')" onchange="format(this, ' + i + ')"/></td>' +
                        '</tr>';
                $("#cuerpoTabla").append(fila_nueva);
            }
        </script>
    </div>      
    
    
    <script type="text/javascript">
    $(document).ready(function () {
        $('#open').click(function () {
            $('#popup').fadeIn('slow');
            $('.popup-overlay').fadeIn('slow');
            $('.popup-overlay').height($(window).height());
            return false;
        });

        $('#close').click(function () {
            $('#popup').fadeOut('slow');
            $('.popup-overlay').fadeOut('slow');
            return false;
        });

    });
    
    function cerrarDialogo() {
        $('#popup').fadeOut('slow');
        $('.popup-overlay').fadeOut('slow');
        return false;
    }
</script>
    <footer>
        <!--Pie de Pagina-->
        <div id="pie_paginaA" align="center">
        </div>
    </footer>
</body>
</html>