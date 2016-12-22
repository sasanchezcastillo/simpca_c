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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
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
    
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <script src=\"Js/newjavascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta name=\"viewport\" charset=UTF-8\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link href=\"css/general_simpca.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/consultas_1.css\" rel=\"stylesheet\" type=\"text/css\"/>        \n");
      out.write("        <script src=\"Js/Consultas.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"imagenes/favicon.ico\" rel=\"icon\"/>\n");
      out.write("        <title>consultas</title>\n");
      out.write("    </head>\n");
      out.write("    <!--Interfaz Inicio, permite que el agricultor pueda Ingresar al Menu de la pagina para ingresar la informacion correspondiente al lote -->\n");
      out.write("    <body class=\"fondoInicio\">\n");
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
      out.print(nombre);
      out.write("</a>\n");
      out.write("                        <li><a href=\"Session\">Cerrar Sesion</a>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </section>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"cont-consultas\">\n");
      out.write("            <h3 class=\"info-lote\" style=\"font-size: 22px; font-family: Times New Roman; float: right; \n");
      out.write("                position: relative;\">Lote: \n");
      out.write("                <input type=\"text\" id=\"lote\" name=\"num_lote\" style=\"font-size: 20px; font-family: Times New Roman; width:50px; height: 30px; background: none; border:none;position: relative;\" value=\"");
      out.print(lote);
      out.write("\" readonly=\"");
      out.print(lote);
      out.write("\"/>\n");
      out.write("            </h3><br/>           \n");
      out.write("            <h2 id=\"h2costosdeproduccion\" style=\"width: 100%;\">COSTOS DE PRODUCCIÓN</h2>\n");
      out.write("\n");
      out.write("            <div class=\"class-consulta\">\n");
      out.write("                <h3>QUEMA QUÍMICA</h3>\n");
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
            out.write("\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <img src=\"img-con/quema_fi.jpg\" class=\"img-consultas\"/>\n");
            out.write("\n");
            out.write("                        <form action=\"ServletQuemaQuimica\" method=\"post\">\n");
            out.write("                            <input type=\"text\" id=\"Quemaquimica\"  value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total_quemaq}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" readonly=\"\"  placeholder=\"$ 0.0\"class=\"textbox\" > \n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("\n");
            out.write("                    </div> \n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
      out.write("                <h3>QUEMA FÍSICA</h3>\n");
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
            out.write("\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <img src=\"img-con/u56.jpg\" class=\"img-consultas\"/>\n");
            out.write("\n");
            out.write("\n");
            out.write("                        <form action=\"ServletQuemaFisica\" method=\"post\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Quemafisica\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_qf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"submit\" value=\"Ver Detalles\" style=\"text-align: center\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("\n");
            out.write("\n");
            out.write("                    </div>\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
      out.write("                <h3>PREPARACIÓN DE SUELO</h3>\n");
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
            out.write("\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <img src=\"img-con/u58.jpg\" class=\"img-consultas\"/>\n");
            out.write("                        <form action=\"ServletPreparacionSuelo\" method=\"post\">\n");
            out.write("                            <input type=\"text\" id=\"Suelo\" readonly=\"\" placeholder=\"$\" class=\"textbox\" name=\"total_n\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_preparacion_suelo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
      out.write("                <h3>MANEJO RESIDUOS DE COSECHA</h3>\n");
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
            out.write("\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <img src=\"img-con/u62.jpg\" class=\"img-consultas\"/>\n");
            out.write("                        <div class=\"class-cont-consulta\">\n");
            out.write("                            <form action=\"Detalles_corta_maleza\" method=\"post\">\n");
            out.write("                                <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                                <input type=\"text\" id=\"Residuos\"  readonly=\"\" placeholder=\"$\" class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total_mrc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                                <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                            </form>\n");
            out.write("                        </div>\n");
            out.write("                    </div>\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>SIEMBRA MECANIZADA</h3>\n");
            out.write("                    <img src=\"img-con/u60.jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletSiembraMecanizada\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Siembramecanizada\" placeholder=\"$ 0.0\"class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_smzd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3 >SIEMBRA MANUAL</h3>\n");
            out.write("                    <img src=\"img-con/u30.png\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletSiembraManual\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Siembramanual\" placeholder=\"$\"class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_siembra_manual}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">                                 \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>        \n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>ABONADAS</h3>\n");
            out.write("                    <img src=\"img-con/u42.jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletAbonada_insumos\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\" >\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Abonada\" placeholder=\"$\"class=\"textbox\" value=\" $");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_abonada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" >    \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>FUMIGAS</h3>\n");
            out.write("                    <img src=\"img-con/u44.jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletFumigas\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Fumiga\" placeholder=\"$\"class=\"textbox\" name=\"total_f\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_fumiga}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                            <input type=\"submit\" value=\"Ver Detalles\" class=\"detalles\"style=\"font-size: 15px; font-family: Times New Roman;\" />\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
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
      out.write("\n");
      out.write("            </div>    \n");
      out.write("\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>DESPALILLE</h3>\n");
            out.write("                    <img src=\"img-con/u56 (1).jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletDespalille\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Despalille\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_despalille}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">    \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>ENTRESAQUE</h3>\n");
            out.write("                    <img src=\"img-con/u56 (1).jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletEntresaque\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Entresaque\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_entresaque}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>MACHETEADA</h3>\n");
            out.write("                    <img src=\"img-con/u56 (1).jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletMacheteada\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Macheteada\" placeholder=\"$\"class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_macheteada}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>  \n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>PAJAREO</h3>\n");
            out.write("                    <img src=\"img-con/u62 (1).jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletPajareoCeladuria\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Pajareo\" placeholder=\"$\"class=\"textbox\"value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_pajareo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write(" \n");
            out.write("                    <h3>RIEGO</h3>\n");
            out.write("                    <img src=\"img-con/u54.png\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletRiego\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Riego\" placeholder=\"$\"class=\"textbox\"value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_riego}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>CORTA BULTOS</h3>\n");
            out.write("                    <img src=\"img-con/u48.jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletCortaBultos\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Bultos\" placeholder=\"$\"class=\"textbox\"  value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_corta_bultos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>CORTA GRANEL</h3>\n");
            out.write("                    <img src=\"img-con/u49.jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletCortaGranel\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"Granel\" placeholder=\"$\"class=\"textbox\"value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_corta_granel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>MANTENIMIENTO</h3>\n");
            out.write("                    <img src=\"img-con/u60.jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"ServletMantenimiento\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" id=\"Mantenimiento\" readonly=\"\" placeholder=\"$\" class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.total_mntlote}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"class-consulta\">\n");
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
            out.write("\n");
            out.write("                    <h3>LIQUIDACIÓN</h3>\n");
            out.write("                    <img src=\"img-con/u61.jpg\" class=\"img-consultas\"/>\n");
            out.write("                    <div class=\"class-cont-consulta\">\n");
            out.write("                        <form action=\"LiquidacionDetalles\" method=\"post\">\n");
            out.write("                            <input type=\"text\" name=\"num_lote\" hidden=\"\" value=\"");
            out.print(lote);
            out.write("\">\n");
            out.write("                            <input type=\"text\" readonly=\"\" id=\"liquidacion\" placeholder=\"$\" class=\"textbox\" value=\"$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total_liquidacion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"> \n");
            out.write("                            <input style=\"font-size: 15px; font-family: Times New Roman;\" type=\"submit\" value=\"Ver Detalles\" class=\"detalles\">\n");
            out.write("                        </form>\n");
            out.write("                    </div>\n");
            out.write("\n");
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
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"class-consulta-total\">\n");
      out.write("                <label class=\"lblCostos\">Gastos Totales</label><br/>\n");
      out.write("                 ");
      if (_jspx_meth_c_forEach_17(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <label class=\"lblCostos\">Gastos Por Hectarea</label><br/>\n");
      out.write("                <input type=\"text\" id=\"valorTotal\" readonly=\"readonly\" class=\"\" value=\"\"><br/>\n");
      out.write("                <label class=\"lblCostos\">Ganancias</label><br/>\n");
      out.write("                <input type=\"text\" id=\"valorTotal\" readonly=\"readonly\" class=\"\" value=\"\"><br/>\n");
      out.write("                <label class=\"lblCostos\">Costo Por Kilogramo</label><br/>\n");
      out.write("                <input type=\"text\" id=\"valorTotal\" readonly=\"readonly\" class=\"\" value=\"\"><br/>\n");
      out.write("                <label class=\"lblCostos\">Costo De Insumos</label><br/>\n");
      out.write("                <input type=\"text\" id=\"valorTotal\" readonly=\"readonly\" class=\"\" value=\"\"><br/>\n");
      out.write("                <label class=\"lblCostos\">Costos Por Mano De Obra</label><br/>\n");
      out.write("                <input type=\"text\" id=\"valorTotal\" readonly=\"readonly\" class=\"\" value=\"\"><br/>\n");
      out.write("                <input type=\"button\" id=\"botonvolver\" class=\"\" value=\"VOLVER\" onclick=\"location.href = 'Inicio.jsp'\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <!--Pie de Pagina-->\n");
      out.write("            <div id=\"pie_paginaInicio\" align=\"center\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("            miles(\"Quemaquimica\");\n");
      out.write("            miles(\"Quemafisica\");\n");
      out.write("            miles(\"Suelo\");\n");
      out.write("            miles(\"Residuos\");\n");
      out.write("            miles(\"Siembramecanizada\");\n");
      out.write("            miles(\"Siembramanual\");\n");
      out.write("            miles(\"Abonada\");\n");
      out.write("            miles(\"Fumiga\");\n");
      out.write("            miles(\"Despalille\");\n");
      out.write("            miles(\"Entresaque\");\n");
      out.write("            miles(\"Macheteada\");\n");
      out.write("            miles(\"Pajareo\");\n");
      out.write("            miles(\"Riego\");\n");
      out.write("            miles(\"Bultos\");\n");
      out.write("            miles(\"Granel\");\n");
      out.write("            miles(\"Mantenimiento\");\n");
      out.write("            miles(\"liquidacion\");\n");
      out.write("            miles(\"valorTotal\");\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_17 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_17.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_17.setParent(null);
    _jspx_th_c_forEach_17.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valor_total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_17.setVar("lista");
    int[] _jspx_push_body_count_c_forEach_17 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_17 = _jspx_th_c_forEach_17.doStartTag();
      if (_jspx_eval_c_forEach_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                     <input type=\"text\" id=\"valorTotal\" readonly=\"readonly\" class=\"\" value=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.valor_total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_17.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_17);
    }
    return false;
  }
}
