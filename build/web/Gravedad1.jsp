<%-- 
    Document   : Gravedad1
    Created on : 24/08/2016, 08:02:48 PM
    Author     : kelly
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    session.setAttribute("tipo_riego", "gravedad");
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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/estiloResponsive.css" rel="stylesheet" type="text/css"/>
        <script src="Js/scriptGravedad.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <title>Riego Gravedad</title>
    </head>
    
    <body class="fondoS">
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
        <form action="Gravedad" id="Gravedad" method="post" class="form-gravedad" autocomplete="off">
            <div class="contenedor-todo"> 
                <div class="contenedor-gravedad" style="text-align: center;">
                    <h4 style="font-size: 22px; font-family: Times New Roman; margin-left: 340px;">Lote: <input type="text" id="lote" name="lote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h4>
                    <div class="titulo">
                         <h1 style="font-size: 28px; font-family: Times New Roman;">TIPO DE RIEGO</h1>
                         <h2 style="font-size: 26px; font-family: Times New Roman;">GRAVEDAD O FANGEO</h2>
                    </div>
                    
                    
                    <table border="0" style="font-size: 20px; font-family: Times New Roman; margin-left: 180px; margin-top: 30px;">
                            <tr>
                                <td><b>Fecha:</b></td>
                                <td style="width: 70px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-t" type="date" name="fecha"></td>
                            </tr>
                    </table>
                    
                    <h3  style="font-size: 26px; font-family: Times New Roman; margin-top: 50px;">Mano de Obra</h3>
                    <div class="div-input">
                        <table class="tabla-gravedad" style="font-size: 20px; font-family: Times New Roman; margin-left: 130px;">
                            <tr>
                                <td><b>Cantidad</b></td>
                                <td><b>Valor</b></td>
                                <td><b>Valor Total</b></td>
                            </tr>
                            <tr> 
                                <td><input type="text" class="textbox" placeholder="Jornal" style="width: 100px;" name="cantidadObra" id="cantidadObra" onchange="javascript:calcularManoObra(this)" /></td>
                                <td><input type="text" class="textbox" placeholder="Unitario" style="width: 100px;" name="valorObra" id="valorObra" onkeyup="calcularManoObra(); format(this)" onchange="format(this)"/></td>
                                <td><input type="text" class="textbox" style="background-color:#CCC; width: 100px;" name="valorTotalObra" id="valorTotalObra" size="8" readonly="valorTotalObra" style="background-color:#E0E0E0; " onkeyup="format(this)" onchange="calcularTotales() ; format(this)"/></td>
                            </tr>        
                        </table>   
                    </div>
                        <h3 style="font-size: 26px; font-family: Times New Roman;">Pago Distrito</h3>
                        <label style="font-size: 20px; font-family: Times New Roman;"><b>Valor Tarifa</b></label><br>
                        <input type="text" name="valorTarifa" class="textbox" style="width: 100px;" id="valorTarifa" onkeyup="calcularTotales(); format(this)" onchange="format(this)" />
                        <br><label style="font-size: 20px; font-family: Times New Roman;"><b>Total</b></label>
                        <input type="text" name="total" id="sumaTotal" class="textbox" style="background-color:#CCC; width: 200px;" readonly="sumaTotal" onkeyup="format(this)" onchange="calcularTotales(); format(this)" onkeyup="format(this)"  style="background-color:#E0E0E0;"/>
                        
                        <div class="cont-inputs"  style="margin-top: -10px; margin-left: -4px;">
                                <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergente()" class="agregar-insumo" value="GUARDAR"/>
                                <input style="font-family: Times New Roman;" name="cerrar"  type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'cosecha.jsp'"/>
                            </div>
                        
                       <div id="texto-letra">
                                <ul class="menu-horizontal" align="center" style="font-size: 18px; font-family: Times New Roman; margin-top: -18px;  margin-left: 120px;">
                                    <li style="margin-right: 10px;"><a style="width:110px;" href="Gravedad1.jsp"></a>Riego<br/>Gravedad</li>
                                    <li><a style="width:110px;" href="Bombeo1.jsp"></a>Riego<br/>Bombeo</li>
                                </ul>
                            </div>
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
