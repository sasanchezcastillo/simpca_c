<%-- 
    Document   : nivelacionSuelo
    Created on : 3/08/2016, 04:57:06 PM
    Author     : Angelita
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page contentType="text/html" import="Controladores.ConsultasSQL" errorPage="" %>
<!DOCTYPE html>
<html lang="es">
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
        <link href="css/css_responsive.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <script src="Js/nivSuelo.js" type="text/javascript"></script>
        <title>Preparaci&oacute;n de Suelo</title>
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
        <div id="contenedorN">
            <div id="cuerpo">
                <form action="RegistrarPS" id="RegistrarPS" method="post">
                <table border="0" style="margin-left:75%; margin-top: 35px; font-size: 22px; font-family: Times New Roman;">
                    <tbody>
                        <tr>
                            <td style=" margin-top:-28px;"><b>Lote: </b></td>
                            <td><input type="text" name="lote" style="width:50px; height: 30px; font-size: 20px; font-family: Times New Roman; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></td>
                        </tr>
                    </tbody>
                </table>
                <H1 style="margin-left: 320px; margin-top: 30px; font-family: Times New Roman;">PREPARACI&Oacute;N DE SUELO</H1>
                <p>
                <table  style="margin-left: 400px; margin-top: 50px; font-size: 20px; font-family: Times New Roman;">
                    <tr>
                        <td><b>Fecha:</b></td>
                        <td><input type="date" style="width: 150px;" class="textbox-f-t" name="fechaNS" required=""/></td>
                    </tr>
                </table>
                <div id="rwd">
                    <table border="0" style="margin-left: 75px; margin-top: 50px; font-size: 20px; font-family: Times New Roman; width: 800px;" class="rwd_auto">
                        <thead>
                            <tr>
                                <th style="background: none;"></th>
                                <th style="background: none;">Cantidad</th>
                                <th style="background: none;">Pases</th>
                                <th style="background: none;">Valor</th>
                                <th style="background: none;">Valor Total</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td style="width: 180px;"><input style="background: none; font-size: 20px; font-family: Times New Roman;" type="text" id="tipo_preparacions"  class="textbox" name="tipo_preparacions" value="Caballoneo" readonly=""/></td>
                                <td><input class="textbox" type="text" name="cantCab" placeholder="Hectareas/Horas" id="cantCab" onchange="calcularTotalCaballoneo(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesCab" id="pasesCab" onchange="calcularTotalCaballoneo(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioCab" id="valorUnitarioCab"  onkeyup="calcularTotalCaballoneo(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalCab" id="valorTotalCab" readonly="" style="background-color: gainsboro" onkeyup="format(this)" onchange="calcularTotalCaballoneo(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Cincel" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantCin" placeholder="Hectareas/Horas" id="cantCin" onchange="calcularTotalCincel(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesCin" id="pasesCin" onchange="calcularTotalCincel(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioCin" id="valorUnitarioCin" onkeyup="calcularTotalCincel(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalCin" id="valorTotalCin" readonly="" style="background-color: gainsboro" onkeyup="format(this)" onchange="calcularTotalCincel(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Grada" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantGrada" placeholder="Hectareas/Horas" id="cantGrada" onchange=" calcularTotalGrada(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesGrada" id="pasesGrada" onchange="calcularTotalGrada(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioGrada" id="valorUnitarioGrada" onkeyup="calcularTotalGrada(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalGrada" id="valorTotalGrada" readonly="" style="background-color: gainsboro" onkeyup="format(this)" onchange="calcularTotalGrada(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Pala" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantPala" placeholder="Hectareas/Horas" id="cantPala" onchange="calcularTotalPala(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesPala" id="pasesPala" onchange="calcularTotalPala(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioPala" id="valorUnitarioPala" onkeyup="calcularTotalPala(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalPala" id="valorTotalPala" readonly="" style="background-color: gainsboro" onchange="calcularTotalPala(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Pala Cajón" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantPC" placeholder="Hectareas/Horas" id="cantPC" onchange="calcularTotalPC(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesPC" id="pasesPC" onchange="calcularTotalPC(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioPC" id="valorUnitarioPC" onkeyup="calcularTotalPC(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalPC" id="valorTotalPC" readonly="" style="background-color: gainsboro" onchange="calcularTotalPC(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Pala Laser" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantPL" placeholder="Hectareas/Horas" id="cantPL" onchange="calcularTotalPL(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesPL" id="pasesPL" onchange="calcularTotalPL(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioPL" id="valorUnitarioPL" onkeyup="calcularTotalPL(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalPL" id="valorTotalPL" readonly="" style="background-color: gainsboro" onchange="calcularTotalPL(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Palo" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantPalo" placeholder="Hectareas/Horas" id="cantPalo" onchange="calcularTotalPalo(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesPalo" id="pasesPalo" onchange="calcularTotalPalo(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioPalo" id="valorUnitarioPalo" onkeyup="calcularTotalPalo(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalPalo" id="valorTotalPalo" readonly="" style="background-color: gainsboro" onchange="calcularTotalPalo(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Rastra" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantRastra" placeholder="Hectareas/Horas" id="cantRastra" onchange="calcularTotalRastra(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesRastra" id="pasesRastra" onchange="calcularTotalRastra(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioRastra" id="valorUnitarioRastra" onkeyup="calcularTotalRastra(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalRastra" id="valorTotalRastra" readonly="" style="background-color: gainsboro" onchange="calcularTotalRastra(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Rastrillo" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantRast" placeholder="Hectareas/Horas" id="cantRast" onchange="calcularTotalRastrillo(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesRast" id="pasesRast" onchange="calcularTotalRastrillo(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioRast" id="valorUnitarioRast" onkeyup="calcularTotalRastrillo(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalRast" id="valorTotalRast" readonly="" style="background-color: gainsboro" onchange="calcularTotalRastrillo(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Taipa" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantTaipa" placeholder="Hectareas/Horas" id="cantTaipa" onchange="calcularTotalTaipa(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesTaipa" id="pasesTaipa" onchange="calcularTotalTaipa(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioTaipa" id="valorUnitarioTaipa" onkeyup="calcularTotalTaipa(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalTaipa" id="valorTotalTaipa" readonly="" style="background-color: gainsboro" onchange="calcularTotalTaipa(); format(this)"/></td>
                            </tr>

                            <tr>
                                <td><input style="background: none; font-size: 20px; font-family: Times New Roman;" class="textbox" type="text" id="tipo_preparacions" name="tipo_preparacions" value="Zanjadora" readonly=""</td>
                                <td><input class="textbox" type="text" name="cantZanja" placeholder="Hectareas/Horas" id="cantZanja" onchange="calcularTotalZanja(this)"/></td>
                                <td><input class="textbox" type="text" name="pasesZanja" id="pasesZanja" onchange="calcularTotalZanja(this)"/></td>
                                <td><input class="textbox" type="text" placeholder="Unitario" name="valorUnitarioZanja" id="valorUnitarioZanja" onkeyup="calcularTotalZanja(); format(this)" onchange="format(this)"/></td>
                                <td><input class="textbox" type="text" name="valorTotalZanja" id="valorTotalZanja" readonly="" style="background-color: gainsboro" onchange="calcularTotalZanja(); format(this)"/></td>
                            </tr>
                    </table>
                    <table border="0" style="margin-left: 650px; margin-top: -25px;">
                            <tr>
                                <td style="font-size: 22px; font-family: Times New Roman;"><b>Total: </b></td>
                                <td style="width: 140px;"><input type="text" name="Total" id="Total" class="textbox" readonly="" style="background-color: gainsboro; margin-left: 10px; margin-top: 5px;" onkeyup="format(this)" onchange="calcularTotal(); format(this)"/></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="pruebas-botones2" style="margin-top: -6%;">
                        <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergente()" id="guardar" value="GUARDAR"    class="agregar-insumo">
                        <input style="font-family: Times New Roman;" type="button" id="close" name="guardar" value="CERRAR"   class="agregar-insumo" onclick="location.href='preparacion_de_lotes.jsp'">
                    </div>   
                    </div>
                </div>
                </form>
            </div>
        </div>
        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaPS" align="center">
            </div>
        </footer>
    </body>
</html>
