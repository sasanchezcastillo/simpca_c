package org.apache.jsp.administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class grafiicas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\n");
      out.write("<script src=\"../Js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    #container2, #sliders2 {\n");
      out.write("        min-width: 310px; \n");
      out.write("        max-width: 800px;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        width: 20%;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    #container2 {\n");
      out.write("        height: 400px; \n");
      out.write("        width: 100%;\n");
      out.write("     \n");
      out.write("    }\n");
      out.write("    .con-graficas-reportes{\n");
      out.write("     width: 100%;\n");
      out.write("     margin-bottom: auto;\n");
      out.write("     margin: 0 auto;\n");
      out.write("     top: 0px;\n");
      out.write("     margin-top: 12%;\n");
      out.write("     padding: 20px;\n");
      out.write("\n");
      out.write("     background: white; \n");
      out.write("\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(function () {\n");
      out.write("        // Set up the chart\n");
      out.write("        var chart = new Highcharts.Chart({\n");
      out.write("            chart: {\n");
      out.write("                renderTo: 'container2',\n");
      out.write("                type: 'column',\n");
      out.write("                options3d: {\n");
      out.write("                    enabled: true,\n");
      out.write("                    alpha: 0,\n");
      out.write("                    beta: 0,\n");
      out.write("                    depth: 65,\n");
      out.write("                    viewDistance: 25\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            title: {\n");
      out.write("                text: 'Estadistica'\n");
      out.write("            },\n");
      out.write("            subtitle: {\n");
      out.write("                text: 'Los 10 Asociados Com Mayores Gastos '\n");
      out.write("            },\n");
      out.write("            plotOptions: {\n");
      out.write("                column: {\n");
      out.write("                    depth: 55\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            series: [{\n");
      out.write("                    name : 'Usuarios',\n");
      out.write("                   \n");
      out.write("                    data: [1212323,32323232323,32323232]\n");
      out.write("                 \n");
      out.write("}]\n");
      out.write("                \n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function showValues() {\n");
      out.write("            $('#alpha-value').html(chart.options.chart.options3d.alpha);\n");
      out.write("            $('#beta-value').html(chart.options.chart.options3d.beta);\n");
      out.write("            $('#depth-value').html(chart.options.chart.options3d.depth);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Activate the sliders\n");
      out.write("        $('#sliders2 input').on('input change', function () {\n");
      out.write("            chart.options.chart.options3d[this.id] = this.value;\n");
      out.write("            showValues();\n");
      out.write("            chart.redraw(false);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        showValues();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <script src=\"../Js/exporting.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"../Js/higchart-3d.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"../Js/higchart.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"https://code.highcharts.com/highcharts-3d.js\"></script>\n");
      out.write("\n");
      out.write("    <div class=\"con-graficas-reportes\">\n");
      out.write("         <div id=\"container2\"></div>\n");
      out.write("            <div id=\"sliders2\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Posición</td>\n");
      out.write("                        <td><input id=\"alpha\" type=\"range\" min=\"0\" max=\"45\" value=\"15\"/> <span id=\"alpha-values\" class=\"value\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Giro</td>\n");
      out.write("                        <td><input id=\"beta\" type=\"range\" min=\"-45\" max=\"45\" value=\"15\"/> <span id=\"beta-values\" class=\"value\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Profundidad</td>\n");
      out.write("                        <td><input id=\"depth\" type=\"range\" min=\"20\" max=\"100\" value=\"50\"/> <span id=\"depth-values\" class=\"value\"></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("    </div>     \n");
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
