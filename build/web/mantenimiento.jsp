
<%-- 
    Document   : mantenimiento
    Created on : 16/08/2016, 05:11:00 PM
    Author     : LENOVO
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="con" class="Controladores.ConsultasSQL" scope="page"></jsp:useBean>
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
        <title>Mantenimiento</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos_mantenimiento.css" rel="stylesheet" type="text/css"/>
        <link href="css/nuevo_insumo.css" rel="stylesheet" type="text/css"/>
        <script src="Js/FuncionesMantenimiento.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>


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
        <img src="ImagenesR/lote-1.png" style="width: 100%; height: 400px; position: absolute">
        <div id="contenedor">
            <form action="Mantenimiento" id="Mantenimiento" method="post" id="data" name="form1">
                <div id="cuerpo">
                    <h3 style="margin-left: 570px; font-size: 22px; font-family: Times New Roman;">Lote: <input type="text" name="numlote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px;  background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h3>
                    <h1 style="margin-top: 60px; font-size: 28px; font-family: Times New Roman;">MANTENIMIENTO DEL LOTE</h1>
                    <h2 style="font-size: 22px; font-family: Times New Roman;">(CABALLONES Y CANALES)</h2>
                    <table border="0" style="margin-left: 315px; margin-top: 40px; font-family: Times New Roman; font-size: 20px;">
                        <tr>
                            <td><b>Fecha:</b></td>
                            <td style="width: 150px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-t" type="date" name="fecha"></td>
                        </tr>
                    </table>
                    <div id="tabla1" style="font-family: Times New Roman; font-size: 20px;">
                        <td>Tipo de limpieza</td>
                        <select class="textbox-f-t" name="tipolimpieza" style="font-family: Times New Roman; font-size: 16px;">
                            <option name="tipolimpieza" value="Seleccionar">Seleccionar</option>
                            <option name="tipolimpieza" value="Caballones">Caballones</option>
                            <option name="tipolimpieza" value="Desagues">Canales</option>
                        </select>

                        <div id="tabla2" style="text-align:center; font-family: Times New Roman; font-size: 20px;">
                            <h2 style="font-family: Times New Roman; font-size: 26px; margin-right: 30px; margin-bottom: 30px;">Mano De Obra</h2>
                            <br>
                            <table width="59%" border="0" align="center" style="margin:0 auto;">
                                <tr>
                                    <td width="15%">Cantidad</td>              
                                    <td width="15%">Valor</td>
                                    <td width="15%">Valor Total</td>                
                                </tr>
                                <tr>
                                    <td><input class="textbox" style="width: 120px; height: 26px;" name="cantidadjornal" type="text" placeholder="Jornal" id="Cantidad" onchange="calcularManoObra()"/></td>
                                    <td><input  class="textbox" style="width: 120px; height: 26px;" name="valorjornal" type="text" placeholder="Unitario" id="Valor" onkeyup="calcularManoObra(); format(this)" onchange="format(this)"/></td>
                                    <td><input class="textbox" name="valorTotalManoObra" type="text" readonly="readonly" id="ValorTotalObra" style="width: 120px; height: 26px; background-color:#CCC;" onkeyup="format(this)" onchange="calcularTotales(); format(this)"/></td>
                                </tr>
                            </table>
                            <div id="insumos" style="text-align:center">
                                <h2 style="font-family: Times New Roman; font-size: 26px; margin-right: 30px;  margin-bottom: 30px;">Insumos</h2>

                                <div class="pruebas-botones">
                                    <input style="font-size: 14px; font-family: Times New Roman;" type="button" value="Agregar Nueva Fila" onclick="agregarFilaTabla()"  class="agregar-insumo2" />
                                    <input style="font-size: 14px; font-family: Times New Roman;" id="open" type="button" value="Agregar Nuevo Insumo" class="agregar-insumo2" />
                                </div>   
                            </div>
                        </div>
                        <div  class="tabla2">
                            <table border="0" style="margin:0 auto; width: 800px; font-family: Times New Roman; font-size: 20px;">
                                <td width="113">Tipo</td>
                                <td width="113">Nombre</td>
                                <td width="61">Cantidad</td>
                                <td width="103">Unidad</td>
                                <td width="70">Valor</td>
                                <td width="73">Valor Total</td>

                                <tbody id="cuerpoTabla">
                                    <tr>
                                        <td>
                                            <%
                                                ResultSet rs = con.listar_tipo_productos();
                                                ResultSet rs2 = con.listar_tipo_productos();
                                            %>


                                            <select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;" class="textbox" name="tipo_insumo" id="tipo_insumo" onchange="combo_insumo(this, 0)" >
                                                <option value="">Seleccione</option>
                                                <% while (rs.next()) {%>
                                                <option value="<%= rs.getString("tipo_insumo")%>" ><%= rs.getString("tipo_insumo")%> </option>
                                                <%}%>

                                            </select>
                                        </td>

                                        <td>
                                            <select  name="nombre_insumo" class="textbox" id="insumo0" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;">
                                                <option value="">Seleccione</option>

                                            </select>
                                        </td>
                                        <td><input class="textbox" name="cantidad" type="text"  style="width: 100px; height: 26px;" id="CantidadInsumos0" onchange="calcularInsumos(this, 0)"/></td>
                                        <td>
                                            <select  class="textbox" name="unidadinsumo" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;">
                                                <option name="unidadinsumo" value="Seleccione">Seleccione</option>
                                                <option name="unidadinsumo" value="Canecas">Canecas</option>
                                                <option name="unidadinsumo" value="Galones">Galones</option>
                                                <option name="unidadinsumo" value="Litros">Litros</option>
                                                <option name="unidadinsumo" value="Kilogranos">Kilogramos</option>
                                                <option name="unidadinsumo" value="Gramos">Gramos</option>
                                                <option name="unidadinsumo" value="Miligramos">Miligramos</option>
                                            </select>
                                        </td>
                                        <td><input class="textbox"  name="valorunitario"  style="width: 100px; height: 26px;" placeholder="Unitario" type="text" id="ValorUnitario0" onkeyup="format(this, 0); calcularInsumos(this, 0)" onchange="format(this, 0)"/></td>
                                        <td><input class="textbox"  name="valorTotalInsumos" type="text"  style="width: 120px; height: 26px; background-color:#CCC;" readonly="readonly" id="ValorTotalInsumos0" style="background-color:#CCC" size="10" onkeyup="format(this, 0); calcularTotales(this, 0)" onchange="format(this, 0)"/></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                       <div class="cont-inputs">
                           <input style="font-family: Times New Roman;" type="button" id="Guardar" onclick="VentanaEmergente()" value="GUARDAR"/>
                            <input style="font-family: Times New Roman;" name="cerrar"  type="button" id="Cerrar" value="CERRAR" onclick="location.href = 'preparacion_de_lotes.jsp'"/>
                        </div>
                        <div id="Costo">
                            <table border="0" style="margin-top: -20px; margin-right: 7px; font-family: Times New Roman; font-size: 20px;" align="right">
                                <td>Costo Total: </td>
                                <td><input name="costototal" type="text" class="textbox" readonly="readonly" id="sumaTotal" style="width: 120px; height: 26px; background-color:#CCC;" onkeyup="format(this)" onchange="javascript: calcularTotales(this, 0); format(this)"/></td>
                            </table>
                        </div>
                    </div>
                </div>
        </div>
    </div>
