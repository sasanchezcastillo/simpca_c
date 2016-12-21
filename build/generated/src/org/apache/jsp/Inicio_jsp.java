package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link href=\"imagenes/favicon.ico\" rel=\"icon\"/>\n");
      out.write("        <link href=\"css/css1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/general_simpca.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        ");

            HttpSession objSession = request.getSession();
            String cedula = (String) objSession.getAttribute("cedula");
            String nombre = (String) objSession.getAttribute("nombre");
            String lote = (String) objSession.getAttribute("lote");
            objSession.setAttribute("sesion", "cerrar");

            if (cedula == null) {
                if (nombre == null) {
                    if (lote == null) {
                        response.sendRedirect("Inicio_sesion.jsp");
                    }
                }
            }
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <!--Interfaz Inicio, permite que el agricultor pueda Ingresar al Menu de la pagina para ingresar la informacion correspondiente al lote -->\n");
      out.write("    <body class=\"fondoInicio\">\n");
      out.write("        <div id=\"toplogo\">\n");
      out.write("            <h1 id=\"logo\">\n");
      out.write("                <a href=\"#\" title=\"Coagronorte-Cooperativa Agropecuaria Norte de Santander\"></a>\n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("        <header>\n");
      out.write("            <section>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Coagronorte</a>\n");
      out.write("                        <li><a href=\"#\">Productos</a>\n");
      out.write("                        <li><a href=\"#\">Servicios</a>\n");
      out.write("                        <li><a href=\"#\">Blog</a>\n");
      out.write("                        <li><a href=\"#\">Contacto </a>\n");
      out.write("                        <li><a href=\"#\">");
      out.print(nombre);
      out.write("</a>\n");
      out.write("                        <li><a href=\"Session\">Cerrar Sesion</a> \n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </section>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper-inicio\" align=\"center\">\n");
      out.write("            <div class=\"contenedor-a_insumo\" style=\"border: none;\" align=\"center\" >    \n");
      out.write("                <div class=\"ima-a_insumo\">\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/ArroZulia.png\" >\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arroz_oro.png\">\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arroz_premiun.png\">\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arroz_intregal.png\">\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arina_Arroz.png\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cuerpo\">        \n");
      out.write("                    <table width=\"200px\" style=\"margin-left: 140px;\" border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"center\"><font style=\"font-family: Times New Roman;\" size=\"+3\">Lote:</font></td>\n");
      out.write("                            <td><input type=\"text\" class=\"textbox\" style=\"background: none; width: 100px; font-size: 30px; font-family: Times New Roman;\" readonly=\"lote\" name=\"num_lote\" value=\"");
      out.print(lote);
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"cont-pl\">\n");
      out.write("                        <a class=\"htitulos\" href=\"preparacion_de_lotes.jsp\">PREPARACION DEL LOTE</a>\n");
      out.write("                        <div class=\"pl-img\">\n");
      out.write("                            <a href=\"preparacion_de_lotes.jsp\">\n");
      out.write("                                <img class=\"img1\" src=\"imagenes/tractor.jpg\" >\n");
      out.write("                                <img class=\"img2\" src=\"imagenes/preparacion.jpg\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"cont-c\">\n");
      out.write("                             <a  href=\"cosecha.jsp\" class=\"htitulos\">COSECHA</a>\n");
      out.write("                             <div class=\"c-img\">\n");
      out.write("                                 <a href=\"cosecha.jsp\">\n");
      out.write("                                  <img src=\"imagenes/cosecha.jpg\" /> \n");
      out.write("                                 <img src=\"imagenes/corta2.jpg\"width=\"303\" height=\"203\"  />\n");
      out.write("                                 </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"cont-ct\">\n");
      out.write("                            <a class=\"htitulos\"href=\"corta.jsp\">CORTA</a>\n");
      out.write("                            <div class=\"ct-img\" style=\"text-decoration: none;\">\n");
      out.write("                                <a href=\"corta.jsp\">\n");
      out.write("                                <img src=\"imagenes/corta.jpg\"  /> \n");
      out.write("                                <img src=\"imagenes/corta3.jpg\"  />\n");
      out.write("                                </a>                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"cont-ct\">\n");
      out.write("                           \n");
      out.write("                            <div class=\"form-consultar\">\n");
      out.write("                                <form action=\"DetallesTotal\" method=\"post\" style=\"margin-top: 25px;\">\n");
      out.write("                                     <a class=\"htitulos\">CONSULTAR LOTE</a>\n");
      out.write("                                     <br>\n");
      out.write("                                    <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
      out.print(lote);
      out.write("\"/>\n");
      out.write("                                    <input class=\"agregar-insumo\" style=\"margin-top: 10px;\" type=\"submit\" value=\"Consultar\"/>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <!--Pie de Pagina-->\n");
      out.write("            <div id=\"pie_paginaInicio\" align=\"center\">\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
