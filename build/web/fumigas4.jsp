<%-- 
    Document   : fumigas4
    Created on : 6/10/2016, 08:05:03 PM
    Author     : LUIS
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="tp" class="Controladores.ConsultasSQL" scope="page"></jsp:useBean>

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
        <link href="css/fumiga1.css" rel="stylesheet" type="text/css"/>
        <link href="css/nuevo_insumo.css" rel="stylesheet" type="text/css"/>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <script src="Js/funcionesFumigas.js" type="text/javascript"></script>
        <title>Fumiga 4</title>
        <%
            session.setAttribute("nombre_fumiga", "fumiga 4");
        %>
    </head>
    <body class="fondo">
        <div id="toplogo">
        <h1 id="logo">
            <a href="Inicio.jsp" title="Coagronorte-Cooperativa Agropecuaria Norte de Santander"></a>
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
                                    <li><a href="#"><%=nombre%></a>
                                    <li><a href="Session">Cerrar Sesion</a>
                                </ul>
                        </nav>
                </section>
        </header>
        <img src="ImagenesR/cosecha-1.png" style="width: 100%; height: 400px; position: absolute">
        <div id="contenedor">
            <form action="Fumigas" id="Fumigas" method="post" id="data">
                <div id="cuerpo">
                    <h3 style="margin-left: 570px; font-size: 22px; font-family: Times New Roman;">Lote: <input type="text" name="num_lote" size="6" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"></h3>
                    <h1 style="margin-top: 50px; font-size: 28px; font-family: Times New Roman;">FUMIGA 4</h1>
                    <table border="0" style="font-size: 20px; font-family: Times New Roman; margin-left: 260px; margin-top: 80px;">
                        <tr>
                            <td><b>Fecha:</b></td>
                            <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-tF" type="date" name="fecha"></td>
                        </tr>
                        </table>
                    <div id="tabla">
                        <div align="center">
                            <table border="0" style="margin: 0%; text-align: center; margin-top: 30px;">
                                <tr>
                                    <td colspan="3"> <h2 style="font-family: Times New Roman; font-size: 26px; margin-right: 30px; margin-bottom: 30px;">Mano De Obra</h2></td>
                                </tr>
                                <tr align="center" style="font-family: Times New Roman; font-size: 20px;">
                                    <td><p>Cantidad</p></td>
                                    <td><p>Valor</p></td>
                                    <td><div align="center">Valor Total</div></td>
                                </tr>
                                <tr>
                                    <td><input type="text" class="textbox" placeholder="Jornal" name="cantidadObra" id="cantidadObra" size="10" onchange="javascript: calcularManoObra()"></td>
                                    <td><input type="text" class="textbox" placeholder="Unitario" name="valorU" id="valorObra" size="10" onkeyup="calcularManoObra(); format(this)" onchange="format(this);"></td>
                                    <td><input type="text" class="textbox" style="background-color:#CCC;" name="valorT" readonly="readonly" id="valorTotalObra" size="10" onkeyup="format(this)" onchange="format(this)"/></td>
                                </tr>
                            </table>
                        </div>
                    </div>
                    <h2 style="margin-top: 60px; font-family: Times New Roman; font-size: 26px;">Insumos</h2>
                    <br>
                    <div class="pruebas-botones">
                                    <input style="font-size: 14px; font-family: Times New Roman;" type="button" value="Agregar Nueva Fila" onclick="agregarFilaTabla()"  class="agregar-insumo2" />
                                    <input style="font-size: 14px; font-family: Times New Roman;" id="open" type="button" value="Agregar Nuevo Insumo" class="agregar-insumo2" />
                                </div> 
                    <div id="tabla2">
                        <table border="0" style="font-size: 20px; font-family: Times New Roman;">
                            <thead>
                                <tr align="center">
                                    <td><p>Tipo</p></td>
                                    <td><p>Nombre</p></td>
                                    <td><p>Cantidad</p></td>
                                    <td><p>Unidad</p></td>
                                    <td><p>Valor</p></td>
                                    <td><p>Valor Total</p></td>
                                </tr>        
                            </thead>
                            <tbody id="cuerpoTabla">
                                <tr>
                                    <td>
                                        <% ResultSet rp = tp.listar_tipo_productos();
                                           ResultSet rp2 = tp.listar_tipo_productos();
                                        %>
                                        
                                        <select name="tipo_insumo" id="tipo_insumo" class="textbox" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;" onchange="combo_insumo(this, 0)">
                                            <option value="">Seleccione</option>
                                            <% while(rp.next()) { %>
                                            <option value="<%= rp.getString("tipo_insumo") %>"><%= rp.getString("tipo_insumo") %></option>
                                            <% } %>
                                        </select>
                                    </td>
                                    <td>
                                        <select name="nombre_insumo" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;" class="textbox" id="insumo0">
                                            <option value="">Seleccione</option>
                                        </select>
                                    </td>
                                    <td><input type="text" name="cantidad" style="width: 110px;" class="textbox" id="cantidadInsumos0" class="textbox" onchange="javascript: calcularInsumos(this, 0)"></td>
                                    <td>
                                        <div align="center">
                                            <select name="unidad" class="textbox" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;">
                                                <option name="unidad" value="seleccione">Seleccione</option>
                                                <option name="unidad" value="canecas">Canecas</option>
                                                <option name="unidad" value="centimetros cubicos">Centímetros Cúbicos</option>
                                                <option name="unidad" value="Galones">Galones</option>
                                                <option name="unidad" value="litros">Litros</option>
                                                <option name="unidad" value="kilogramos">Kilogramos</option>
                                                <option name="unidad" value="gramos">Gramos</option>
                                                <option name="unidad" value="miligramos">Miligramos</option>
                                            </select>                                        
                                        </div>
                                    </td>
                                    <td>
                                        <div align="center">
                                            <input type="text"  style="width: 110px;" name="valor_unitario" placeholder="Unitario" class="textbox" id="valorInsumos0" onkeyup=" calcularInsumos(this, 0) ;format(this, 0)" onchange="format(this, 0)"/>
                                        </div>
                                    </td>
                                    <td>
                                        <input type="text" name="valor_total" readonly="readonly" class="textbox" style="background-color:#CCC; width: 120px;"  id="valorTotalInsumos0" onkeyup="calcularTotales(this, 0); format(this, 0)" onchange="format(this, 0)"/>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div id="total">
                        <table border="0" align="center" style="font-size: 20px; font-family: Times New Roman; margin-left: 20px;">
                            <tr>
                                <td><font size="+1">Costo Total:</font></td>
                                <td>
                                    <input type="text" name="suma_total" readonly="readonly" class="textbox" style="background-color:#CCC; width: 120px;" id="sumaTotal" onkeyup="format(this)" onchange="format(this)"/>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
                    <div class="cont-inputsF" style="margin-top: 90px;">
                        <input type="button" onclick="VentanaEmergente()" class="agregar-insumo" value="GUARDAR"/>
                        <input name="cerrar"  type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'inicio_fumigas.jsp'"/>
                   </div>
            </form>
                                        
  <div id="popup" style="display: none; margin-top: -170%; margin-left: -250px;">
    <div class="">
        <div class="wrap-a_iinsumo">
            <div class="contenedor-a_insumoF" >                
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
                                    <select style="font-size: 16px; font-family: Times New Roman;" class="textbox" name="clasificacion" id="clasificacion">
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
                                <input type="button" name="guardar" value="AGREGAR " class="agregar-insumo" onclick="javascript: agregarInsumo();">
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
            
            function agregarInsumo(){
                var clasificacion = $('#clasificacion').val();
                var nombre_insumo = $('#nombre_insumo').val();
                
                clasificacion = encodeURIComponent(clasificacion);
                nombre_insumo = encodeURIComponent(nombre_insumo);
                $.post("insumonuevo?clasificacion=" + clasificacion + "&nombre_insumo=" + nombre_insumo, function (data){
                    if (data.resultado == 'OK') {
                        
                        combo_insumo(document.getElementById('tipo_insumo'), 0);
                        cerrarDialogo();
                    }else {
                        alert(data.error);
                    }
                }, "json");
            }
            
            var contadorFilas = 0;
            function agregarFilaTabla(){
            contadorFilas++;
            var i = contadorFilas;
            var fila_nueva = '<tr>'+
                        '<td><select name="tipo_insumo" id="tipo_insumo" class="textbox" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;" onchange="combo_insumo(this,' + i + ')"><option value="">Seleccione</option><% while(rp2.next()) { %> <option value="<%= rp2.getString("tipo_insumo") %>"><%= rp2.getString("tipo_insumo") %></option><% } %></select></td>'+
                        '<td><select name="nombre_insumo" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;" class="textbox" id="insumo' + i +'"><option value="">Seleccione</option></select></td>'+
                        '<td><input type="text" style="width: 110px;" name="cantidad" class="textbox" id="cantidadInsumos' + i + '" onchange="javascript: calcularInsumos(this,' + i + ')"></td>'+
                        '<td><div align="center"><select name="unidad" class="textbox" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 25px;"><option name="unidad" value="seleccione">Seleccione</option><option name="unidad" value="canecas">Canecas</option><option name="unidad" value="centimetros cubicos">Centímetros Cúbicos</option><option name="unidad" value="Galones">Galones</option><option name="unidad" value="litros">Litros</option><option name="unidad" value="kilogramos">Kilogramos</option><option name="unidad" value="gramos">Gramos</option><option name="unidad" value="miligramos">Miligramos</option></select></div></td>'+
                        '<td><div align="center"><input type="text" style="width: 110px;" name="valor_unitario" placeholder="Unitario" class="textbox" id="valorInsumos'+ i + '" onkeyup=" calcularInsumos(this,' + i + ') ;format(this,' + i + ')" onchange="format(this,' + i + ')"/></div></td>'+
                        '<td><input type="text" name="valor_total" readonly="readonly" class="textbox" style="background-color:#CCC; width: 120px;" id="valorTotalInsumos'+ i + '" onkeyup="calcularTotales(this,' + i + '); format(this,' + i + ')" onchange="format(this,' + i + ')"/></td>'+
                        '</tr>';
                $("#cuerpoTabla").append(fila_nueva);
        }
</script>
 
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
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_pagina" align="center">
            </div>
        </footer>
    </body>
</html>