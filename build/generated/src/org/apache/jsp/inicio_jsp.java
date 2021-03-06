package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>YET Aplicattion</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("        <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("             folder instead of downloading all of them to reduce the load. -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/iCheck/flat/blue.css\">\n");
      out.write("        <!-- Morris chart -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/morris/morris.css\">\n");
      out.write("        <!-- jvectormap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/datepicker/datepicker3.css\">\n");
      out.write("        <!-- Daterange picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!-- bootstrap wysihtml5 - text editor -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("        <link href=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-green sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <a href=\"inicio.jsp\" class=\"logo\">\n");
      out.write("                    <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("                    <span class=\"logo-mini\"><b>A</b>LT</span>\n");
      out.write("                    <!-- logo for regular state and mobile devices -->\n");
      out.write("                    <span class=\"logo-lg\">App<b>YET</b></span>\n");
      out.write("                </a>\n");
      out.write("                <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("                <nav class=\"navbar navbar-static-top\">\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <img src=\"dist/img/user.png\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                                    <span class=\"hidden-xs\">Usuario</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <!-- User image -->\n");
      out.write("                                    <li class=\"user-header\">\n");
      out.write("                                        <img src=\"dist/img/user.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                                        <p>\n");
      out.write("                                             Usuario de mail\n");
      out.write("                                            <small> Alejandro, Jairo, Denis y Javier  </small>\n");
      out.write("                                        </p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- Menu Footer-->\n");
      out.write("                                    <li class=\"user-footer\">\n");
      out.write("                                        <div class=\"pull-right\">\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <aside class=\"main-sidebar\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <ul class=\"sidebar-menu\">\n");
      out.write("                                <li class=\"header\">MAIN NAVIGATION</li>\n");
      out.write("                                <li class=\"active treeview\">\n");
      out.write("                                    <a href=\"inicio.jsp\">\n");
      out.write("                                        <i class=\"fa fa-dashboard\"></i> <span>Inicio</span>\n");
      out.write("                                        <span class=\"pull-right-container\">\n");
      out.write("                                        </span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                    </ul>\n");
      out.write("                </section>\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Enviar Correo\n");
      out.write("                        <small>Control panel</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"inicio.jsp\"><i class=\"fa fa-dashboard\"></i> Inicio</a></li>\n");
      out.write("                        <li class=\"active\">Enviar Correo</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div id=\"message_container\"></div>\n");
      out.write("                    <!-- Default box -->\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"box-header with-border\">\n");
      out.write("                                <h3 class=\"box-title\">Crear Correo Electronico</h3>\n");
      out.write("\n");
      out.write("                                <div class=\"box-tools pull-right\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\" data-toggle=\"tooltip\" title=\"Collapse\">\n");
      out.write("                                        <i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box-body\">\n");
      out.write("                                <form id=\"form_email\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                                        <textarea id=\"txt_email\" class=\"textarea\" placeholder=\"Place some text here\" style=\"width: 100%; height: 150px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;\"></textarea>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group col-md-12\">\n");
      out.write("                                        <label for=\"file_excel\">Archivo de excel</label>\n");
      out.write("                                        <input type=\"file\" id=\"file_excel\" accept=\".xlsx\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group col-md-12\">\n");
      out.write("                                        <label for=\"\">Asunto</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" id=\"txt_asunto\" >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group col-md-12\">\n");
      out.write("                                        <label for=\"\">Nombre de la columna para correos</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" id=\"txt_column\" >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-default\">Enviar Correo</button>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box-footer\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"box\">\n");
      out.write("                            <div class=\"box-header with-border\">\n");
      out.write("                                <h3 class=\"box-title\">Historial de Correos</h3>\n");
      out.write("\n");
      out.write("                                <div class=\"box-tools pull-right\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\" data-toggle=\"tooltip\" title=\"Collapse\">\n");
      out.write("                                        <i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"divCarga\" class=\"box-body\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.box-body -->\n");
      out.write("                            <div class=\"box-footer\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.box-footer-->\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <div class=\"pull-right hidden-xs\">\n");
      out.write("                    <b>Version</b> 2.3.8\n");
      out.write("                </div>\n");
      out.write("                <strong>Copyright &copy; 2014-2016 <a href=\"http://almsaeedstudio.com\">Almsaeed Studio</a>.</strong> All rights\n");
      out.write("                reserved.\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        <!-- jQuery 2.2.3 -->\n");
      out.write("        <script src=\"plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("        <!-- jQuery UI 1.11.4 -->\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("        <script>\n");
      out.write("            $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("        </script>\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"dist/js/app.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"app/app.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!--utilities-->\n");
      out.write("        <script src=\"plugins/eModal/dist/eModal.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--yet core scripts-->\n");
      out.write("        <script src=\"app/util/constants.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"app/app.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--page scripts-->\n");
      out.write("        <script src=\"app/views/inicio/inicio.js\" type=\"text/javascript\"></script>\n");
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
