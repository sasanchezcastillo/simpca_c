<%-- 
    Document   : Bombeo1
    Created on : 18/08/2016, 09:42:44 AM
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<!DOCTYPE html>
<html>
    <%
        session.setAttribute("tipo_riego", "Bombeo");
    %>
    
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
        <link href="css/estiloResponsive.css" rel="stylesheet" type="text/css"/>
        <script src="Js/scriptBombeo.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <title>Riego Bombeo</title>
    </head>
         
        <body class="fondoS"> <div id="toplogo">
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
            <form action="Bombeo" id="Bombeo" method="post" class="form-Bombeo" autocomplete="off">
                <div class="contenedor-todo">
                    <div class="contenedor-Bombeo" style="text-align: center;">
                        <h4 style="font-size: 22px; margin-left: 340px; font-family: Times New Roman;">Lote: <input type="text" id="lote" name="lote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h4>
                        <div class="titulo">
                            <h1 style="font-size: 28px; font-family: Times New Roman;">TIPO DE RIEGO</h1>
                            <h2 style="font-size: 26px; font-family: Times New Roman;">BOMBEO</h2>
                        </div>
                        
                        <table border="0" style="font-size: 20px; font-family: Times New Roman; margin-left: 190px; margin-top: 30px;">
                        <tr>
                            <td><b>Fecha:</b></td>
                            <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-t" type="date" name="fecha"></td>
                        </tr>
                    </table>
                    </div>
                        <br>
                        <table border="0" style="font-size: 20px; font-family: Times New Roman; margin-left: 30px; height: 270px;">
                            <tr>
                                <td></td>
                                <td><label><b>Cantidad</b></label> </td> 
                                <td><label><b>Valor</b></label></td>
                                <td><label><b>Valor Total</b></label></td>
                            </tr>
                            <tr>
                                <td><strong>Mano de obra</strong></td>
                                <td><input name="cantidadJornales" placeholder="jornal" class="textbox" id="cantidadObra"  onchange="javascript:cantidadObra(this)" /></td>
                                <td><input name="valorUnidad" placeholder="Unitario" class="textbox" id="valorObra" onkeyup="calcularManoObra(); format(this)" onchange="format(this)" /></td>
                                <td><input name="valorTotalManoObra" class="textbox" style="background-color:#CCC; width: 100px;" id="valorTotalObra" size="8" readonly="valorTotalObra" style="background-color:#E0E0E0;" onkeyup="format(this)" onchange="calcularTotales(); format(this)" /></td>
                            </tr>
                            <tr>
                                <td><strong>Aceite</strong></td>
                                <td><input name="cantidadAceite" placeholder="Jornal"  id="cantidadAceite" class="textbox" onchange="javascript:calcularAceite(this)" /></td>
                                <td><input name="valorAceite" placeholder="Unitario" id="valorAceite" class="textbox" onkeyup="calcularAceite(); format(this)" onchange="format(this)"/></td>
                                <td><input name="valorTotalAceite" id="valorTotalAceite" class="textbox" style="background-color:#CCC; width: 100px;" readonly="valorTotalAceite" style="background-color:#E0E0E0;" onkeyup="format(this)" onchange="calcularTotales(); format(this)" /></td>
                            </tr>          
                            <tr>
                                <td><strong>Combustible</strong></td>
                                <td><input name="cantidadCombustible" placeholder="Jornal" id="cantidadCombustible" class="textbox" onchange="javascript:calcularCombustible(this)"  /></td>
                                <td><input name="valorCombustible" placeholder="Unitario" id="valorCombustible" class="textbox" onkeyup="calcularCombustible(); format(this)" onchange="format(this)" /></td>
                                <td><input name="valorTotalCombustible" id="valorTotalCombustible" class="textbox" style="background-color:#CCC; width: 100px;" readonly="valorTotalCombustible"  style="background-color:#E0E0E0;" onkeyup="format(this)" onchange="calcularTotales(); format(this)"  /></td>
                            </tr>
                            <tr>
                                <td><strong>Alquiler Bomba</strong></td>
                                <td><input name="cantidadAlquilerBomba" placeholder="Jornal" id="cantidadBomba" class="textbox" onchange="javascript:calcularCombustible(this)"  /></td>
                                <td><input  name="valorAlquilerBomba" placeholder="Unitario" id="valorBomba" class="textbox" onkeyup="calcularAlquilerBomba(); format(this)" onchange="format(this)"/></td>
                                <td><input  name="valorTotalAlquiler" id="valorTotalBomba" class="textbox" style="background-color:#CCC; width: 100px;" readonly="valorTotalBomba"  style="background-color:#E0E0E0;" onkeyup="format(this)" onchange="calcularTotales(); format(this)" /></td>
                            </tr>
                            
                            <tr>
                                <td></td>
                                <td><label><b>Valor</b></label></td>
                                <td><label><b>Valor</b></label></td>
                                <td><label><b>Total</b></label></td>
                            </td>     
                            <tr>
                                <td><strong>Pago Tarifa</strong></td>
                                <td><input  name="valorDistrito" placeholder="Distrito" id="valorDistrito" class="textbox" onkeyup="calcularPagoTarifa(); format(this)" onchange="format(this)" /></td>
                                <td><input name="valorCorponor" placeholder="Corponor" id="valorCorponor" class="textbox" onkeyup="calcularPagoTarifa(); format(this)" onchange="format(this)" /></td>
                                <td><input name="totalTarifa" id="totalTarifa" class="textbox" style="background-color:#CCC; width: 100px;" readonly="valorTotalBomba" onkeyup="format(this)" onchange="calcularTotales(); format(this)" /></td>
                            </tr>
                        </table>
                            <h3 style="font-size: 20px; font-family: Times New Roman;">Total<input id="sumaTotal" name="total" class="textbox" style="background-color:#CCC; width: 200px;" readonly="sumaTotal"  onkeyup="format(this)" onchange="calcularTotales(); format(this)" style="background-color:#E0E0E0;"/></h3>
                            
                            <div class="cont-inputs" style="margin-top: -10px; margin-left: -4px;">
                                <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergente()"  class="agregar-insumo" value="GUARDAR"/>
                                <input style="font-family: Times New Roman;" name="cerrar"  type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'cosecha.jsp'"/>
                   </div>
                            <div id="texto-letra">
                                <ul class="menu-horizontal" align="center" style="font-size: 18px; font-family: Times New Roman; margin-top: -18px;  margin-left: 120px;">
                                    <li style="margin-right: 10px;"><a style="width:110px;" href="Gravedad1.jsp"></a>Riego<br/>Gravedad</li>
                                    <li><a style="width:110px;" href="Bombeo1.jsp"></a>Riego<br/>Bombeo</li>
                                </ul>
                            </div>
                    </div>
        </form>
            <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaSesion" align="center">
                </div>
            </footer>
    </body>
</html>
