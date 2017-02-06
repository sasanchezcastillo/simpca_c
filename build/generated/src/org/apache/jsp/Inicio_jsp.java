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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <link href=\"imagenes/favicon.ico\" rel=\"icon\"/>\r\n");
      out.write("        <link href=\"css/css1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/general_simpca.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Inicio</title>\r\n");
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
        
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <!--Interfaz Inicio, permite que el agricultor pueda Ingresar al Menu de la pagina para ingresar la informacion correspondiente al lote -->\r\n");
      out.write("    <body class=\"fondoInicio\">\r\n");
      out.write("        <div id=\"toplogo\">\r\n");
      out.write("            <h1 id=\"logo\">\r\n");
      out.write("                <a href=\"#\" title=\"Coagronorte-Cooperativa Agropecuaria Norte de Santander\"></a>\r\n");
      out.write("            </h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <header>\r\n");
      out.write("            <section>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Coagronorte</a>\r\n");
      out.write("                        <li><a href=\"#\">Productos</a>\r\n");
      out.write("                        <li><a href=\"#\">Servicios</a>\r\n");
      out.write("                        <li><a href=\"#\">Blog</a>\r\n");
      out.write("                        <li><a href=\"#\">Contacto </a>\r\n");
      out.write("                        <li><a href=\"#\">");
      out.print(nombre);
      out.write("</a>\r\n");
      out.write("                        <li><a href=\"Session\">Cerrar Sesion</a> \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </section>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper-inicio\" align=\"center\">\r\n");
      out.write("            <div class=\"contenedor-a_insumo\" style=\"border: none;\" align=\"center\" >    \r\n");
      out.write("                <div class=\"ima-a_insumo\">\r\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/ArroZulia.png\" >\r\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arroz_oro.png\">\r\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arroz_premiun.png\">\r\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arroz_intregal.png\">\r\n");
      out.write("                    <img class=\"img-productos\" src=\"imagenes/arina_Arroz.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cuerpo\">        \r\n");
      out.write("                    <div class=\"lote-atras\">\r\n");
      out.write("                        <form method=\"post\" action=\"lote\" >\r\n");
      out.write("                            <input type=\"image\" title=\"Elegir Lote\" src=\"imagenes/atrasX32.png\" />   \r\n");
      out.write("                            <h2 id=\"h2-elegir\">N° Lote: ");
      out.print(lote);
      out.write("</h2>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cont-pl\">\r\n");
      out.write("                        <a class=\"htitulos\" href=\"preparacion_de_lotes.jsp\">PREPARACION DEL LOTE</a>\r\n");
      out.write("                        <div class=\"pl-img\">\r\n");
      out.write("                            <a href=\"preparacion_de_lotes.jsp\">\r\n");
      out.write("                                <img class=\"img1\" src=\"imagenes/tractor.jpg\" >\r\n");
      out.write("                                <img class=\"img2\" src=\"imagenes/preparacion.jpg\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"cont-c\">\r\n");
      out.write("                        <a  href=\"cosecha.jsp\" class=\"htitulos\">COSECHA</a>\r\n");
      out.write("                        <div class=\"c-img\">\r\n");
      out.write("                            <a href=\"cosecha.jsp\">\r\n");
      out.write("                                <img src=\"imagenes/cosecha.jpg\" /> \r\n");
      out.write("                                <img src=\"imagenes/corta2.jpg\"width=\"303\" height=\"203\"  />\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cont-ct\">\r\n");
      out.write("                        <a class=\"htitulos\"href=\"corta.jsp\">CORTA</a>\r\n");
      out.write("                        <div class=\"ct-img\" style=\"text-decoration: none;\">\r\n");
      out.write("                            <a href=\"corta.jsp\">\r\n");
      out.write("                                <img src=\"imagenes/corta.jpg\"  /> \r\n");
      out.write("                                <img src=\"imagenes/corta3.jpg\"  />\r\n");
      out.write("                            </a>                                \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cont-ct\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-consultar\">\r\n");
      out.write("                            <form action=\"DetallesTotal\" method=\"post\" style=\"margin-top: 25px;\">\r\n");
      out.write("                                <a class=\"htitulos\">CONSULTAR LOTE</a>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
      out.print(lote);
      out.write("\"/>\r\n");
      out.write("                                <input class=\"agregar-insumo\" style=\"margin-top: 10px;\" type=\"submit\" value=\"Consultar\"/>\r\n");
      out.write("\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <!--Pie de Pagina-->\r\n");
      out.write("            <div id=\"pie_paginaInicio\" align=\"center\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
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
