package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controladores.Graficas_usuarios;

public final class graficas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/garficas_estaidisticas.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.10/c3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.6/d3.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.10/c3.min.js\"></script>\n");
      out.write("        <link href=\"css/general_simpca.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        
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
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"toplogo\">\n");
      out.write("            <h1 id=\"logo\">\n");
      out.write("                <a href=\"Inicio.jsp\" title=\"Coagronorte-Cooperativa Agropecuaria Norte de Santander\"></a>\n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("\n");
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
      out.print( nombre);
      out.write("</a>\n");
      out.write("                        <li><a href=\"Session\">Cerrar Sesion</a>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </section>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"cont-graficas\">\n");
      out.write("            <h2>Gastos Totales</h2>\n");
      out.write("            <input type=\"text\" value=\"");
      out.print( datos.getGastos_insumos() );
      out.write("\">\n");
      out.write("            <div id=\"chart\" class=\"torta\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            var chart = c3.generate({\n");
      out.write("                data: {\n");
      out.write("                    columns: [\n");
      out.write("                        ['Mano De Obra','");
      out.print( datos.getGastos_mano_obra() );
      out.write("'],\n");
      out.write("                        ['Insumos', '");
      out.print( datos.getGastos_insumos() );
      out.write("'],\n");
      out.write("                        ['Otros', '");
      out.print( datos.getGastos_otros() );
      out.write("']\n");
      out.write("                    ],\n");
      out.write("                    type: 'pie'\n");
      out.write("                },\n");
      out.write("                legend: {\n");
      out.write("                    show: false\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function toggle(id) {\n");
      out.write("                chart.toggle(id);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            d3.select('.container').insert('div', '.chart').attr('class', 'legend').selectAll('span')\n");
      out.write("                    .data(['mano', 'insumo', 'otro'])\n");
      out.write("                    .enter().append('span')\n");
      out.write("                    .attr('data-id', function (id) {\n");
      out.write("                        return id;\n");
      out.write("                    })\n");
      out.write("                    .html(function (id) {\n");
      out.write("                        return id;\n");
      out.write("                    })\n");
      out.write("                    .each(function (id) {\n");
      out.write("                        d3.select(this).style('background-color', chart.color(id));\n");
      out.write("                    })\n");
      out.write("                    .on('mouseover', function (id) {\n");
      out.write("                        chart.focus(id);\n");
      out.write("                    })\n");
      out.write("                    .on('mouseout', function (id) {\n");
      out.write("                        chart.revert();\n");
      out.write("                    })\n");
      out.write("                    .on('click', function (id) {\n");
      out.write("                        chart.toggle(id);\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