</form>

<div id="popup" style="display: none; margin-top: -10%; margin-left: 40px;">
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
                                    <select style="font-size: 16px; font-family: Times New Roman;"  class="textbox" name="clasificacion" id="clasificacion">
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
        $.post("insumonuevo?clasificacion=" + clasificacion + "&nombre_insumo=" + nombre_insumo, function (data) {
            if (data.resultado == 'OK') {
                
                combo_insumo(document.getElementById('tipo_insumo'), 0);
                cerrarDialogo();
            } else{
                alert(data.error);
            }
        }, "json");
                
    }
    
    var contadorfilas = 0;
    function agregarFilaTabla() {
        contadorfilas++;
        var i = contadorfilas;
        var fila_nueva = '<tr>' +
                '<td><select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;" class="textbox" name="tipo_insumo" id="tipo_insumo" onchange="combo_insumo(this,' + i + ')"><option value="">Seleccione</option><% while (rs2.next()) {%><option value="<%= rs2.getString("tipo_insumo")%>" ><%= rs2.getString("tipo_insumo")%> </option><%}%></select></td>' +
                '<td><select class="textbox" name="nombre_insumo" class="Seleccione" id="insumo' + i + '" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;"><option value="">Seleccione</option></select></td>' +
                '<td><input class="textbox" name="cantidad" type="text" id="CantidadInsumos' + i + '" style="width: 100px; height: 26px;" onchange="calcularInsumos(this,' + i + ')"/></td>' +
                '<td><select class="textbox" style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;" name="unidadinsumo"><option name="unidadinsumo" value="Seleccione">Seleccione</option><option name="unidadinsumo" value="Canecas">Canecas</option><option name="unidadinsumo" value="Galones">Galones</option><option name="unidadinsumo" value="Litros">Litros</option><option name="unidadinsumo" value="Kilogranos">Kilogramos</option><option name="unidadinsumo" value="Gramos">Gramos</option><option name="unidadinsumo" value="Miligramos">Miligramos</option></select></td>' +
                '<td><input class="textbox" name="valorunitario" placeholder="Unitario" type="text" id="ValorUnitario' + i + '" style="width: 100px; height: 26px;" onkeyup="format(this,' + i + '); calcularInsumos(this,' + i + ')" onchange="format(this,' + i + ')"/></td>' +
                '<td><input  class="textbox"name="valorTotalInsumos" type="text" readonly="readonly" id="ValorTotalInsumos' + i + '" style="width: 120px; height: 26px; background-color:#CCC;" onkeyup="format(this,' + i + '); calcularTotales(this,' + i + ')" onchange="format(this, ' + i + ')"/></td>' +
                '</tr>';
        $("#cuerpoTabla").append(fila_nueva);
    }
</script>
</div>
<footer>
    <div id="footer" >
        <img src="imagenes/bg-footer.png"/>
    </div>
</footer>

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

</body>
</html>
