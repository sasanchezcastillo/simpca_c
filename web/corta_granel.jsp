<%-- 
    Document   : corta_granel
    Created on : 04-ago-2016, 15:33:53
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
        <link href="css/nuevo_insumo.css" rel="stylesheet" type="text/css"/>
        <script src="Js/funciones_despalille_corta.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <title>Corta Granel</title>
    </head>
     <body class="fondoCortaG">
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
        <div id="contenedorCortaGranel">
            <form action="Corta_Granel" id="Corta_Granel" method="post">
                <h3 style="font-size: 22px; font-family: Times New Roman; margin-left: 500px; margin-top: 25px;">Lote: <input type="text" id="lote" name="numLote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h3>           
                <h1 align="center" style="font-size: 28px; font-family: Times New Roman;">CORTA POR GRANEL</h1>
                    <table border="0" style="margin-left: 235px; margin-top: -25px; width: 70px; height: 40px; font-size: 20px; font-family: Times New Roman;">
                        <tr>
                            <td><b>Fecha:</b></td>
                            <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-t" type="date" name="fecha"></td>
                        </tr>
                        </table>
                    
                <table border="0" width="571" style="margin-top: 60px; font-size: 20px; font-family: Times New Roman;">
                <tr>
                    <td><div align="center"><br><br><strong>Máquina Llanta</strong></div></td>
                    <td><div align="center">
                            <p><strong>Cantidad</strong></p><br>
                            <p><input class="textbox" placeholder="Kilo" name="cantidadMqLlanta" id="cantidadMaquinaLlantaG" onchange="javascript: calcularMaquinaLlantaG(this)" /></p>
                        </div>
                    </td>
                   <td><div align="center">
                           <p><strong>Valor</strong></p><br>
                        <p><input class="textbox" name="valorMqLlanta" placeholder="Unitario" id="valorMaquinaLlantaG" onkeyup="calcularMaquinaLlantaG(); format(this)" onchange="format(this)" /></p>
                       </div>
                   </td>
                   <td><div align="center">
                           <p><strong>Valor Total</strong></p><br>
                        <p><input class="textbox" style="background-color:#CCC; width: 120px;" name="valorTotalMqLlanta" readonly="valorTotal" id="valorTotalMaquinaLlantaG" onkeyup="format(this)" onchange="calcularTotalesG(); format(this)" style="background-color:#E0E0E0;"/></p>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td><div align="center"><strong>Máquina Oruga</strong></div></td>
                    <td><div align="center"><br>
                        <p><input class="textbox" name="cantidadMqOruga" placeholder="Kilo" id="cantidadMaquinaOrugaG" onchange="javascript: calcularMaquinaOrugaG(this)" /></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input class="textbox" name="valorMqOruga" placeholder="Unitario" id="valorMaquinaOrugaG" onkeyup="calcularMaquinaOrugaG(); format(this)" onchange="format(this)" /></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p> <input class="textbox" style="background-color:#CCC; width: 120px;" name="valorTotalMqOruga" readonly="valorTotal" id="valorTotalMaquinaOrugaG" onkeyup="format(this)" onchange="calcularTotalesG(); format(this)" style="background-color:#E0E0E0;"/></p>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td><div align="center"><strong>Flete</strong></div></td>
                    <td><div align="center"><br>
                         <p><input class="textbox" name="cantidadFlete" placeholder="Tonelada" id="cantidadFleteG" onchange="javascript: calcularFleteG(this)" /></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input class="textbox" name="valorFlete" placeholder="Unitario" id="valorFleteG" onkeyup="calcularFleteG(); format(this)" onchange="format(this)" /></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p> <input class="textbox" style="background-color:#CCC; width: 120px;" name="valorTotalFlete" readonly="valorTotal" id="valorTotalFleteG" onkeyup="format(this)" onchange="calcularTotalesG(); format(this)" style="background-color:#E0E0E0;"/></p>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                       <div align="center"><br>
                            <p><br><strong>Valor</strong></p>
                        </div> 
                    </td>
                </tr>
                <tr>
                    <td><div align="center"><br>
                            <p><br><strong>Celaduría Máquina</strong></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <br><p><input class="textbox" name="valorCeladuriaMaquina" id="valorCeladuriaG" onkeyup="calcularTotalesG(); format(this)" onchange=" format(this)" /></p>
                      </div>
                    </td>
                </tr>
                <tr>
                    <td><div align="center">
                            <p><br><strong>Alimentación</strong></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                            <p><input class="textbox" name="valorAlimentacion" id="valorAlimentacionG" onkeyup="calcularTotalesG(); format(this)" onchange=" format(this)" /></p>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td><div align="center">
                        <p><br><strong>Administración</strong></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                      <p><input class="textbox" name="valorAdministracion" id="valorAdministracionG" onkeyup="calcularTotalesG(); format(this)" onchange=" format(this)" /></p>
                      </div>
                    </td>
                </tr>
                <tr>
                    <td><div align="center">
                        <p><strong><br>Transporte Máquina Oruga</strong></p>
                       </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input name="transporteoruga" class="textbox" id="transporteorugaG" onkeyup="calcularTotalesG(); format(this)" onchange=" format(this)"/></p>
                        </div>
                    </td>
                </tr>
                 <tr>
                    <td></td>
                    <td></td>
                    <td><div align="center">
                            <br><p><strong>Costo Total</strong></p>
                       </div>
                    </td>
                    <td><div align="center">
                            <br><p><input class="textbox" style="background-color:#CCC; width: 120px;" name="costoTotal" id="sumaTotalG" readonly="Total" onkeyup="format(this)" onchange="calcularTotalesG(); format(this)" style="background-color:#E0E0E0;" /></p>
                        </div>
                    </td>
                </tr>
            </table>
                <div class="pruebas-botonesCG" style="margin-top: -12px;">
                    <input type="button" onclick="VentanaEmergenteCG()" value="GUARDAR " class="agregar-insumo">
                    <input type="button" id="close" name="guardar" value="CERRAR" class="agregar-insumo" onclick="location.href = 'corta.jsp'">
                </div>
            </form>        
                <br> 
                </div>         
                   </div>
                     <div id="piepagina">
                <footer>
                <div id="footer"></div>
                </footer>
            </div> 
    </body>
</html>
