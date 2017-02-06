<%-- 
    Document   : pajareo
    Created on : 04-ago-2016, 13:07:31
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
        <script src="Js/funciones_despalille_corta.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <link href="css/CssDespalille_Corta.css" rel="stylesheet" type="text/css"/>
        <title>Pajareo</title>
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
                <div id="contenedorPajareo">
                    <form action="Pajareo" id="Pajareo" method="post">
                    <h3 style="font-size: 22px; font-family: Times New Roman; margin-left: 500px; margin-top: 25px;">Lote: <input type="text" id="lote" name="numLote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h3>
                    <h1 align="center" style="margin-top: 50px; font-size: 28px; font-family: Times New Roman;">PAJAREO - CELADURÍA<br> DE PATOS</h1>
                    <table border="0" style="height: 40px; width: 225px; margin-left: 250px; margin-top: 30px;">
                    <tr>
                        <td><b style="font-size: 20px; font-family: Times New Roman;">Fecha:</b></td>
                        <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-t" type="date" name="fecha"></td>
                    </tr>
                    </table>
                    <br><br><br>
            <table border="0" id="tabla">
                <tr>
                    <td width="167"><div align="center"><br><br><strong style="font-size: 20px; font-family: Times New Roman;">Mano de Obra</strong></div></td>
                    <td width="130"><div align="center"><br>
                            <p><strong style="font-size: 20px; font-family: Times New Roman;">Cantidad</strong></p><br>       
                            <input class="textbox" name="cantidadManoObra" placeholder="Jornales" id="cantidadManoObra" onchange="javascript: calcularManoObra(this)"/>
                    </div></td>
                    <td width="141" align="center"><br>
                        <p><strong style="font-size: 20px; font-family: Times New Roman;">Valor</strong></p><br>
                    <input class="textbox" name="valorManoObra" placeholder="Unitario" id="valorManoObra" onkeyup="calcularManoObra(); format(this)" onchange="format(this)" /></td>
                    <td width="141">
                        <div align="center"><br>
                            <p><strong style="font-size: 20px; font-family: Times New Roman;">Valor total</strong></p><br>
                            <input class="textbox" style="background-color:#CCC; width: 100px;" name="valorTotalManoObra" id="valorTotalManoObra" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotales(); format(this)" style="background-color:#E0E0E0;" />
                        </div></td>
                </tr>
                <tr>
                    <td> <br><br><br>
                    <div align="center"><strong style="font-size: 20px; font-family: Times New Roman;">Pólvora</strong></div></td>
                    <td><div align="center">
                    <br><br><br>
                    <p>
                        <input class="textbox" name="cantidadPolvora" placeholder="Jornales" id="cantidadPolvora" onchange="javascript: calcularPolvora(this)"/>
                    </p>
                    </div></td>
                    <td><div align="center">
                    <br><br><br>
                    <p>
                        <input class="textbox" name="valorPolvora" placeholder="Unitario" id="valorPolvora" onkeyup="calcularPolvora(); format(this)" onchange="format(this)" />
                    </p>
                    </div></td>
                    <td><div align="center">
                    <br><br><br>
                    <p>
                       <input class="textbox" style="background-color:#CCC; width: 100px;" name="valorTotalPolvora" id="valorTotalPolvora" readonly="valorTotal" onkeyup="format(this)" onchange="calcularTotales(); format(this)" style="background-color:#E0E0E0;" />
                    </p>
                    </div></td>
                </tr>
                  </tr>
                <tr>
                    <td></td>
                    <td></td>
                 <td><div align="center">
                    <br><br><br>
                    <p><strong style="font-size: 20px; font-family: Times New Roman;">Total</strong></p>
                    </div>
                 </td>
                    <td><div align="center">
                    <br><br><br>
                    <p><input class="textbox" style="background-color:#CCC; width: 100px;" name="total" id="sumaTotal" readonly="Total" onkeyup="format(this)" onchange="calcularTotales(); format(this)" style="background-color:#E0E0E0;"/></p>
                        </div>
                    </td>
                </tr>
            </table>
                    <div class="cont-inputs" style="margin-top: 25px; margin-left: -6px;">
                        <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergenteP()" class="agregar-insumo" value="GUARDAR"/>
                        <input style="font-family: Times New Roman;" name="cerrar" type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'cosecha.jsp'"/>
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
