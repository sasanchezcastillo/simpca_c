<%-- 
    Document   : Cortamaleza
    Created on : 3/08/2016, 03:11:28 PM
    Author     : LUIS
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
        <link href="css/Cortamaleza.css" rel="stylesheet" type="text/css"/>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <script src="Js/FuncionesCortaMaleza.js" type="text/javascript"></script>
        <title>Cortamaleza</title>
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
            <form action="CortaMaleza" id="CortaMaleza" method="post">
                <div id="cuerpo">
                    <h3 style="margin-left: 350px; font-size: 22px; font-family: Times New Roman;">Lote: <input type="text" name="numeroLote" size="6" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"></h3>
                    <h1 style="margin-top: 60px; font-size: 32px; font-family: Times New Roman;">MANEJO RESIDUOS DE COSECHA</h1>
                    <table border="0" style="margin-left: 230px; margin-top: 50px;">
                        <tr>
                            <td style="font-family: Times New Roman; font-size: 20px;"><b>Fecha:</b></td>
                            <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-tC" type="date" name="fecha"></td>
                        </tr>
                    </table>
                    <table border="0" style="margin-top: 60px; margin-left: 240px; font-family: Times New Roman; font-size: 20px;">
                        <tr>    
                            <td style="text-align: center; width: 70px;"><label>Tipo:</label></td>
                            <td style="width: 120px;"><select style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-tC" name="tipo">
                                <option name="tipo" value="Seleccione">Seleccione</option>
                                <option name="tipo" value="Guadañada">Guadañada</option>
                                <option name="tipo" value="CortaMaleza">CortaMaleza</option>
                                <option name="tipo" value="Desbrozadora">Desbrozadora</option>
                            </select>
                    </td>
                </tr>
     </table>
                        <table border="0" id="tabla1" align="center" style="text-align: center;">
                            <tr>
                                <td colspan="3" style="height: 80px; font-family: Times New Roman; font-size: 24px;">Mano de Obra</td>
                            </tr>
                            <tr style="font-family: Times New Roman; font-size: 20px;">
                                <td><p>Cantidad</p></td>
                                <td><p>Valor</p></td>
                                <td><p>Valor Total</p></td>
                            </tr>
                            <tr>
                                <td>
                                    <input class="textbox1" name="cantidad" placeholder="Hectáreas" id="cantidad" type="text" size="15" onchange="calcularTotal()"/>
                                </td>
                                <td>
                                    <input class="textbox1" name="valor" placeholder="Hectáreas" id="valor" type="text" size="10" onkeyup="format(this); calcularTotal()" onchange="format()"/>
                                </td>
                                <td>
                                    <input class="textbox1" style="background-color:#CCC" name="total" id="total" type="text" size="15" readonly="readonly" onkeyup="format(this); calcularTotal()" onchange="format()"/>
                                </td>
                            </tr>
                        </table>
                    <div class="cont-inputs" style="margin-top: 5px; margin-left: -5px;">
                        <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergente()" class="agregar-insumo" value="GUARDAR"/>
                        <input style="font-family: Times New Roman;" name="cerrar"  type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'preparacion_de_lotes.jsp'"/>
                   </div>
                </div>
            </form>  
        </div>
    <footer>
        <!--Pie de Pagina-->
        <div id="pie_paginaCM" align="center">
        </div>
    </footer>
    </body>
</html>
