<%-- 
    Document   : nombres_insumos
    Created on : 23/09/2016, 02:22:56 PM
    Author     : LENOVO
--%>

<jsp:useBean id="con" class="Controladores.ConsultasSQL" scope="page"></jsp:useBean>
<%@page import="java.sql.*" %>
<% String clasificacion = request.getParameter("tipo_insumo"); %>
<select name="nombre">
    <option value="">Seleccione</option>
    <% 
         ResultSet rs = con.listar_nombres(clasificacion);
         
         while(rs.next()) {%>
         <option value="<%= rs.getString("nombre_insumo") %>"><%= rs.getString("nombre_insumo") %></option>
         <% } %>
         
         
         
</select>

