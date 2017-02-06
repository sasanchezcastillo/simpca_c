
<%-- 
    Document   : preparacion_de_lotes
    Created on : 12/08/2016, 01:14:10 PM
    Author     : Aprendiz: Deiby Brayan Diaz R. ADSI 954687
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
        <link href="css/css1(Quema fisica).css" rel="stylesheet" type="text/css"/>
        <link href="imagenes/favicon.ico" rel="icon"/>
        <script src="Js/FuncionesQuemaFisica.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Quema Fisica</title>
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
    <div id="contenedor" aling="center">
        <div class="table">
            <form action="QuemaFisica" id="QuemaFisica" method="post" autocomplete="off">
                <h3 style="font-size: 22px; font-family: Times New Roman;">Lote: <input type="text" name="loteN" style="width:50px; height: 30px; font-size: 20px; font-family: Times New Roman;  background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"></h3>
                    
                <h1 style="font-family: Times New Roman;">QUEMA FÍSICA</h1>
                    <table style="width: 20%; margin-left: 35%; margin-top: 40px; font-family: Times New Roman; font-size: 20px;">
                        <tr>
                            <td><b>Fecha:</b></td>
                            <td><input style="font-size: 16px; font-family: Times New Roman;" name="fechaQF" class="textbox-f-t" type="date"/></td>
                            
                        </tr>
                    </table>  
                     <table id="tabla_contenedor" style="font-size: 20px; font-family: Times New Roman;">
                     <tr>
                         <td colspan="3" align="center" style="font-size: 22px;"><b>Mano de Obra</b></td>
                     </tr>
                     <tr>
                         <td align="center"><b>Cantidad</b></td>
                         <td align="center"><b>Valor</b></td>
                         <td align="center"><b>Valor Total</b></td>
                     </tr>
                     <tr>
                            <td align="center"><input type="text" class="textbox" placeholder="Jornal" name="cantidadMO" id="cantidadMO" onchange="calcularManoObraFisica()" /></td>
                            <td align="center"><input type="text" class="textbox" name="valorUnidadMO" id="valorUnidadMO" required="" placeholder="Unitario" onkeyup="calcularManoObraFisica(); formatFisica(this)" onchange="formatFisica(this)"/></td>
                            <td align="center"><input type="text" class="textbox" style="background-color:#CCC" name="valorTotalMO" id="valortotal" onkeyup="formatFisica(this)" onchange="calcularTotales(); formatFisica(this)" readonly=""/></td>
                     </tr>
                </table>
                            
                    <table  style="margin-left: 1.2%; width: 700px; height: 150px; margin-top: 40px; font-size: 20px; font-family: Times New Roman;">
                        <tr>
                            <td colspan="4" align="center" style="font-size: 22px;"><b>Insumos Combustible</b></td>
                        </tr>
                        <tr>
                            <td align="center"><b>Cantidad</b></td>
                            <td align="center"><b>Unidad</b></td>
                            <td align="center"><b>Valor</b></td>
                            <td align="center"><b>Valor Total</b></td>
                        </tr>
                        <tr>
                            <td align="center"><input type="text" class="textbox" name="cantidadins" id="cantidadins" required="" onchange="calcularInsumosFisica(this)"  /></td>
                            <td align="center" style="width: 200px;">
                                <select style="font-size: 16px; font-family: Times New Roman; width: 120px; height: 26px;" name="dosisins" class="textbox">
                                        <option name="dosisins" value="NULL">Seleccione</option>
                                        <option name="dosisins" value="LITROS">Litros</option>
                                        <option name="dosisins" value="GALONES">Galones</option>
                                        <option name="dosisins" value="CANECAS">Canecas</option>
                                  </select>
                            </td>
                            <td align="center"><input type="text" class="textbox" name="valorUnitarioins" placeholder="Unitario"  id="valor" onkeyup="formatFisica(this); calcularInsumosFisica(this)" onchange="formatFisica(this)"/></td>
                            <td align="center" style="width: 170px;"><input type="text" class="textbox" style="background-color:#CCC" name="valorTotalins"  id="valorTotalins" onkeyup="formatFisica(this); calcularTotalesFisica(this)" onchange="formatFisica(this)" readonly="valorTotalins"/></td>
                        </tr>
                    </table>
                    <table  style="margin-left: 51%; margin-top: 40px; font-size: 20px; font-family: Times New Roman;">
                        <tr>
                            <td align="center" style="width: 150px;"><B>Costo Total</B></td>
                            <td style="width: 170px;"><input type="text" class="textbox" style="background-color:#CCC" name="valorTotalQF" id="valorTotalQF" onkeyup="formatFisica(this)" onchange="calcularTotalesFisica(this); formatFisica(this)" readonly="valorTotalQF" /></td>
                        </tr>   
                    </table>    
                    <div class="pruebas-botones2" style="margin-left: -60px;">
                        <input style="font-family: Times New Roman;" type="button" value="GUARDAR" onclick="VentanaEmergente()" class="agregar-insumo">
                        <input style="font-family: Times New Roman;" type="button" id="close" name="guardar" value="CERRAR" class="agregar-insumo" onclick="location.href='preparacion_de_lotes.jsp'">
                  </div>    
         </form>
        </div>
    </div>
    <footer>
        <!--Pie de Pagina-->
        <div id="pie_pagina" align="center">
        </div>
    </footer>
</body>

</html>
