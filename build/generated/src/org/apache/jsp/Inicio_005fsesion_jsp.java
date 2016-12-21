package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_005fsesion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("        ");

            HttpSession objSession = request.getSession();
            String cedula = (String) objSession.getAttribute("cedula");
            String nombre = (String) objSession.getAttribute("pass");
        
      out.write("\n");
      out.write("           \n");
      out.write("       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"imagenes/favicon.ico\" rel=\"icon\"/>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/general_simpca.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Iniciar Sesion</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fondoS\" onload=\"volver();\">\n");
      out.write("        <div id=\"toplogo\">\n");
      out.write("        <h1 id=\"logo\">\n");
      out.write("            <a href=\"#\" title=\"Coagronorte-Cooperativa Agropecuaria Norte de Santander\"></a>\n");
      out.write("        </h1>\n");
      out.write("    </div>\n");
      out.write("        <header>\n");
      out.write("            <section>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Coagronorte</a>\n");
      out.write("                        <li><a href=\"#\">Productos</a>\n");
      out.write("                        <li><a href=\"#\">Servicios</a>\n");
      out.write("                        <li><a href=\"#\">Blog</a>\n");
      out.write("                        <li><a href=\"#\">Contacto </a> \n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </section>\n");
      out.write("        </header>\n");
      out.write("        <img src=\"ImagenesR/Sesion-1.png\" style=\"width: 100%; height: 400px; position: absolute\">\n");
      out.write("        <div class=\"contenedor-formulario\">\n");
      out.write("    <div class=\"wrap\">\n");
      out.write("           <form action=\"Iniciar\" class=\"formulario\" name=\"formulario_registro\" method=\"post\">\n");
      out.write("            <h1 class=\"titulo\">Iniciar Sesión</h1>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                         <input type=\"text\" id=\"cedula\"  name=\"cedula\"/>\n");
      out.write("                         <label class=\"label\" for=\"cedula\">Usuario \"Cédula\"</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"password\" id=\"contraseña\"  name=\"pass\"/>\n");
      out.write("                        <label class=\"label\" for=\"contraseña\">Contraseña</label>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        </br>\n");
      out.write("                        <div \n");
      out.write("                        style=\"text-align: center; font-size: 24px; color: red; \">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div style=\"text-align: center; font-size: 20px; text-decoration:\">\n");
      out.write("                            <a style=\"text-decoration: none; \" href=\"registroUsuario.jsp\"><h4 style=\"font-family: Times New Roman; color: #588157 ;\">Registrarse</h4></a>\n");
      out.write("                        </div>\n");
      out.write("                    <br>\n");
      out.write("                        <div style=\"text-align: center; font-size: 20px; text-decoration:\">\n");
      out.write("                            <a style=\"text-decoration: none;  \" href=\"restablecerC.jsp\"><h4 style=\"font-family: Times New Roman; color: #588157 ;\">¿Has olvidado tu contrase&ntilde;a?</h4></a>\n");
      out.write("                        </div>\n");
      out.write("                    <br><br>\n");
      out.write("                    <input id=\"ver\" type=\"submit\"   value=\"INGRESAR\" />\n");
      out.write("                    <input type=\"button\"  value=\"CANCELAR\" onclick=\"location.href='InicioCoagronorte.jsp'\"/>\n");
      out.write("            <script src=\"Js/formulario.js\"></script>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("        function ocultar(){\n");
      out.write("        document.getElementById(\"ver\").style.display = 'none';}\n");
      out.write("    \n");
      out.write("    function volver(){\n");
      out.write("        \n");
      out.write("        window.location.hash=\"si-funciona\";\n");
      out.write("        window.location.hash=\"si-Proyecto\";\n");
      out.write("        window.onhashchange=function (){window.location.hash=\"\";};\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("         <footer>\n");
      out.write("                <!--Pie de Pagina-->\n");
      out.write("                <div id=\"pie_paginaSesion\" align=\"center\">\n");
      out.write("                </div>\n");
      out.write("         </footer>\n");
      out.write("   </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty _mensajeErrorInicio}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div style=\"margin-left: 15px; color:red; font-size: 12px;\" role=\"alert\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_mensajeErrorInicio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
