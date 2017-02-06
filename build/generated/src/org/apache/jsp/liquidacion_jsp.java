package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controladores.ConexionBD;
import Controladores.Conexion;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public final class liquidacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("     ");

           HttpSession objSession = request.getSession();
           String lote = (String) objSession.getAttribute("lote");
           String nombre = (String) objSession.getAttribute("nombre");
           objSession.setAttribute("sesion","cerrar");
          
                if(nombre == null){
                    if(lote == null){
                        response.sendRedirect("Inicio_sesion.jsp");
                    }
                }
  
      out.write("\r\n");
      out.write("     <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"imagenes/favicon.ico\" rel=\"icon\"/>\r\n");
      out.write("        <link href=\"css/cssLiquidacion.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/general_simpca.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"Js/FuncionesLiquidacion.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"Js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"Js/Consultas.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <title>Liquidación</title>\r\n");
      out.write("    </head>\r\n");
      out.write("<body class=\"fondo\">\r\n");
      out.write("    <div id=\"toplogo\">\r\n");
      out.write("        <h1 id=\"logo\">\r\n");
      out.write("            <a href=\"Inicio.jsp\" title=\"Coagronorte-Cooperativa Agropecuaria Norte de Santander\"></a>\r\n");
      out.write("        </h1>\r\n");
      out.write("    </div>\r\n");
      out.write("        <header>\r\n");
      out.write("                <section>\r\n");
      out.write("                        <nav>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Coagronorte</a>\r\n");
      out.write("                                    <li><a href=\"#\">Productos</a>\r\n");
      out.write("                                    <li><a href=\"#\">Servicios</a>\r\n");
      out.write("                                    <li><a href=\"#\">Blog</a>\r\n");
      out.write("                                    <li><a href=\"#\">Contacto </a>\r\n");
      out.write("                                    <li><a href=\"#\">");
      out.print(nombre);
      out.write("</a>\r\n");
      out.write("                                    <li><a href=\"Session\">Cerrar Sesion</a>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                </section>\r\n");
      out.write("        </header>\r\n");
      out.write("       <img src=\"ImagenesR/corta-1.png\" style=\"width: 100%; height: 400px; position: absolute\">\r\n");
      out.write("       \r\n");
      out.write("       <form action=\"Liquidacion\" id=\"Liquidacion\" method=\"post\">\r\n");
      out.write("          \r\n");
      out.write("        <div id=\"contenedor\" align=\"center\">\r\n");
      out.write("            <h3 style=\"font-size: 22px; font-family: Times New Roman; margin-left: 800px; margin-top: 35px;\">Lote: <input type=\"text\" id=\"lote\" name=\"num_lote\" style=\"font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none\" value=\"");
      out.print(lote);
      out.write("\" readonly=\"");
      out.print(lote);
      out.write("\"/></h3>           \r\n");
      out.write("            <h1 style=\"margin-top: 60px;\"><p>LIQUIDACIÓN</p></h1>\r\n");
      out.write("            <div class=\"pruebas-botonesL\">\r\n");
      out.write("                <input style=\"margin-left: 80px; font-family: Times New Roman; font-size: 16px; \" id=\"open\" type=\"button\"  onclick=\"agregarFilaTabla()\" value=\"Agregar Nueva Fila\" class=\"agregar-insumoL\" />\r\n");
      out.write("            </div> \r\n");
      out.write("               <div  class=\"tabla2\" style=\"font-family: Times New Roman;\">\r\n");
      out.write("                <div id=\"contenedor2\" align=\"center\">\r\n");
      out.write("                    <table align=\"center\" border=\"0\" style=\"margin-top: -210px; font-style: normal; font-size: 20px;\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                             \r\n");
      out.write("                        <td align=\"center\"><b>Fecha</b></td>\r\n");
      out.write("                                <td align=\"center\"><b>Tiquete</b></td>\r\n");
      out.write("                                <td align=\"center\"><b>Peso Neto</b></td>\r\n");
      out.write("                                <td align=\"center\"><b>Bultos</b></td>\r\n");
      out.write("                                <td align=\"center\"><b>Peso Final</b></td>\r\n");
      out.write("                                <td align=\"center\" colspan=\"2\"><b>F(24/4)</b></td>\r\n");
      out.write("                                <td align=\"center\"><b>K. Verdes</b></td>\r\n");
      out.write("                                <td align=\"center\"><b>V. Unitario</b></td>\r\n");
      out.write("                                <td align=\"center\"><b>Total</b></td>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                            <tbody align=\"center\" id=\"cuerpoTabla\">\r\n");
      out.write("                            <td><input style=\"font-family: Times New Roman; font-size: 16px;\" type=\"date\" class=\"textboxF\" name=\"fecha\" id=\"fecha0\" ></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"tiquete\" id=\"tiquete0\" ></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"pesoNeto\" id=\"pesoNeto0\" ></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"bultos\" id=\"bultos0\" ></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"pesoFinal\" id=\"pesoFinal0\" onchange=\"javascript: liquidacion(this, 0); format(this);\" /></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"f24\" id=\"fertilizante_a0\" ></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"f4\" id=\"fertilizante_b0\"></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"kilosVerde\" id=\"kilosVerde0\"></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" name=\"valorUnitario\" id=\"valorUnitario0\" onkeyup=\"liquidacion(this, 0); format(this, 0);\" onchange=\"format(this, 0); miles('totalvalorTotal');\" /></td>\r\n");
      out.write("                                    <td><input type=\"text\" class=\"textbox\" style=\"background-color:#CCC; width: 120px;\" name=\"valorTotal\" id=\"valorTotal0\" readonly=\"readonly\" onkeyup=\"format(this, 0);\" onchange=\"format(this, 0)\" /></td>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <table align=\"center\" width=\"1115\" height=\"10\" style=\"margin-top: 10px;\" border=\"0\">\r\n");
      out.write("                                <th align=\"center\" height=\"25%\" width=\"160\">TOTALES</th>\r\n");
      out.write("                                <td height=\"15%\" colspan=\"3\" width=\"140px\"></td>\r\n");
      out.write("                                <td align=\"center\" width=\"86px\"><input type=\"text\" class=\"textbox\" style=\"background-color:#CCC; width: 100px;\" name=\"totalpesoFinal\" id=\"TotalpesoFinal\" readonly=\"readonly\" onkeyup=\"format(this);\" onchange=\"format(this)\"></td>\r\n");
      out.write("                                <td height=\"15%\" width=\"90px\" colspan=\"2\"></td>\r\n");
      out.write("                                <td align=\"center\" width=\"86px\"><input type=\"text\" class=\"textbox\" style=\"background-color:#CCC; width: 110px;\" name=\"totalkilosVerde\" id=\"TotalkilosVerde\" readonly=\"readonly\"></td>\r\n");
      out.write("                                <td align=\"center\" width=\"86px\"><input type=\"text\" class=\"textbox\" style=\"background-color:#CCC; width: 100px;\" name=\"totalvalorUnitario\" readonly=\"readonly\" id=\"totalvalorUnitario\" onkeyup=\"format(this);\" onchange=\"format(this)\" /></td>\r\n");
      out.write("                                <td align=\"center\" width=\"50px\"><input type=\"text\" class=\"textbox\" style=\"background-color:#CCC; width: 120px;\" name=\"totalvalorTotal\" readonly=\"readonly\" id=\"totalvalorTotal\" onkeyup=\"parafiscales(); format(this);\" onchange=\"format(this); \" /></td>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("            <div class=\"parafiscales\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        \r\n");
      out.write("                        <th>Parafiscales</th>\r\n");
      out.write("                        <th></th>\r\n");
      out.write("                        <th>Fomento Arrocero</th>\r\n");
      out.write("                        <th>Asistencia Tecnica</th>\r\n");
      out.write("                        <th>Intereses</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select class=\"textbox\" name=\"select\" id=\"select\" onchange=\"seleector(this.value)\">\r\n");
      out.write("                                <option>Seleccione</option>\r\n");
      out.write("                                <option id=\"bolsa\" value=\"bolsa\">Bolsa Nacional Agropecuaria</option>\r\n");
      out.write("                                <option id=\"retencion\" value=\"retencion\">Retencion Fuente</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td><input type=\"text\" class=\"textbox\" id=\"option\" name=\"bolsa_retencion\" onkeyup=\"format(this);\" onchange=\"format(this)\" readonly=\"\"></td>\r\n");
      out.write("                        <td><input type=\"text\" class=\"textbox\" id=\"fomento-arrocero\" onkeyup=\"format(this);\" readonly=\"\" onchange=\"format(this)\" name=\"fomento_arrocero\" readonly=\"\"></td>\r\n");
      out.write("                        ");
 
               try
               {
                   Connection conexion = new ConexionBD().ConexionBD2();
                   if(!conexion.isClosed())
                   {
                       Statement st = conexion.createStatement();
                       ResultSet rs = st.executeQuery("select asistencia('" +lote+" ')as total");
                       
                         System.err.println("pase"); 
                   while(rs.next())
                   {
                        out.println("<td><input type='text' class='textbox' id='asistencia-tecnica' onkeyup='format(this);'onchange='format(this)'name='asistencia_tecnica' readonly= '' value="+rs.getObject("total")+"></td>");
                   }
                   conexion.close();
                                     
                   }
                   else 
                       out.println("fallo");
               }
               catch(Exception e )
               {
                   e.printStackTrace();
               }
         
      out.write("\r\n");
      out.write("             <td><input type=\"text\" class=\"textbox\" id=\"intereses\" onkeyup=\"format(this);\" onchange=\"format(this)\" name=\"intereses\"  value=\"\"></td>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cont-inputsL\" style=\"margin-top: -10px;\">\r\n");
      out.write("                <input style=\"font-family: Times New Roman;\" type=\"button\" onclick=\"VentanaEmergenteL()\" class=\"agregar-insumoL\" value=\"GUARDAR\"/>\r\n");
      out.write("                <input style=\"font-family: Times New Roman;\" name=\"cerrar\"  type=\"button\" class=\"agregar-insumoL\" value=\"CERRAR\" onclick=\"location.href ='corta.jsp'\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </form> \r\n");
      out.write("            <script>\r\n");
      out.write("                miles('totalvalorTotal');\r\n");
      out.write("                miles('asistencia-tecnica');\r\n");
      out.write("            </script>\r\n");
      out.write("    <div id=\"piepagina\">\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div id=\"\"></div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
