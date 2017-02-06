<%-- 
    Document   : corta_bultos
    Created on : 04-ago-2016, 15:33:34
    Author     : DAYA
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link href="css/CssDespalille_Corta.css" rel="stylesheet" type="text/css"/>
        <script src="Js/funciones_despalille_corta.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <link href="css/nuevo_insumo.css" rel="stylesheet" type="text/css"/>
        <title>Corta Por Bultos</title>
    </head>
      <body class="fondoCorta">
          <img src="ImagenesR/corta-1.png" style="width: 100%; height: 400px; position: absolute">
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
                <div id="contenedorCortaBultos">
                    <form action="Corta_Bultos" id="Corta_Bultos" method="post">
               <h3 style="font-size: 22px; font-family: Times New Roman; margin-left: 500px; margin-top: 27px;">Lote: <input type="text" id="lote" name="numLote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h3> 
                <h1 align="center" style="font-size: 28px; font-family: Times New Roman;">CORTA POR BULTOS</h1>
                
                <table border="0" style="margin-left: 235px; margin-top: -25px; width: 70px; height: 40px; font-size: 20px; font-family: Times New Roman;">
                        <tr>
                            <td><b>Fecha:</b></td>
                            <td style="width: 70px; "><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-t" type="date" name="fecha"></td>
                        </tr>
                        </table>
                
            <table border="0" width="584" style="font-size: 20px; font-family: Times New Roman;">
                <tr>
                            <td style="width: 210px;"><div align="center">
                                    <p><br></p><br>
                            <p><strong><br/>Máquina Llanta</strong></p>
                            </div></td>
                            <td><div align="center"><br >
                                    <p><strong>Cantidad</strong></p><br>
                                    <p><input name="cantidadMqLlanta" class="textbox" placeholder="Bulto" id="cantidadMaquinaLlantaB" onchange="javascript: calcularMaquinaLlantaB(this)"/></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                    <p><strong>Valor</strong></p><br>
                                <p><input name="valorMqLlanta" class="textbox" placeholder="Unitario" id="valorMaquinaLlantaB" onkeyup="calcularMaquinaLlantaB(); format(this)" onchange="format(this)" /></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                    <p><strong>Valor Total</strong></p><br>
                                <p><input name="valorTotalMqLlanta" class="textbox" style="background-color:#CCC; width: 120px;" id="valorTotalMaquinaLlantaB" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesB(); format(this)" style="background-color:#E0E0E0;" /></p>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td><div align="center">
                                <p><strong><br>Máquina Oruga</strong></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="cantidadMqOruga" class="textbox" placeholder="Bulto" id="cantidadMaquinaOrugaB" onchange="javascript: calcularMaquinaOrugaB(this)" /></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorMqOruga" class="textbox" placeholder="Unitario" id="valorMaquinaOrugaB" onkeyup="calcularMaquinaOrugaB(); format(this)" onchange="format(this)"/></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorTotalMqOruga" class="textbox" style="background-color:#CCC; width: 120px;" id="valorTotalMaquinaOrugaB" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesB(); format(this)" style="background-color:#E0E0E0;" /></p>
                            </div>
                            </td>
                        </tr>
                         <tr>
                            <td><div align="center">
                                <p><strong><br>Llenador</strong></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="cantidadLlenador" class="textbox" placeholder="Bulto" id="cantidadLlenadorB"  onchange="javascript: calcularLlenadorB(this)" /></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorLlenador" class="textbox" placeholder="Unitario" id="valorLlenadorB" onkeyup="calcularLlenadorB(); format(this)" onchange="format(this)" /></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                               <p><input name="valorTotalLlenador" class="textbox" style="background-color:#CCC; width: 120px;" id="valorTotalLlenadorB" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesB(); format(this)" style="background-color:#E0E0E0;" /></p>
                            </div>
                            </td>
                        </tr>
                         <tr>
                            <td><div align="center">
                                <p><strong><br>Tractor</strong></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="cantidadTractor" class="textbox" placeholder="Bulto" id="cantidadTractorB"  onchange="javascript: calcularTractorB(this)" /></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorTractor" class="textbox" placeholder="Unitario" id="valorTractorB" onkeyup="calcularTractorB(); format(this)" onchange="format(this)" /></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorTotalTractor" class="textbox" style="background-color:#CCC; width: 120px;" id="valorTotalTractorB" readonly="valorTotal" onkeyup="format(this)" onchange="calculatTotalesB(); format(this)" style="background-color:#E0E0E0;" /></p>
                            </div>
                            </td>
                        </tr> 
                         <tr>
                            <td><div align="center">
                                <p><strong><br>Bulteador</strong></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="cantidadBulteador" class="textbox" placeholder="Bulto" id="cantidadBulteadorB" onchange="javascript: calcularBulteadorB(this)" /></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorBulteador" class="textbox" placeholder="Unitario" id="valorBulteadorB" onkeyup="calcularBulteadorB(); format(this)" onchange="format(this)" /></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                    <p><input name="valorTotalBulteador" class="textbox" style="background-color:#CCC; width: 120px;" id="valorTotalBulteadorB" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesB(); format(this)" style="background-color:#E0E0E0;" /></p>
                            </div>
                            </td>
                        </tr>
                         <tr>
                            <td><div align="center">
                                <p><strong><br>Flete</strong></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="cantidadFlete" class="textbox" placeholder="Tonelada" id="cantidadFleteB" onchange="javascript: calcularFleteB(this)" /></p>
                                </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorFlete" class="textbox" placeholder="Unitario" id="valorFleteB" onkeyup="calcularFleteB(); format(this)" onchange="format(this)"/></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                    <p><input name="valorTotalFlete" class="textbox" style="background-color:#CCC; width: 120px;" id="valorTotalFleteB" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesB(); format(this)" style="background-color:#E0E0E0;" /></p>
                            </div>
                            </td>
                        </tr>
                         <tr>
                            <td><div align="center"></div></td>
                            <td><div align="center">
                                    <br><p><strong><br/>Valor</strong></p>
                                </div>
                            </td><br><br>
                        </tr>
                         <tr>
                            <td><div align="center">
                                <p><strong><br>Cabuya O Nylon</strong></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorCabuyaNylon" class="textbox" id="valorCabuyaNylonB" onkeyup="calcularTotalesB(); format(this)" onchange=" format(this)"/></p>
                                </div>
                            </td>
                        </tr>
                         <tr>
                            <td><div align="center">
                                <p><strong><br>Celaduría Máquina</strong></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorCeladuriaMaquina" class="textbox" id="valorCeladuriaMaquinaB"  onkeyup="calcularTotalesB(); format(this)" onchange=" format(this)"/></p>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td><div align="center">
                                <p><strong><br>Alimentación</strong></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorAlimentacion" class="textbox" id="valorAlimentacionB" onkeyup="calcularTotalesB(); format(this)" onchange=" format(this)"/></p>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td><div align="center">
                                <p><strong><br>Administración</strong></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="valorAdministracion" class="textbox" id="valorAdministracionB" onkeyup="calcularTotalesB(); format(this)" onchange=" format(this)"/></p>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td><div align="center">
                                <p><strong><br>Transporte Máquina Oruga</strong></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                <p><input name="transporteoruga" class="textbox" id="transporteorugaB" onkeyup="calcularTotalesB(); format(this)" onchange=" format(this)"/></p>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td><div align="center"><br>
                              <p><strong>Costo Total</strong></p>
                               </div>
                            </td>
                            <td><div align="center"><br>
                                    <p><input name="costoTotal" id="sumaTotalB" class="textbox" style="background-color:#CCC; width: 120px;" readonly="costoTotal" style="background-color:#E0E0E0;" onkeyup="format(this)" onchange="calcularTotalesB(); format(this)" /></p>
                               </div>
                            </td>
                        </tr>
            </table>
                <div class="pruebas-botonesCB" style="margin-top: -2px;">
                    <input type="button" onclick="VentanaEmergenteCB()" value="GUARDAR" class="agregar-insumo">
                    <input type="button" id="close" name="guardar" value="CERRAR" class="agregar-insumo" onclick="location.href = 'corta.jsp'">
                </div>
            </form>  
                </div>  
                </div>
            <div id="piepagina">
                <footer>
                <div id="footer"></div>
                </footer>
            </div>
    </body>
</html>
