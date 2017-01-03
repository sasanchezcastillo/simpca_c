package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class consultar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    ");

        HttpSession objSession = request.getSession();
        String lote = (String) objSession.getAttribute("lote");
        String nombre = (String) objSession.getAttribute("nombre");
        objSession.setAttribute("sesion", "cerrar");

        if (nombre == null) {
            if (lote == null) {
                response.sendRedirect("Inicio_sesion.jsp");
            }
        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"imagenes/favicon.ico\" rel=\"icon\"/>\r\n");
      out.write("        <script src=\"Js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"Js/newjavascript.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <meta name=\"viewport\" charset=UTF-8\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("        <link href=\"css/general_simpca.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/consultas_1.css\" rel=\"stylesheet\" type=\"text/css\"/>        \r\n");
      out.write("        <script src=\"Js/Consultas.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"imagenes/favicon.ico\" rel=\"icon\"/>\r\n");
      out.write("        <title>consultas</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <!--Interfaz Inicio, permite que el agricultor pueda Ingresar al Menu de la pagina para ingresar la informacion correspondiente al lote -->\r\n");
      out.write("    <body class=\"fondoInicio\">\r\n");
      out.write("        <div id=\"toplogo\">\r\n");
      out.write("            <h1 id=\"logo\">\r\n");
      out.write("                <a href=\"Inicio.jsp\" title=\"Coagronorte-Cooperativa Agropecuaria Norte de Santander\"></a>\r\n");
      out.write("            </h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
      out.write("                        <li><a href=\"Session\">Cerrar Sesion</a>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </section>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"cont-consultas\">\r\n");
      out.write("            <h3 class=\"info-lote\" style=\"font-size: 22px; font-family: Times New Roman; float: right; \r\n");
      out.write("                position: relative;\">Lote: \r\n");
      out.write("                <input type=\"text\" id=\"lote\" name=\"num_lote\" style=\"font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none;position: relative;\" value=\"");
      out.print(lote);
      out.write("\" readonly=\"");
      out.print(lote);
      out.write("\"/>\r\n");
      out.write("            </h3><br/>           \r\n");
      out.write("            <h2 id=\"h2costosdeproduccion\" style=\"width: 100%;\">COSTOS DE PRODUCCIÓN</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                <h3>QUEMA QUÍMICA</h3>\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_quema_quimica}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <img src=\"img-con/quema_fi.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("\r\n");
            out.write("                        <form action=\"ServletQuemaQuimica\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" id=\"Quemaquimica\"  value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total_quemaq}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" readonly=\"\"  placeholder=\"$ 0.0\"class=\"textbox\" > \r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("\r\n");
            out.write("                    </div> \r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                <h3>QUEMA FÍSICA</h3>\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_quema_fisica}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_1.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <img src=\"img-con/u56.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("                        <form action=\"ServletQuemaFisica\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Quemafisica\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_qf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"submit\" value=\"Ver Detalles\" style=\"text-align: center\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("                    </div>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                <h3>PREPARACIÓN DE SUELO</h3>\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_2.setParent(null);
      _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_preparacion_suelo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_2.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <img src=\"img-con/u58.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                        <form action=\"ServletPreparacionSuelo\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" id=\"Suelo\" readonly=\"\" placeholder=\"$\" class=\"textbox\" name=\"total_n\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_preparacion_suelo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                <h3>MANEJO RESIDUOS DE COSECHA</h3>\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_3.setParent(null);
      _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_total_mrc}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_3.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
        if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <img src=\"img-con/u62.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                        <div class=\"class-cont-consulta\">\r\n");
            out.write("                            <form action=\"Detalles_corta_maleza\" method=\"post\">\r\n");
            out.write("                                <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                                <input type=\"text\" id=\"Residuos\"  readonly=\"\" placeholder=\"$\" class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total_mrc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                                <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                            </form>\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_3.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_4.setParent(null);
      _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_siembra_mecanizada}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_4.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
        if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>SIEMBRA MECANIZADA</h3>\r\n");
            out.write("                    <img src=\"img-con/u60.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletSiembraMecanizada\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Siembramecanizada\" placeholder=\"$ 0.0\"class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_smzd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_4.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_5.setParent(null);
      _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_siembra_manual}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_5.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
        if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3 >SIEMBRA MANUAL</h3>\r\n");
            out.write("                    <img src=\"img-con/u30.png\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletSiembraManual\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Siembramanual\" placeholder=\"$\"class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_siembra_manual}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">                                 \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_5.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
      }
      out.write("\r\n");
      out.write("            </div>        \r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_6.setParent(null);
      _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Valor_total_abonada}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_6.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
        if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>ABONADAS</h3>\r\n");
            out.write("                    <img src=\"img-con/u42.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletAbonada_insumos\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\" >\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Abonada\" placeholder=\"$\"class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_abonada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" >    \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_6.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_6.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_7.setParent(null);
      _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_fumiga}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_7.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
        if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>FUMIGAS</h3>\r\n");
            out.write("                    <img src=\"img-con/u44.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletFumigas\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Fumiga\" placeholder=\"$\"class=\"textbox\" name=\"total_f\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_fumiga}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                            <input type=\"submit\" value=\"Ver Detalles\" class=\"detalles\"style=\"font-size: 15px; font-family: Times New Roman;\" />\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_7.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_7.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
      }
      out.write("\r\n");
      out.write("            </div>    \r\n");
      out.write("\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_8.setParent(null);
      _jspx_th_c_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_despalille}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_8.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
        if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>DESPALILLE</h3>\r\n");
            out.write("                    <img src=\"img-con/u56 (1).jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletDespalille\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Despalille\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_despalille}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">    \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_8.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_8.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_8);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_9.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_9.setParent(null);
      _jspx_th_c_forEach_9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_entresaque}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_9.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_9 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_9 = _jspx_th_c_forEach_9.doStartTag();
        if (_jspx_eval_c_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>ENTRESAQUE</h3>\r\n");
            out.write("                    <img src=\"img-con/u56 (1).jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletEntresaque\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Entresaque\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_entresaque}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_9.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_9[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_9.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_9.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_9);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_10.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_10.setParent(null);
      _jspx_th_c_forEach_10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_macheteada}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_10.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_10 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_10 = _jspx_th_c_forEach_10.doStartTag();
        if (_jspx_eval_c_forEach_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>MACHETEADA</h3>\r\n");
            out.write("                    <img src=\"img-con/u56 (1).jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletMacheteada\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Macheteada\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_macheteada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_10.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_10[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_10.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_10.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_10);
      }
      out.write("\r\n");
      out.write("            </div>  \r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_11 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_11.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_11.setParent(null);
      _jspx_th_c_forEach_11.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_pajareo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_11.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_11 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_11 = _jspx_th_c_forEach_11.doStartTag();
        if (_jspx_eval_c_forEach_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>PAJAREO</h3>\r\n");
            out.write("                    <img src=\"img-con/u62 (1).jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletPajareoCeladuria\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Pajareo\" placeholder=\"$\"class=\"textbox\"value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_pajareo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_11.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_11[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_11.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_11.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_11);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_12 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_12.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_12.setParent(null);
      _jspx_th_c_forEach_12.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_riego}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_12.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_12 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_12 = _jspx_th_c_forEach_12.doStartTag();
        if (_jspx_eval_c_forEach_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" \r\n");
            out.write("                    <h3>RIEGO</h3>\r\n");
            out.write("                    <img src=\"img-con/u54.png\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletRiego\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Riego\" placeholder=\"$\"class=\"textbox\"value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_riego}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_12.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_12[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_12.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_12.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_12);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_13 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_13.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_13.setParent(null);
      _jspx_th_c_forEach_13.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_corta_bultos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_13.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_13 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_13 = _jspx_th_c_forEach_13.doStartTag();
        if (_jspx_eval_c_forEach_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>CORTA BULTOS</h3>\r\n");
            out.write("                    <img src=\"img-con/u48.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletCortaBultos\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Bultos\" placeholder=\"$\"class=\"textbox\"  value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_corta_bultos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_13.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_13[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_13.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_13.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_13);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_14 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_14.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_14.setParent(null);
      _jspx_th_c_forEach_14.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_corta_granel}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_14.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_14 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_14 = _jspx_th_c_forEach_14.doStartTag();
        if (_jspx_eval_c_forEach_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>CORTA GRANEL</h3>\r\n");
            out.write("                    <img src=\"img-con/u49.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletCortaGranel\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Granel\" placeholder=\"$\"class=\"textbox\"value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_corta_granel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_14.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_14[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_14.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_14.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_14);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_15 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_15.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_15.setParent(null);
      _jspx_th_c_forEach_15.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_mantenimiento_lote}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_15.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_15 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_15 = _jspx_th_c_forEach_15.doStartTag();
        if (_jspx_eval_c_forEach_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>MANTENIMIENTO</h3>\r\n");
            out.write("                    <img src=\"img-con/u60.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"ServletMantenimiento\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" id=\"Mantenimiento\" readonly=\"\" placeholder=\"$\" class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_mntlote}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_15.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_15[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_15.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_15.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_15);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_16 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_16.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_16.setParent(null);
      _jspx_th_c_forEach_16.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_total_liquidacion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_16.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_16 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_16 = _jspx_th_c_forEach_16.doStartTag();
        if (_jspx_eval_c_forEach_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>LIQUIDACIÓN</h3>\r\n");
            out.write("                    <img src=\"img-con/u61.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"LiquidacionDetalles\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"liquidacion\" placeholder=\"$\" class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total_liquidacion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input type=\"submit\" value=\"Ver Detalles\" id=\"liquidacion\" class=\"detalles\" style=\"font-size: 15px; font-family: Times New Roman; text-align: center;\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_16.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_16[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_16.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_16.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_16);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"class-consulta\">\r\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_17 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_17.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_17.setParent(null);
      _jspx_th_c_forEach_17.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_arriendo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_17.setVar("lista");
      int[] _jspx_push_body_count_c_forEach_17 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_17 = _jspx_th_c_forEach_17.doStartTag();
        if (_jspx_eval_c_forEach_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <h3>Arriendo</h3>\r\n");
            out.write("                    <img src=\"imagenes/arriendo.jpg\" class=\"img-consultas\"/>\r\n");
            out.write("                    <div class=\"class-cont-consulta\">\r\n");
            out.write("                        <form action=\"LiquidacionDetalles\" method=\"post\">\r\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\r\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"arriendo\" placeholder=\"$\" class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_arriendo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \r\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\r\n");
            out.write("                        </form>\r\n");
            out.write("                    </div>\r\n");
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_17.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_17[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_17.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_17.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_17);
      }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"class-consulta-total\">\r\n");
      out.write("                    <label class=\"lblCostos\">Gastos Totales</label><br/>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <label class=\"lblCostos\">Gastos En Insumos</label><br/>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <label class=\"lblCostos\">Gastos En Mano De Obra</label><br/>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_20(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <label class=\"lblCostos\">Otros Gastos</label><br/>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_21(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <label class=\"lblCostos\">Costos Por Hectarea</label><br/>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_22(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("                    <label class=\"lblCostos\">Costos Por Kilogramo</label><br/>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_23(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <label class=\"lblCostos\">Resultado Económico</label><br/>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_24(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"button\"id=\"botonvolver\"  value=\"VOLVER\" onclick=\"location.href = 'Inicio.jsp'\" >\r\n");
      out.write("                    <form action=\"graficas\" method=\"post\"> \r\n");
      out.write("                        <input type=\"text\" value=\"");
      out.print(lote);
      out.write("\" name=\"num_lote\">\r\n");
      out.write("                    <input type=\"submit\" id=\"botonvolver\"  value=\"VER EN GRAFICAS\" >\r\n");
      out.write("                    </form>\r\n");
      out.write("                    </div> \r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    <footer>\r\n");
      out.write("        <!--Pie de Pagina-->\r\n");
      out.write("        <div id=\"pie_paginaInicio\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            var nStr = document.getElementById('valorGanancias').value;\r\n");
      out.write("            if (nStr.indexOf(\"Usted Perdió\") !== -1) {\r\n");
      out.write("                $('#valorGanancias').css('background-color', '#ef9a9a');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            } else {\r\n");
      out.write("                $('#valorGanancias').css('background-color', '#AED581');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        miles(\"arriendo\");\r\n");
      out.write("        miles(\"Quemaquimica\");\r\n");
      out.write("        miles(\"Quemafisica\");\r\n");
      out.write("        miles(\"Suelo\");\r\n");
      out.write("        miles(\"Residuos\");\r\n");
      out.write("        miles(\"Siembramecanizada\");\r\n");
      out.write("        miles(\"Siembramanual\");\r\n");
      out.write("        miles(\"Abonada\");\r\n");
      out.write("        miles(\"Fumiga\");\r\n");
      out.write("        miles(\"Despalille\");\r\n");
      out.write("        miles(\"Entresaque\");\r\n");
      out.write("        miles(\"Macheteada\");\r\n");
      out.write("        miles(\"Pajareo\");\r\n");
      out.write("        miles(\"Riego\");\r\n");
      out.write("        miles(\"Bultos\");\r\n");
      out.write("        miles(\"Granel\");\r\n");
      out.write("        miles(\"Mantenimiento\");\r\n");
      out.write("        miles(\"liquidacion\");\r\n");
      out.write("        miles(\"valorTotalt\");\r\n");
      out.write("        miles(\"valorTotalhectareas\");\r\n");
      out.write("        miles(\"valorGanancias\");\r\n");
      out.write("        miles(\"valorkilogramo\");\r\n");
      out.write("        miles(\"valorinsumo\");\r\n");
      out.write("        miles(\"totalmano\");\r\n");
      out.write("        miles(\"otros\");\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_18 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_18.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_18.setParent(null);
    _jspx_th_c_forEach_18.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_18.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_18 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_18 = _jspx_th_c_forEach_18.doStartTag();
      if (_jspx_eval_c_forEach_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <input type=\"text\" id=\"valorTotalt\" class=\"textbox\" readonly=\"readonly\" name=\"valor_total\" value=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_18.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_18.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_18);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_19 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_19.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_19.setParent(null);
    _jspx_th_c_forEach_19.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_insumos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_19.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_19 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_19 = _jspx_th_c_forEach_19.doStartTag();
      if (_jspx_eval_c_forEach_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <input type=\"text\" id=\"valorinsumo\" readonly=\"readonly\" name=\"gastos_insumos\"class=\"textbox\" value=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_insumos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_19.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_19.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_19);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_20 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_20.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_20.setParent(null);
    _jspx_th_c_forEach_20.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_mano}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_20.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_20 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_20 = _jspx_th_c_forEach_20.doStartTag();
      if (_jspx_eval_c_forEach_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <input type=\"text\" id=\"totalmano\" readonly=\"readonly\"  name=\"gastos_mano\"class=\"textbox\" value=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_mano}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_20.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_20[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_20.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_20.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_20);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_21 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_21.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_21.setParent(null);
    _jspx_th_c_forEach_21.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_otros}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_21.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_21 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_21 = _jspx_th_c_forEach_21.doStartTag();
      if (_jspx_eval_c_forEach_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <input type=\"text\" id=\"otros\" readonly=\"readonly\" name=\"otros\" class=\"textbox\" value=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_otros}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_21.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_21[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_21.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_21.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_21);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_22 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_22.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_22.setParent(null);
    _jspx_th_c_forEach_22.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total_gastos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_22.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_22 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_22 = _jspx_th_c_forEach_22.doStartTag();
      if (_jspx_eval_c_forEach_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <input type=\"text\" id=\"valorTotalhectareas\"  readonly=\"readonly\" class=\"textbox\" value=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_gastos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>     \r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_22.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_22[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_22.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_22.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_22);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_23 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_23.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_23.setParent(null);
    _jspx_th_c_forEach_23.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_kilogramo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_23.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_23 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_23 = _jspx_th_c_forEach_23.doStartTag();
      if (_jspx_eval_c_forEach_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <input type=\"text\" id=\"valorkilogramo\" readonly=\"readonly\" class=\"textbox\" value=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_kilogramo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_23.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_23[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_23.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_23.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_23);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_24 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_24.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_24.setParent(null);
    _jspx_th_c_forEach_24.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_ganancia}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_24.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_24 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_24 = _jspx_th_c_forEach_24.doStartTag();
      if (_jspx_eval_c_forEach_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <input type=\"text\" id=\"valorGanancias\" class=\"textbox\" readonly=\"readonly\" class=\"\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_ganancia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_24.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_24[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_24.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_24.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_24);
    }
    return false;
  }
}
