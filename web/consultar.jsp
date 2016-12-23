<%-- 
    Document   : consultar
    Created on : nov 15, 2016, 1:56:27 p.m.
    Author     : USUARIO
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%
        HttpSession objSession = request.getSession();
        String lote = (String) objSession.getAttribute("lote");
        String nombre = (String) objSession.getAttribute("nombre");
        objSession.setAttribute("sesion", "cerrar");

        if (nombre == null) {
            if (lote == null) {
                response.sendRedirect("Inicio_sesion.jsp");
            }
        }
    %>

    <head>
        <script src="Js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script src="Js/newjavascript.js" type="text/javascript"></script>
        <meta name="viewport" charset=UTF-8" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <link href="css/consultas_1.css" rel="stylesheet" type="text/css"/>        
        <script src="Js/Consultas.js" type="text/javascript"></script>
        <script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script>

        <link href="imagenes/favicon.ico" rel="icon"/>
        <title>consultas</title>
    </head>
    <!--Interfaz Inicio, permite que el agricultor pueda Ingresar al Menu de la pagina para ingresar la informacion correspondiente al lote -->
    <body class="fondoInicio">
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
        <div class="cont-consultas">
            <h3 class="info-lote" style="font-size: 22px; font-family: Times New Roman; float: right; 
                position: relative;">Lote: 
                <input type="text" id="lote" name="num_lote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none;position: relative;" value="<%=lote%>" readonly="<%=lote%>"/>
            </h3><br/>           
            <h2 id="h2costosdeproduccion" style="width: 100%;">COSTOS DE PRODUCCIÓN</h2>

            <div class="class-consulta">
                <h3>QUEMA QUÍMICA</h3>
                <c:forEach items="${total_quema_quimica}" var="lista">
                    <div class="class-cont-consulta">
                        <img src="img-con/quema_fi.jpg" class="img-consultas"/>

                        <form action="ServletQuemaQuimica" method="post">
                            <input type="text" id="Quemaquimica"  value="$${lista.valor_total_quemaq}" readonly=""  placeholder="$ 0.0"class="textbox" > 
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>

                    </div> 
                </c:forEach>
            </div>
            <div class="class-consulta">
                <h3>QUEMA FÍSICA</h3>
                <c:forEach items="${total_quema_fisica}" var="lista">
                    <div class="class-cont-consulta">
                        <img src="img-con/u56.jpg" class="img-consultas"/>


                        <form action="ServletQuemaFisica" method="post">
                            <input type="text" readonly="" id="Quemafisica" placeholder="$"class="textbox" value="$${lista.total_qf}"> 
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="submit" value="Ver Detalles" style="text-align: center" class="detalles">
                        </form>


                    </div>
                </c:forEach>
            </div>
            <div class="class-consulta">
                <h3>PREPARACIÓN DE SUELO</h3>
                <c:forEach items="${total_preparacion_suelo}" var="lista">
                    <div class="class-cont-consulta">
                        <img src="img-con/u58.jpg" class="img-consultas"/>
                        <form action="ServletPreparacionSuelo" method="post">
                            <input type="text" id="Suelo" readonly="" placeholder="$" class="textbox" name="total_n" value=" $${lista.total_preparacion_suelo}">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>
                </c:forEach>
            </div>
            <div class="class-consulta">
                <h3>MANEJO RESIDUOS DE COSECHA</h3>
                <c:forEach items="${valor_total_mrc}" var="lista">
                    <div class="class-cont-consulta">
                        <img src="img-con/u62.jpg" class="img-consultas"/>
                        <div class="class-cont-consulta">
                            <form action="Detalles_corta_maleza" method="post">
                                <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                                <input type="text" id="Residuos"  readonly="" placeholder="$" class="textbox" value=" $${lista.valor_total_mrc}"> 
                                <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                            </form>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <div class="class-consulta">
                <c:forEach items="${total_siembra_mecanizada}" var="lista">
                    <h3>SIEMBRA MECANIZADA</h3>
                    <img src="img-con/u60.jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletSiembraMecanizada" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Siembramecanizada" placeholder="$ 0.0"class="textbox" value=" $${lista.total_smzd}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>
            <div class="class-consulta">
                <c:forEach items="${total_siembra_manual}" var="lista">
                    <h3 >SIEMBRA MANUAL</h3>
                    <img src="img-con/u30.png" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletSiembraManual" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Siembramanual" placeholder="$"class="textbox" value=" $${lista.total_siembra_manual}">                                 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>        
            <div class="class-consulta">
                <c:forEach items="${Valor_total_abonada}" var="lista">
                    <h3>ABONADAS</h3>
                    <img src="img-con/u42.jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletAbonada_insumos" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>" >
                            <input type="text" readonly="" id="Abonada" placeholder="$"class="textbox" value=" $${lista.total_abonada}" >    
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>
            <div class="class-consulta">
                <c:forEach items="${total_fumiga}" var="lista">
                    <h3>FUMIGAS</h3>
                    <img src="img-con/u44.jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletFumigas" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Fumiga" placeholder="$"class="textbox" name="total_f" value="$${lista.total_fumiga}">
                            <input type="submit" value="Ver Detalles" class="detalles"style="font-size: 15px; font-family: Times New Roman;" />
                        </form>
                    </div>
                </c:forEach>
            </div>    

            <div class="class-consulta">
                <c:forEach items="${total_despalille}" var="lista">
                    <h3>DESPALILLE</h3>
                    <img src="img-con/u56 (1).jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletDespalille" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Despalille" placeholder="$"class="textbox" value="$${lista.total_despalille}">    
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>
            <div class="class-consulta">
                <c:forEach items="${total_entresaque}" var="lista">
                    <h3>ENTRESAQUE</h3>
                    <img src="img-con/u56 (1).jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletEntresaque" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Entresaque" placeholder="$"class="textbox" value="$${lista.total_entresaque}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>
            <div class="class-consulta">
                <c:forEach items="${total_macheteada}" var="lista">
                    <h3>MACHETEADA</h3>
                    <img src="img-con/u56 (1).jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletMacheteada" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Macheteada" placeholder="$"class="textbox" value="$${lista.total_macheteada}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>  
            <div class="class-consulta">
                <c:forEach items="${total_pajareo}" var="lista">
                    <h3>PAJAREO</h3>
                    <img src="img-con/u62 (1).jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletPajareoCeladuria" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Pajareo" placeholder="$"class="textbox"value="$${lista.total_pajareo}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>

            <div class="class-consulta">
                <c:forEach items="${total_riego}" var="lista"> 
                    <h3>RIEGO</h3>
                    <img src="img-con/u54.png" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletRiego" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Riego" placeholder="$"class="textbox"value="$${lista.total_riego}">
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>

            <div class="class-consulta">
                <c:forEach items="${total_corta_bultos}" var="lista">
                    <h3>CORTA BULTOS</h3>
                    <img src="img-con/u48.jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletCortaBultos" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Bultos" placeholder="$"class="textbox"  value="$${lista.total_corta_bultos}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>

            </div>
            <div class="class-consulta">
                <c:forEach items="${total_corta_granel}" var="lista">
                    <h3>CORTA GRANEL</h3>
                    <img src="img-con/u49.jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletCortaGranel" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="Granel" placeholder="$"class="textbox"value="$${lista.total_corta_granel}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>
                </c:forEach>
            </div>
            <div class="class-consulta">
                <c:forEach items="${total_mantenimiento_lote}" var="lista">
                    <h3>MANTENIMIENTO</h3>
                    <img src="img-con/u60.jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="ServletMantenimiento" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" id="Mantenimiento" readonly="" placeholder="$" class="textbox" value="$${lista.total_mntlote}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>


            <div class="class-consulta">
                <c:forEach items="${valor_total_liquidacion}" var="lista">
                    <h3>LIQUIDACIÓN</h3>
                    <img src="img-con/u61.jpg" class="img-consultas"/>
                    <div class="class-cont-consulta">
                        <form action="LiquidacionDetalles" method="post">
                            <input type="text" name="num_lote" hidden="" value="<%=lote%>">
                            <input type="text" readonly="" id="liquidacion" placeholder="$" class="textbox" value="$${lista.valor_total_liquidacion}"> 
                            <input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles">
                        </form>
                    </div>

                </c:forEach>
            </div>

            <div class="class-consulta-total">
                <label class="lblCostos">Gastos Totales</label><br/>
                 <c:forEach items="${valor_total}" var="lista">
                     <input type="text" id="valorTotalt" class="valorTotal" readonly="readonly" value="$${lista.valor_total}"><br/>
                </c:forEach>
                     <label class="lblCostos">Gastos Por Hectarea</label><br/>
                <c:forEach items="${total_gastos}" var="lista">
                    <input type="text" id="valorTotalhectareas"  readonly="readonly" class="valorTotal" value="$${lista.total_gastos}"><br/>     
                </c:forEach>   
                <label class="lblCostos">Resultado Económico</label><br/>
                <c:forEach items="${valor_ganancia}" var="lista">
                <input type="text" id="valorGanancias"  class="valorTotal" readonly="readonly" class="" value="${lista.valor_ganancia}"><br/>
                </c:forEach>
                <label class="lblCostos">Costo Por Kilogramo</label><br/>
                <input type="text" id="" readonly="readonly" class="valorTotal" value=""><br/>
                <label class="lblCostos">Costo De Insumos</label><br/>
                <input type="text" id="" readonly="readonly" class="valorTotal" value=""><br/>
                <label class="lblCostos">Costos Por Mano De Obra</label><br/>
                <input type="text" id="" readonly="readonly" class="valorTotal" value=""><br/>
                <input type="button" id="botonvolver" class="" value="VOLVER" onclick="location.href = 'Inicio.jsp'">

            </div>

        </div>

        <footer>
            <!--Pie de Pagina-->
            <div id="pie_paginaInicio" align="center">

            </div>
        </footer>
        <script type="text/javascript">
            

            miles("Quemaquimica");
            miles("Quemafisica");
            miles("Suelo");
            miles("Residuos");
            miles("Siembramecanizada");
            miles("Siembramanual");
            miles("Abonada");
            miles("Fumiga");
            miles("Despalille");
            miles("Entresaque");
            miles("Macheteada");
            miles("Pajareo");
            miles("Riego");
            miles("Bultos");
            miles("Granel");
            miles("Mantenimiento");
            miles("liquidacion");
            miles("valorTotalt");
            miles("valorTotalhectareas");
            miles("valorGanancias");
        </script>
    
    </body>
</html>