<%-- 
    Document   : graficas
    Created on : 29/12/2016, 04:56:30 PM
    Author     : popor
--%>
<%@page import="Controladores.Graficas_usuarios" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/garficas_estaidisticas.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.10/c3.min.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.6/d3.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.10/c3.min.js"></script>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        
        Graficas_usuarios datos = (Graficas_usuarios) session.getAttribute("datos");
     HttpSession objSession = request.getSession();
        String lote = (String) objSession.getAttribute("lote");
        String nombre = (String) objSession.getAttribute("nombre");
        objSession.setAttribute("sesion", "cerrar");

        /*String total = request.getParameter("valor_total").replace(".", "");
        total = total.replace("$", "");
        String gastos_insumos = request.getParameter("gastos_insumos").replace(".", "");
        gastos_insumos = gastos_insumos.replace("$", "");
        String gastos_manos = request.getParameter("gastos_mano").replace(".", "");
        gastos_manos = gastos_manos.replace("$", "");
        String otros = request.getParameter("otros").replace(".", "");
        otros = otros.replace("$", "");*/
    %>
    <body>
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
                        <li><a href="#"><%= nombre%></a>
                        <li><a href="Session">Cerrar Sesion</a>
                    </ul>
                </nav>
            </section>
        </header>

        <div class="cont-graficas">
            <h2>Gastos Totales</h2>
            <input type="text" value="<%= datos.getGastos_insumos() %>">
            <div id="chart" class="torta">
            </div>

        </div>


        <script>

            var chart = c3.generate({
                data: {
                    columns: [
                        ['Mano De Obra','<%= datos.getGastos_mano_obra() %>'],
                        ['Insumos', '<%= datos.getGastos_insumos() %>'],
                        ['Otros', '<%= datos.getGastos_otros() %>']
                    ],
                    type: 'pie'
                },
                legend: {
                    show: false
                }
            });

            function toggle(id) {
                chart.toggle(id);
            }

            d3.select('.container').insert('div', '.chart').attr('class', 'legend').selectAll('span')
                    .data(['mano', 'insumo', 'otro'])
                    .enter().append('span')
                    .attr('data-id', function (id) {
                        return id;
                    })
                    .html(function (id) {
                        return id;
                    })
                    .each(function (id) {
                        d3.select(this).style('background-color', chart.color(id));
                    })
                    .on('mouseover', function (id) {
                        chart.focus(id);
                    })
                    .on('mouseout', function (id) {
                        chart.revert();
                    })
                    .on('click', function (id) {
                        chart.toggle(id);
                    });


        </script>
    </body>
</html>
