<%-- 
    Document   : despaille
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
        <title>Despalille</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="imagenes/favicon.ico" rel="icon"/>
        <script src="Js/funciones_despalille_corta.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <link href="css/CssDespalille_Corta.css" rel="stylesheet" type="text/css"/>
    </head>
   <body class="fondo">
       <img src="ImagenesR/cosecha-1.png" style="width: 100%; height: 400px; position: absolute">
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
            
            <div id="contenedorDespalille">
                <form action="registrarD_E_M" id="registrarD_E_M" method="post">
                <h3 style="font-size: 22px; font-family: Times New Roman; margin-left: 500px; margin-top: 25px;">Lote: <input type="text" id="lote" name="numLote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h3>
            <h1 align="center" style="margin-top: 50px; font-size: 28px; font-family: Times New Roman;">DESPALILLE<br>ENTRESAQUE O MACHETEADA</h1>
            
            
                <table border="0" style="height: 40px; width: 225px; margin-left: 250px; margin-top: 30px;">
                    <tr>
                        <td><b style="font-size: 20px; font-family: Times New Roman;">Fecha:</b></td>
                        <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-t" type="date" name="fecha"></td>
                    </tr>
                </table>
        
            <table border="0">
                    <tr>       
                        <td width="169" height="30"><br></td>
                        <td width="135"><div align="center"><strong style="font-size: 20px; font-family: Times New Roman;">Cantidad</strong></div></td>
                        <td width="135"><div align="center"><strong style="font-size: 20px; font-family: Times New Roman;">Valor</strong></div></td>
                        <td width="141"><div align="center"><strong style="font-size: 20px; font-family: Times New Roman;">Valor Total</strong></div></td>
                </tr>
                <tr>
                <td><div align="center">
                    <p><strong style="font-size: 20px; font-family: Times New Roman;"><br>Mano de Obra Despalille</strong></p>
                    </div>
                </td>
                <td><div align="center"><br>
                        <p><input name="cantidadManoObraDespalille" placeholder="Jornal" class="textbox" id="cantidadDespallile" size="8" onchange="calcularMODespalille(this)"/></p>
                    </div>
                </td>
                <td><div align="center"><br>
                 <p><input name="precioManoObraDespalille" class="textbox" placeholder="Unitario" id="valorDespalille" onkeyup="calcularMODespalille(); format(this)" onchange="format(this)" /></p>
                    </div>
                </td>
                <td><div align="center"><br>
                        <p><input name="valorTotalDespalille" class="textbox" style="background-color:#CCC; width: 100px;" id="valorTotalDespalille" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesDEM(); format(thid-color:#CCC; width: 100px;"s)" style="background-color:#E0E0E0;" /></p>
                    </div>
                </td>
                </tr>
                <tr>
                    <td><div align="center">
                        <p><strong style="font-size: 20px; font-family: Times New Roman;"><br>Mano de Obra Entresaque</strong></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input name="cantidadManoObraEntresaque" placeholder="Jornal" class="textbox" id="cantidadEntresaque" onchange="javascript: calcularMOEntresaque(this)" /></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input name="precioManoObraEntresaque" placeholder="Unitario" class="textbox" id="valorEntresaque" onkeyup="calcularMOEntresaque(); format(this)" onchange="format(this)" /></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input name="valorTotalEntresaque" id="valorTotalEntresaque" class="textbox" style="background-color:#CCC; width: 100px;" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesDEM(); format(this)" style="background-color:#E0E0E0;" /> </p>
                       </div>
                    </td>
                </tr>
                <tr>
                    <td><div align="center">
                       <p><strong style="font-size: 20px; font-family: Times New Roman;"><br>Mano de Obra Macheteada</strong></p>
                    </div></td>
                    <td><div align="center"><br>
                        <p> <input name="cantidadManoObraMacheteada" placeholder="Jornal" class="textbox" id="cantidadMacheteada" onchange="javascript: calcularMOMacheteada(this)"/></p> 
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input name="precioManoObraMacheteada" placeholder="Unitario" class="textbox" id="valorMacheteada" onkeyup="calcularMOMacheteada(); format(this)" onchange="format(this)" /></p>
                        </div>
                    </td>
                    <td><div align="center"><br>
                        <p><input name="valorTotalMacheteada" class="textbox" style="background-color:#CCC; width: 100px;" id="valorTotalMacheteada" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotalesDEM(); format(this)" style="background-color:#E0E0E0;" /></p>                       </div>
                    </td>
                </tr>
                <tr>
                    <td><br></td>
                    <td><br></td> <br> <br>
                    <td><div align="center"> <br><br>
                        <p><strong style="font-size: 20px; font-family: Times New Roman;">Total </strong></p>
                        </div>
                    </td>
                    <td><div align="center"> <br><br>        
                            <p><input name="Total" class="textbox" style="background-color:#CCC; width: 100px;" id="sumaTotalDEM" readonly="Total" onkeyup="format(this)" onchange="calcularTotalesDEM(); format(this)" style="background-color:#E0E0E0;" /></p>
                        </div>
                    </td>
                </tr>
            </table>
                <div class="cont-inputs" style="margin-top: -32px; margin-left: -10px;">
                    <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergenteD()" class="agregar-insumo" value="GUARDAR"/>
                <input name="cerrar" style="font-family: Times New Roman;"  type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'cosecha.jsp'"/>
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
