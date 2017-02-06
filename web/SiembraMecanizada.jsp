<%-- 
    Document   : siembraMecanizada
    Created on : 11/08/2016, 05:04:39 PM
    Author     : Administrador
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
        <link href="imagenes/favicon.ico" rel="icon"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilosmecanizada.css" rel="stylesheet" type="text/css"/>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <script src="Js/script_smecaniz.js" type="text/javascript"></script>
        <title>SiembraMecanizada</title>
    </head>
    <body class="fondo" >
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
        <div id="contenedor" align="center">
            <form action="SiembraMecanizada" id="SiembraMecanizada" method="post">
                <div id="cuerpo">
                    <h3 style="margin-left: 420px; font-size: 22px; font-family: Times New Roman;">Lote: <input type="text" name="num_lote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"></h3>
                    <h1 style="margin-top: 50px; font-size: 28px; font-family: Times New Roman;">SIEMBRA MECANIZADA</h1>
                    
                    <table border="0" style="font-family: Times New Roman; font-size: 20px; margin-left: 240px; margin-top: 40px;">
                        <tr>
                            <td><b>Fecha:</b></td>
                            <td style="width: 100px;"><input style="font-size: 16px; font-family: Times New Roman;" class="textbox-f-tC" type="date" name="fecha"></td>
                        </tr>
                    </table>
                    
                    <table border="0" style="font-size: 20px; font-family: Times New Roman; text-align: left; width: 350px;  height: 350px; margin-left: 30px; margin-top: 50px;">
                        <tr>
                            <td>
                                Variedad Semilla:
                            </td>
                            <td>
                                <select style="font-size: 16px; font-family: Times New Roman;" class="textbox" name="variedad_semilla">
                                    <option name="variedad_semilla" value="seleccione">Seleccione</option>
                                    <option name="variedad_semilla" value="369">369</option>
                                    <option name="variedad_semilla" value="733">733</option>
                                    <option name="variedad_semilla" value="Caribe 8">Caribe 8</option>
                                    <option name="variedad_semilla" value="Colombia 21">Colombia 21</option>
                                    <option name="variedad_semilla" value="Clearafil">Clearfil</option>
                                    <option name="variedad_semilla" value="F 50">F 50</option>
                                    <option name="variedad_semilla" value="F 60">F 60</option>
                                    <option name="variedad_semilla" value="F 100">F 100</option>
                                    <option name="variedad_semilla" value="FedeArroz 2000">FedeArroz 2000</option>
                                    <option name="variedad_semilla" value="Garapato">Garapato</option>
                                    <option name="variedad_semilla" value="Pati Morado">Pati Morado</option>
                                    <option name="variedad_semilla" value="Orizica 1">Orizica 1</option>
                                    <option name="variedad_semilla" value="Orizica 2">Orizica 2</option>
                                    <option name="variedad_semilla" value="Orizica 3">Orizica 3</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <p></p>
                                <p><p>Costo de Labor</p></td>
                            </td>
                            <td><input class="textbox" type="text" placeholder="Sembradora" name="costo_maquina" id="costo_maquina_s" size="10" onkeyup="calculartotal(this); format(this)" onchange="javascript: calculartotal(this)"></td>
                        </tr>
                        <tr>
                            <td>
                                <p></p>
                                <p><p>Secado de Semilla:</p></td>
                            <td><input class="textbox" type="text" name="secado_semilla" id="costo_secado_s" size="10" onkeyup="calculartotal(this); format(this)" onchange="javascript: calculartotal(this)"></td>
                        </tr>
                        <tr>
                            <td>
                                <p></p>
                                <p><p>Número de Hectáreas</p></td>
                            <td><input class="textbox" type="text" placeholder="Sembradas" name="num_hect" id="Num_hectareas" size="10" onkeyup="calculartotal(this)" onchange="javascript: calculartotal(this)"></td>
                        </tr>
                        <tr>
                            <td>
                                <p></p>
                                <p>Costo Mano de Obra:</p>
                            </td>
                            <td><input  class="textbox" type="text" name="costo_mano_obra" id="costo_mano_obra" placeholder="Hectáreas" size="10" onkeyup="calculartotal(this); format(this)" onchange="javascript: calculartotal(this)"></td>
                        <tr>
                            <td>
                                <p  style="height: 50px;"></p>
                                <p>Cantidad de Bultos:</p></td>
                            <td><p  style="height: 50px;"></p><input class="textbox"  type="text" name="cantidad_bultos" id="cantidad_B" size="10" onkeyup="calculartotal(this)" onchange="javascript: calculartotal(this)"></td>
                        </tr>
                        <tr>
                            <td>
                                <p></p>
                                <p>Valor por Bultos:</p></td>
                            <td><input class="textbox" type="text" name="valor_bultos" id="valor_bulto" size="10" onkeyup="calculartotal(this); format(this)" onchange="javascript: calculartotal(this)"></td>
                        </tr>
                        <tr>
                            <td>
                                <p></p>
                                <p><p>Costo de Semilla:</p>
                            </td>
                            <td><input class="textbox" type="text" name="costo_semilla" id="costo_semilla" readonly="" style="background-color: #CCC;" size="10" onkeyup="calculartotal(this); format(this)" onchange="javascript: calculartotal(this)"></td>
                        </tr>
                        <tr>
                            <td>
                                <p></p>
                                <p><p>Transporte de Semilla:</p>
                            </td>
                            <td><input class="textbox" type="text" name="transporte_semilla" id="transporte_semilla" size="10" onkeyup="calculartotal(this); format(this)" onchange="javascript: calculartotal(this)"></td>
                        </tr>
                </table>
                        <table border="0" style="font-size: 20px; font-family: Times New Roman; margin-left: 65%; margin-top: -36px;">
                            <tr>
                                <td>
                                    <label>Total </label>
                                </td>
                                <td>
                                    <input class="textbox" type="text" name="total" readonly="" style="background-color: #CCC;" id="total_siembra" onchange="javascript: calculartotal(this, 0); format(this)" />    
                                </td>
                            </tr>
                        </table>
                    <div id="Total">
                        <table border="0" style="margin-top: -260px;" id="tablabotones" width="400" heigh="20" align="center">
                        <tr>
                        
                            <td>
                                <a href="SiembraManual.jsp" width="203">
                                    <input  style="height: 20px; cursor: pointer;"type="button" name="slider"></a>
                                <a href="SiembraMecanizada.jsp" width="200">
                                    <input style="height: 20px;cursor: pointer;" type="button" name="slider"></a>
                            </td>
                        
                        </tr>    
                    </table>
                        <div style="margin-left: 1%;">
                        <table border="0" style="font-size: 18px; font-family: Times New Roman;" id="tablanombres" width="352" height="50" >
                          <tr> 
                            <div style="margin-left: -11%;">
                            <td width="200" align="center">Siembra Manual</td>
                            <td width="200" align="center">Siembra Mecanizada</td>
                            </div>
                          </tr>
                    </table>
                        </div>
                        <div class="cont-inputs" aling="center" style="margin-left: -140px; margin-top: -25px;">
                            <input style="font-family: Times New Roman;" type="button" onclick="VentanaEmergente()" class="agregar-insumo" value="GUARDAR"/>
                            <input style="font-family: Times New Roman;" name="cerrar" type="button" class="agregar-insumo" value="CERRAR" onclick="location.href = 'cosecha.jsp'"/>
                        </div>
                    </div>
                        
                </div>     
            </form>
        </div>
    </div>
            <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaSM" align="center">
                </div>
            </footer>
    </body>
</html>
