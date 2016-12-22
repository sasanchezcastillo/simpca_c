<%-- 
    Document   : selecioneLote
    Created on : sep 12, 2016, 3:13:01 p.m.
    Author     : USUARIO
--%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controladores.lote" %>
<!DOCTYPE html>
<html>  
    <head>
         
        <%
            HttpSession objSession = request.getSession();
            String cedula = (String) objSession.getAttribute("cedula");
            String nombre = (String) objSession.getAttribute("nombre");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/general_simpca.css" rel="stylesheet" type="text/css"/>
        <title>seleccione Un Lote</title>
    </head>
    <body class="fondoS">
        <div id="toplogo">
        <h1 id="logo">
            <a href="#" title="Coagronorte-Cooperativa Agropecuaria Norte de Santander"></a>
        </h1>
    </div>
        <header>
                <section>
                        <nav>
                            <ul>
                                <li><a href="#">Coagronorte</a></li>
                                <li><a href="#">Productos</a></li>
                                <li><a href="#">Servicios</a></li>
                                <li><a href="#">Blog</a></li>
                                <li><a href="#">Contacto</a></li>
                                <li><a href="#"><%=nombre%></a></li>  
                            </ul>
                        </nav>
                </section>
        </header>
        <img src="ImagenesR/Sesion-1.png" style="width: 100%; height: 400px; position: absolute">
        
        <div class="contenedor-formulario" style="position: absolute;">
            <div class="wrap" style="position: relative;">
                <form  class="formulario" name="formulario_registro" action="Lotes" method="post">

                    <h1 class="titulo"> Seleccione Un Lote <%=nombre%> </h1> 
                    
                        <%ArrayList<String> lista = (ArrayList<String>) request.getAttribute("lista");
                            for (String valor : lista) {
                        %>
                        <div class="input-group radio">
                            <br>
                            <input type="radio" id="<%=valor%>"  name="numlote"  required="'<%=valor%>' "onclick="value = '<%=valor%>'"/>
                            
                        <label  for="<%=valor%>"><%=valor%></label>

                        <%
                          String lote = request.getParameter(valor);
                            }
                        %>
                        <br>
                        <br>
       
                         <input type="submit" id="siguiente" value="SIGUIENTE" /> 
                         <input type="button" onclick="location.href='registro_lote.jsp'" id="siguiente" value="REGISTRAR UN LOTE" /> 
                    </div>
                </form>
            </div>
        </div>
                        <br>
             <footer>
                <!--Pie de Pagina-->
                <div id="pie_paginaSesion" >
                
         </footer>
    </body>
</html>
