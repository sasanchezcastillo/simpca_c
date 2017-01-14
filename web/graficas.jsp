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
        <script src="Js/exporting.js" type="text/javascript"></script>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <script src="Js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <link href="imagenes/favicon.ico" rel="icon"/>
        <link href="css/garficas_estaidisticas.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reportes En Graficas</title>
        <script src="Js/higchart.js" type="text/javascript"></script>
    </head>
    <%

        Graficas_usuarios datos = (Graficas_usuarios) session.getAttribute("datos");
        Graficas_usuarios manoobra = (Graficas_usuarios) session.getAttribute("manoobra");
        Graficas_usuarios insumos = (Graficas_usuarios) session.getAttribute("insumos");
        Graficas_usuarios otrosgastos = (Graficas_usuarios) session.getAttribute("otrosgastos");

        HttpSession objSession = request.getSession();
        String lote = (String) objSession.getAttribute("lote");
        String nombre = (String) objSession.getAttribute("nombre");
        objSession.setAttribute("sesion", "cerrar");


    %>

    <!-- ME tengo que ir a hacer mercado con mi mamá, 
    estaba intentando poner las dos gráficas en la misma interfaz, 
    le he hecho de todo y nada. el mismo problema que habíamos tenido antes. 
    hablamos cuando vuelva -->
    <style type="text/css">
        ${demo.css}
    </style>
    <body >
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
            <div id="container" class="container" style="min-width: 300px; 
                 height: 400px;
                 width: 80%;
                 margin: 0 auto;
                 margin-top: 10%;
                 position: relative;
                 background: none;">
            </div> 
            <div id="containert" class="containert" style="background: none;
                 min-width: 310px;
                 position: relative;
                 height: 400px; 
                 width: 80%;
                 margin: 0 auto;
                 margin-top: 5%;
                 margin-bottom: 60px;">
                
            </div>
        </div>
                        <div style="margin-left: 45%; margin-top: 2%;">
                        <form action="DetallesTotal" method="post" style="margin-top: 25px;">
                                <br>
                                <input type="text" name="num_lote" hidden="" value="<%=lote%>"/>
                                <input class="agregar-insumo" style="margin-top: 10px;" type="submit" value="Volver"/>
                            </form>
                        </div>        
        <footer>
            <div class="pie_paginaInicio">
            </div>
        </footer>
    </body>

    <!-- Inicio Grafica torta-->
    <script type="text/javascript">
        $(function () {

            var colors = Highcharts.getOptions().colors,
                    categories = ['Gastos Insumos', 'Gastos Mano De Obra', 'Otros Gastos'],
                    data = [{
                            y:<%=insumos.getInsumos_total_quema_quimica()%>+<%=insumos.getInsumos_total_quema_fisica()%>+ <%=insumos.getInsumos_total_abonada()%> +<%=insumos.getInsumos_total_mantenimiento()%>+<%=insumos.getInsumos_total_fumiga()%>,
                            color: colors[0],
                            drilldown: {
                                name: 'Gastos Insumos',
                                categories: ['Quema Quimica', 'Quema Fisica', 'Abonada', 'Mantenimiento', 'Fumiga'],
                                data: [<%=insumos.getInsumos_total_quema_quimica()%>, <%=insumos.getInsumos_total_quema_fisica()%>, <%=insumos.getInsumos_total_abonada()%>, <%=insumos.getInsumos_total_mantenimiento()%>, <%=insumos.getInsumos_total_fumiga()%>],
                                color: colors[0]
                            }
                        }, {
                            y: <%=manoobra.getMano_obra_total_entresaque()%>+<%=manoobra.getMano_obra_total_macheteada()%>+<%=manoobra.getMano_obra_total_despalille()%>+<%=manoobra.getMano_obra_total_fumiga()%>+<%=manoobra.getMano_obra_total_mantenimiento()%>+<%=manoobra.getMano_obra_total_manejo_residuos()%>+<%=manoobra.getMano_obra_total_pajareo()%>+<%=manoobra.getMano_obra_total_quema_fisica()%>+<%=manoobra.getMano_obra_total_quema_quimica()%>+<%=manoobra.getMano_obra_total_riego()%>+<%=manoobra.getMano_obra_total_siembras()%>+<%=manoobra.getMano_obra_total_abonada()%>,
                            color: colors[2],
                            drilldown: {
                                name: 'Gastos Mano De Obra',
                                categories: ['Entresaque', 'Macheteada', 'Despalille', 'Fumiga', 'Mantenimientos', 'Manejo De Residuos', 'Pajareo', 'Quema Fisica', 'Quema Quimica', 'Riegos', 'Siembra', 'Abonada'],
                                data: [<%=manoobra.getMano_obra_total_entresaque()%>,<%=manoobra.getMano_obra_total_macheteada()%>,<%=manoobra.getMano_obra_total_despalille()%>,<%=manoobra.getMano_obra_total_fumiga()%>,<%=manoobra.getMano_obra_total_mantenimiento()%>,<%=manoobra.getMano_obra_total_manejo_residuos()%>,<%=manoobra.getMano_obra_total_pajareo()%>,<%=manoobra.getMano_obra_total_quema_fisica()%>,<%=manoobra.getMano_obra_total_quema_quimica()%>,<%=manoobra.getMano_obra_total_riego()%>,<%=manoobra.getMano_obra_total_siembras()%>,<%=manoobra.getMano_obra_total_abonada()%>],
                                color: colors[1]
                            }
                        }, {
                            y: <%=otrosgastos.getOtrosGastos_valor()%>,
                            color: colors[3],
                            drilldown: {
                                name: 'Otros Gastos',
                                categories: ['Otros Gastos'],
                                data: [<%=otrosgastos.getOtrosGastos_valor()%>],
                                color: colors[2]
                            }
                        } /*{
                         !y: 4.77,
                         color: colors[3],
                         drilldown: {
                         name: 'Safari versions',
                         categories: ['Safari v5.0', 'Safari v5.1', 'Safari v6.1', 'Safari v6.2', 'Safari v7.0', 'Safari v7.1', 'Safari v8.0'],
                         data: [0.3, 0.42, 0.29, 0.17, 0.26, 0.77, 2.56],
                         color: colors[3]
                         }
                         },{
                         y: 0.91,
                         color: colors[4],
                         drilldown: {
                         name: 'Opera versions',
                         categories: ['Opera v12.x', 'Opera v27', 'Opera v28', 'Opera v29'],
                         data: [0.34, 0.17, 0.24, 0.16],
                         color: colors[4]
                         }
                         },{
                         y: 0.2,
                         color: colors[5],
                         drilldown: {
                         name: 'Proprietary or Undetectable',
                         categories: [],
                         data: [],
                         color: colors[5]
                         }
                         }*/],
                    browserData = [],
                    GastosData = [],
                    i,
                    j,
                    dataLen = data.length,
                    drillDataLen,
                    brightness;


            // Build the data arrays
            for (i = 0; i < dataLen; i += 1) {

                // add browser data
                browserData.push({
                    name: categories[i],
                    y: data[i].y,
                    color: data[i].color
                });

                // add version data
                drillDataLen = data[i].drilldown.data.length;
                for (j = 0; j < drillDataLen; j += 1) {
                    brightness = 0.2 - (j / drillDataLen) / 5;
                    GastosData.push({
                        name: data[i].drilldown.categories[j],
                        y: data[i].drilldown.data[j],
                        color: Highcharts.Color(data[i].color).brighten(brightness).get()
                    });
                }
            }

            // Create the chart
            Highcharts.chart('containert', {
                chart: {
                    type: 'pie'
                },
                title: {
                    text: 'Mano De Obra, Insumos , Otros Gastos'
                },
                subtitle: {
                    text: 'lote: <%= lote%>'
                },
                yAxis: {
                    title: {
                        text: 'Total percent market share'
                    }
                },
                plotOptions: {
                    pie: {
                        shadow: false,
                        center: ['50%', '50%']
                    }
                },
                tooltip: {
                    valueSuffix: '%'
                },
                series: [{
                        name: 'Gastos',
                        data: browserData,
                        size: '60%',
                        dataLabels: {
                            formatter: function () {
                                return this.y > 5 ? this.point.name : null;
                            },
                            color: '#ffffff',
                            distance: -30
                        }
                    }, {
                        name: 'Gasto',
                        data: GastosData,
                        size: '80%',
                        innerSize: '60%',
                        dataLabels: {
                            formatter: function () {
                                // display only if larger than 1
                                return this.y > 0 ? '<b>' + this.point.name + ':</b> ' + this.y + '%' : null;
                            }
                        }
                    }]
            });
        });
    </script>





    <script type="text/javascript">
        $(function () {
            Highcharts.chart('container', {
                chart: {
                    type: 'column'
                },
                title: {
                    text: 'Gastos En Graficas '
                },
                subtitle: {
                    text: 'Lote <%= lote%>'
                },
                xAxis: {
                    type: 'category',
                    labels: {
                        rotation: -50,
                        style: {
                            fontSize: '13px',
                            fontFamily: 'Verdana, sans-serif'
                        }
                    }
                },
                yAxis: {
                    title: {
                        text: 'En Que  Gasto Mas(Procesos)'
                    }
                },
                legend: {
                    enabled: false
                },
                tooltip: {
                    pointFormat: 'Usted Gasto :$ <b>{point.y:,1f} pesos</b>'
                },
                series: [{
                        name: 'Gastos',
                        data: [
                            ['Quema Quimica',<%=datos.getTotal_quema_quimica()%>],
                            ['Quema Fisica', <%=datos.getTotal_quema_ficica()%>],
                            ['Preparacion Suelo', <%=datos.getValor_total_preparacion_suelo()%>],
                            ['Manejo Residuos Cosecha', <%=datos.getTotal_manejo_residuos()%>],
                            ['Siembra', <%=datos.getTotal_siembras()%>],
                            ['Abonadas', <%=datos.getTotal_abonadas()%>],
                            ['Fumigas', <%=datos.getTotal_fumigas()%>],
                            ['Despalille', <%=datos.getTotal_despalille()%>],
                            ['Entresaque', <%=datos.getTotal_entresaque()%>],
                            ['Macheteada', <%=datos.getTotal_macheteada()%>],
                            ['Pajareo', <%=datos.getTotal_pajareo()%>],
                            ['Riego', <%=datos.getTotal_riego()%>],
                            ['Cortas', <%=datos.getTotal_cortas()%>],
                            ['Mantenimiento', <%=datos.getTotal_mantenimiento()%>]


                        ],
                        dataLabels: {
                            enabled: true,
                            rotation: -90,
                            color: 'black',
                            align: 'right',
                            format: '$ {point.y:,1f}', // one decimal
                            y: 20, // 10 pixels down from the top
                            style: {
                                fontSize: '10px',
                                fontFamily: 'Verdana, sans-serif'
                            }
                        }
                    }]
            });
        });
    </script>

</html>
