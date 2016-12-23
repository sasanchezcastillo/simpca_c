<%-- 
    Document   : liquidacion
    Created on : 8/08/2016, 01:51:26 PM
    Author     : SENA
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
        <link href="css/cssLiquidacion.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <script src="Js/FuncionesLiquidacion.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <title>Liquidación</title>
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
       <img src="ImagenesR/corta-1.png" style="width: 100%; height: 400px; position: absolute">
       
       <form action="Liquidacion" id="Liquidacion" method="post">
         
        <div id="contenedor" align="center">
            <h3 style="font-size: 22px; font-family: Times New Roman; margin-left: 800px; margin-top: 35px;">Lote: <input type="text" id="lote" name="num_lote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h3>           
            <h1 style="margin-top: 60px;"><p>LIQUIDACIÓN</p></h1>
            <div class="pruebas-botonesL">
                <input style="margin-left: 80px; font-family: Times New Roman; font-size: 16px; " id="open" type="button"  onclick="agregarFilaTabla()" value="Agregar Nueva Fila" class="agregar-insumoL" />
            </div> 
               <div  class="tabla2" style="font-family: Times New Roman;">
                <div id="contenedor2" align="center">
                    <table align="center" border="0" style="margin-top: -210px; font-style: normal; font-size: 20px;">
                        <thead>
                        <td align="center"><b>Fecha</b></td>
                                <td align="center"><b>Tiquete</b></td>
                                <td align="center"><b>Peso Neto</b></td>
                                <td align="center"><b>Bultos</b></td>
                                <td align="center"><b>Peso Final</b></td>
                                <td align="center" colspan="2"><b>F(24/4)</b></td>
                                <td align="center"><b>K. Verdes</b></td>
                                <td align="center"><b>V. Unitario</b></td>
                                <td align="center"><b>Total</b></td>
                        </thead>
                            <tbody align="center" id="cuerpoTabla">
                            <td><input style="font-family: Times New Roman; font-size: 16px;" type="date" placeholder="Dia/Mes/Año" class="textboxF" name="fecha" id="fecha0" ></td>
                                    <td><input type="text" class="textbox" name="tiquete" id="tiquete0" ></td>
                                    <td><input type="text" class="textbox" name="pesoNeto" id="pesoNeto0" ></td>
                                    <td><input type="text" class="textbox" name="bultos" id="bultos0" ></td>
                                    <td><input type="text" class="textbox" name="pesoFinal" id="pesoFinal0" onchange="javascript: liquidacion(this, 0); format(this);" /></td>
                                    <td><input type="text" class="textbox" name="f24" id="fertilizante_a0" ></td>
                                    <td><input type="text" class="textbox" name="f4" id="fertilizante_b0"></td>
                                    <td><input type="text" class="textbox" name="kilosVerde" id="kilosVerde0"></td>
                                    <td><input type="text" class="textbox" name="valorUnitario" id="valorUnitario0" onkeyup="liquidacion(this, 0); format(this, 0);" onchange="format(this, 0)" /></td>
                                    <td><input type="text" class="textbox" style="background-color:#CCC; width: 120px;" name="valorTotal" id="valorTotal0" readonly="readonly" onkeyup="format(this, 0);" onchange="format(this, 0)" /></td>
                            </tbody>
                    </table>
                    <table align="center" width="1115" height="10" style="margin-top: 10px;" border="0">
                                <th align="center" height="25%" width="160">TOTALES</th>
                                <td height="15%" colspan="3" width="140px"></td>
                                <td align="center" width="86px"><input type="text" class="textbox" style="background-color:#CCC; width: 100px;" name="totalpesoFinal" id="TotalpesoFinal" readonly="readonly" onkeyup="format(this);" onchange="format(this)"></td>
                                <td height="15%" width="90px" colspan="2"></td>
                                <td align="center" width="86px"><input type="text" class="textbox" style="background-color:#CCC; width: 110px;" name="totalkilosVerde" id="TotalkilosVerde" readonly="readonly"></td>
                                <td align="center" width="86px"><input type="text" class="textbox" style="background-color:#CCC; width: 100px;" name="totalvalorUnitario" readonly="readonly" id="totalvalorUnitario" onkeyup="format(this);" onchange="format(this)" /></td>
                                <td align="center" width="50px"><input type="text" class="textbox" style="background-color:#CCC; width: 120px;" name="totalvalorTotal" readonly="readonly" id="totalvalorTotal" onkeyup="format(this);" onchange="format(this)" /></td>
                        </table>
                    </div>
                    </div>
            <div class="parafiscales">
                <table style="font-family: Times New Roman; font-size: 20px;">
                    <tr>
                        <th>Parafiscales</th>
                        <th></th>
                        <th>Fomento Arrocero</th>
                        <th>Asistencia Tecnica</th>
                        <th>Intereses</th>
                    </tr>
                    <tr>
                        <td>
                            <select class="textbox" name="select" id="select" onchange="selector(this.value)">
                                <option>Seleccione</option>
                                <option id="bolsa" value="bolsa">Bolsa Nacional Agropecuaria</option>
                                <option id="retencion" value="retencion">Retención Fuente</option>
                            </select>
                        </td>
                        <td><input type="text" class="textbox" id="option" name="select" readonly=""></td>
                        <td><input type="text" class="textbox" id="fomento-arrocero" name="retencion_fuente" readonly=""></td>
                        <td><input type="text" class="textbox" id="asistencia-tecnica" name="asistencia_tecnica" readonly="" value="0"></td>
                        <td><input type="text" class="textbox" id="intereses" name="intereses" readonly="" value="0"></td>
                    </tr>
                </table>
            </div>
            <div class="cont-inputsL" style="margin-top: -10px;">
                <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergenteL()" class="agregar-insumoL" value="GUARDAR"/>
                <input style="font-family: Times New Roman;" name="cerrar"  type="button" class="agregar-insumoL" value="CERRAR" onclick="location.href ='corta.jsp'"/>
            </div>
        </div>
    </form> 
    <div id="piepagina">
        <footer>
            <div id="footer"></div>
        </footer>
    </div>
</body>
</html>
