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
        <script src="Js/newjavascript.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <link href="css/consultas.css" rel="stylesheet" type="text/css"/>
        <script src="Js/Consultas.js" type="text/javascript"></script>
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
            <h3 style="font-size: 22px; font-family: Times New Roman; margin-left: 1000px; margin-top: 40px;">Lote: <input type="text" id="lote" name="num_lote" style="font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"/></h3>           
            <h2 style="text-align: center; margin-top: 20px; font-size: 28px;">COSTOS DE PRODUCCIÓN</h2>
            <div class="pri-set">
                <div class="con-quema-quimica">
                    <h3 style="margin-left: 35px;">QUEMA QUÍMICA</h3>
                    <c:forEach items="${total_quema_quimica}" var="lista">
                        <div class="div-img hidden">
                            <img class="img"src="img-con/quema_fi.jpg" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px; "/>
                        </div> 
                        <div class="text"><form action="ServletQuemaQuimica" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                        <input type="text" id="Quemaquimica"  value=" $ ${lista.valor_total_quemaq}" readonly=""  placeholder="$ 0.0"class="textbox" > 
                    </c:forEach>
                </div>
                <div class="  con-quema-fisica">
                    <h3 style="margin-left: 45px;"> QUEMA FÍSICA</h3>
                    <c:forEach items="${total_quema_fisica}" var="lista">
                        <img src="img-con/u56.jpg" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px;"/>
                        <form action="ServletQuemaFisica" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><div class="text"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Quemafisica" placeholder="$"class="textbox" value=" $ ${lista.total_qf}"> 
                        </c:forEach>
                </div>
                <div class="con-nivelacion">
                    <h3 style="text-align: center;">PREPARACIÓN DE SUELO</h3>
                    <c:forEach items="${total_preparacion_suelo}" var="lista">
                        <img src="img-con/u58.jpg" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px;"/>
                        <div class="text"><form action="ServletPreparacionSuelo" method="post"><input type="text" id="Suelo" readonly="" placeholder="$" class="textbox" name="total_n" value=" ${lista.total_preparacion_suelo}"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input type="submit" value="Ver Detalles" style="margin-top: -40px; font-size: 15px; font-family: Times New Roman;" class="detalles"></form></div>
                    </c:forEach>
                </div>
                <div class="con-cortamaleza">
                    <h3 style="text-align: center;">MANEJO RESIDUOS DE COSECHA</h3>
                    <c:forEach items="${valor_total_mrc}" var="lista">
                        <img src="img-con/u62.jpg" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px;"/>
                        <div class="text"><form action="Detalles_corta_maleza" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                        <input type="text" id="Residuos"  readonly="" placeholder="$" class="textbox" value="$  ${lista.valor_total_mrc}"> 
                    </c:forEach>
                </div>
            </div> 
            <div class="seg-set">
                <div class="con-siembra-mecanizada">
                    <c:forEach items="${total_siembra_mecanizada}" var="lista">
                        <h3 style="margin-left: 20px;">SIEMBRA MECANIZADA</h3>
                        <img src="img-con/u60.jpg" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px;"/>
                        <div class="text"><form action="ServletSiembraMecanizada" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                        <input type="text" readonly="" id="Siembramecanizada" placeholder="$ 0.0"class="textbox" value="$  ${lista.total_smzd}"> 
                    </c:forEach>
                </div>
                <div class="con-siembra">
                    <c:forEach items="${total_siembra_manual}" var="lista">
                        <h3 style="margin-left: 33px;">SIEMBRA MANUAL</h3>
                        <img src="img-con/u30.png" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px;"/>
                        <div class="text"><form action="ServletSiembraManual" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                        <input type="text" readonly="" id="Siembramanual" placeholder="$"class="textbox" value="$  ${lista.total_siembra_manual}">                                 
                    </c:forEach>
                </div>        
                <div class="con-abonadas">
                    <c:forEach items="${Valor_total_abonada}" var="lista">
                        <h3 style="margin-left: 75px;">ABONADAS</h3>
                        <img src="img-con/u42.jpg" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px;"/>
                        <div class="text"><form action="ServletAbonada_insumos" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>" ><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                        <input type="text" readonly="" id="Abonada" placeholder="$"class="textbox" value="$  ${lista.total_abonada}" >    
                    </c:forEach>
                </div>
                <div class="con-fumigas">
                    <c:forEach items="${total_fumiga}" var="lista">
                        <h3 style="margin-left: 85px;">FUMIGAS</h3>
                        <img src="img-con/u44.jpg" width="225px" height="140px;" style="margin-left: 14px; margin-top: 5px; border-radius: 10px;"/>
                        <div class="text"><form action="ServletFumigas" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input type="text" readonly="" id="Fumiga" placeholder="$"class="textbox" name="total_f" value=" ${lista.total_fumiga}"><input type="submit" value="Ver Detalles" class="detalles"style="margin-top: -40px; font-size: 15px; font-family: Times New Roman;" /></form></div>
                    </c:forEach>
                </div>    
                <div class="ter-set">
                    <div class="con-despalille">
                        <c:forEach items="${total_despalille}" var="lista">
                            <h3 style="margin-left: 75px;">DESPALILLE</h3>
                            <img src="img-con/u56 (1).jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletDespalille" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Despalille" placeholder="$"class="textbox" value="$  ${lista.total_despalille}">    
                        </c:forEach>
                    </div>
                    <div class="con-entresaque">
                        <c:forEach items="${total_entresaque}" var="lista">
                            <h3 style="margin-left: 65px;">ENTRESAQUE</h3>
                            <img src="img-con/u56 (1).jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletEntresaque" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Entresaque" placeholder="$"class="textbox" value="$  ${lista.total_entresaque}"> 
                        </c:forEach>
                    </div>
                    <div class="con-macheteada">
                        <c:forEach items="${total_macheteada}" var="lista">
                            <h3 style="margin-left: 59px;">MACHETEADA</h3>
                            <img src="img-con/u56 (1).jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletMacheteada" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Macheteada" placeholder="$"class="textbox" value="$  ${lista.total_macheteada}"> 
                        </c:forEach>
                    </div>  
                    <div class="con-pajareo">
                        <c:forEach items="${total_pajareo}" var="lista">
                            <h3 style="margin-left: 78px;">PAJAREO</h3>
                            <img src="img-con/u62 (1).jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletPajareoCeladuria" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Pajareo" placeholder="$"class="textbox"value="$  ${lista.total_pajareo}"> 
                        </c:forEach>
                    </div>
                </div> 


                <div class="cuar-set">

                    <div class="con-riego">
                        <c:forEach items="${total_riego}" var="lista"> 
                            <h3 style="margin-left: 78px;">RIEGO</h3>
                            <img src="img-con/u54.png" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletRiego" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Riego" placeholder="$"class="textbox"value="$  ${lista.total_riego}">
                        </c:forEach>
                    </div>
                    <div class="con-corta-bultos">
                        <c:forEach items="${total_corta_bultos}" var="lista">
                            <h3 style="margin-left: 58px;">CORTA BULTOS</h3>
                            <img src="img-con/u48.jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletCortaBultos" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Bultos" placeholder="$"class="textbox"  value="$ ${lista.total_corta_bultos}"> 
                        </c:forEach>

                    </div>
                    <div class="con-corta-granel">
                        <c:forEach items="${total_corta_granel}" var="lista">
                            <h3 style="margin-left: 58px;">CORTA GRANEL</h3>
                            <img src="img-con/u49.jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletCortaGranel" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="Granel" placeholder="$"class="textbox"value="$  ${lista.total_corta_granel}"> 
                        </c:forEach>
                    </div>
                    <div class="con-mantenimiento-lote">
                        <c:forEach items="${total_mantenimiento_lote}" var="lista">
                            <h3 style="margin-left: 58px;">MANTENIMIENTO</h3>
                            <img src="img-con/u60.jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="ServletMantenimiento" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" id="Mantenimiento" readonly="" placeholder="$" class="textbox" value="$  ${lista.total_mntlote}"> 
                        </c:forEach>
                    </div>
                </div>
                <div class="quin-set">
                    <div class="con-liquidacion">
                        <c:forEach items="${valor_total_liquidacion}" var="lista">
                            <h3 style="margin-left: 58px;">LIQUIDACIÓN</h3>
                            <img src="img-con/u61.jpg" width="225px" height="140px;" style="margin-left: 12px; margin-top: 5px; border-radius: 10px;"/>
                            <div class="text"><form action="LiquidacionDetalles" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><input style="font-size: 15px; font-family: Times New Roman;" type="submit" value="Ver Detalles" class="detalles"></form></div>
                            <input type="text" readonly="" id="liquidacion" placeholder="$" class="textbox" value="$  ${lista.valor_total_liquidacion}"> 
                        </c:forEach>
                    </div>
                    <div class="con-estadisticas">
                        <label style="font-size: 30px; margin-left: 45px; font-family: Times New Roman;">Gastos Totales</label>
                        <input type="text" id="valorTotal" readonly="readonly" class="textbox">
                        <input type="button" style="font-size: 15px; font-family: Times New Roman;" name="Ver total" class="detalles2" value="CALCULAR" onclick="sumar()" >
                    </div>
                    <input type="button" style="width: 170px; margin-left: 500px; font-size: 15px; font-family: Times New Roman;" name="" class="detalles2" value="VOLVER" onclick="location.href = 'Inicio.jsp'">
                </div>  

            </div>
            <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaInicio" align="center">
                </div>
            </footer>
            <script>
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
            </script>
    </body>
</html>