<%-- 
    Document   : preparacion_de_lotes
    Created on : 12/08/2016, 01:14:10 PM
    Author     : Aprendiz: Deiby Brayan Diaz R. ADSI 954687
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
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
        <link href="css/consultas-table.css" rel="stylesheet" type="text/css"/>
        <link href="css/css1(Quema fisica).css" rel="stylesheet" type="text/css"/>
        <link href="imagenes/favicon.ico" rel="icon"/>
        <script src="Js/FuncionesQuemaFisica.js" type="text/javascript"></script>
        <script src="Js/jquery.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1.0, mninimun-scale=0">

        <title>Abonadas</title>
    </head>
    <img src="ImagenesR/Sesion-1.png" style="width: 100%; height: 400px; position: absolute;z-index: -10;">
    <body class="fondoC">
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

        <div style="background: RGBA(245,178,53,0.2); border: solid;border-width: 1px; width: 90%; height:auto;
             border-radius: 50px; margin-top: 120px; margin-left: 60px; padding: 20px;">                         
            <div style="text-align: center; margin-top: 20px; padding: 20px;">
                <h3 style="font-size: 22px; font-family: Times New Roman; margin-left:450px;"><b>Lote: </b><input type="text" name="num_lote" size="6" style="width:50px; text-align: center; height: 30px; font-size: 20px; font-family: Times New Roman; background: none; border:none" value="<%=lote%>" readonly="<%=lote%>"></h3>
                <h1 style="font-size: 30px; font-family: Times New Roman;">ABONADAS</h1>
            </div>
                <div style="text-align: center; padding: 20px;">
                <h1 style="font-size: 30px; font-family: Times New Roman;">MANO DE OBRA</h1>
            </div>
            <div class="container">
                <div class="table"  style="margin-left: -65px;" >
                    <table class="table  table-hover table-bordered table-condensed" style="font-size: 18px; font-family: Times New Roman;">
                        <tr class="active">
                            <th></th>
                            <th>Fecha</th>
                            <th>Tipo Abonada</th>
                            <th >Cantidad Mano Obra</th>
                            <th>Costo Mano Obra</th>
                            <th>Valor Total Mano Obra</th>
                        </tr>
                    <c:forEach items="${ListaAbonada}" var="Lista">
                    <tr>
                        <td><input type="radio" name="id" id="id_${Lista.id_abonada}" value="${Lista.id_abonada}"/></td>
                        <td>${Lista.fecha_abonada}</td>
                        <td>${Lista.nombre_abonada}</td>
                        <td>${Lista.cantidad_mano_obra_abonada}</td> 
                        <td>${Lista.costo_unitario_mano_obra_abonada}</td>         
                        <td>${Lista.valor_total_mano_obra_abonada}</td>
                        <td><input style="background-color: rgb(254, 177, 0); color: white; width: 80%; border-radius: 5px; border-color: rgb(255, 197, 0);" type="button" value="Eliminar" onclick="eliminar()"></td>
                    </tr>
                    </c:forEach> 
    
                    </table>
                </div>
            </div>
                <div style="text-align: center; padding: 20px;">
                <h1 style="font-size: 30px; font-family: Times New Roman;">OTROS</h1>
            </div>
                <div class="container">
                <div class="table"  style="margin-left: -65px;" >
                    <table class="table  table-hover table-bordered table-condensed" style="font-size: 18px; font-family: Times New Roman;">
                        <tr class="active">
                            <th>Cantidad Transporte</th>
                            <th>Costo Transporte</th>
                            <th>Valor Total Transporte</th>
                            <th>Valor Total Abonada</th>
                        </tr>
                    <c:forEach items="${ListaAbonada}" var="Lista">
                        <tr>
                            <td>${Lista.cantidad_transporte_abonada}</td>
                            <td>${Lista.costo_transporte_abonada}</td>
                            <td>${Lista.valor_total_transporte_abonada}</td>
                            <td>${Lista.valor_total_abonada}</td>
                        <tr>
                    </c:forEach>
                    </table>
                </div>
            </div>
                <div style="text-align: center; padding: 20px;">
                <h1 style="font-size: 30px; font-family: Times New Roman;">INSUMOS ABONADA</h1>
            </div>
                <div class="container">
                <div class="table"  style="margin-left: -65px;" >
                    <table class="table  table-hover table-bordered table-condensed" style="font-size: 18px; font-family: Times New Roman;">
                                                                                                            <tr class="active">
                            <th>Tipo</th>
                            <th>Nombre</th>
                            <th>Cantidad</th>
                            <th>Unidad</th>
                            <th>Valor Unitario</th>
                            <th>Valor Total</th>
                        </tr>
                    <c:forEach items="${insumo_abonada}" var="Lista">
                        <tr>
                            <td id="input">${Lista.tipo_insumo}</td>
                            <td>${Lista.nombre_insumo}</td>
                            <td id="input">${Lista.cantidad_insumo}</td>
                            <td>${Lista.unidad_insumo}</td>
                            <td id="input">${Lista.valor_unitario_insumo}</td>
                            <td>${Lista.valor_total_insumos}</td>
                        </tr>
                    </c:forEach>
                    </table>
                </div>
            </div>
            <div align="center">
                <form style="margin-left: -300px;" action="DetallesTotal" method="post"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><font><input style="font-size: 14px; font-family: Times New Roman;" class="agregar-insumoC" type="submit" value="VOLVER"></u></form>
                <form style="margin-top: -120px; margin-left: 300px; width: 100%;" action="ReporteAbonadas" method="POST"><input type="text" name="num_lote" hidden="" value="<%=lote%>"><font><input style="font-size: 14px; font-family: Times New Roman;" class="agregar-insumoC" type="submit" value="GENERAR PDF"></form>
            </div>
        </div>
    </body>
<script type="text/javascript">
        function eliminar(){
            if($('input[name="id"]').is(':checked')){
                if(confirm("¿Esta seguro de eliminar el registro?")){
                    $("#op").val("eliminarAbonada");
                    $("#EliminarConsultas").submit();
                }
            }else{
                alert("Debe seleccionar un registro del listado");
            }
        }
    </script>
</html>