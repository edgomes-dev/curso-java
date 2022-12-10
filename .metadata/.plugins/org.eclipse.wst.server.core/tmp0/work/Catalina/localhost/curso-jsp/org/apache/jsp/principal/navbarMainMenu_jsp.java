/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.23
 * Generated at: 2022-10-07 14:29:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.principal;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class navbarMainMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"pcoded-navbar\">\r\n");
      out.write("	<div class=\"sidebar_toggle\">\r\n");
      out.write("		<a href=\"#\"><i class=\"icon-close icons\"></i></a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"pcoded-inner-navbar main-menu\">\r\n");
      out.write("		<div class=\"\">\r\n");
      out.write("			<div class=\"main-menu-header\">\r\n");
      out.write("				<img class=\"img-80 img-radius\" src=\"");
      out.print( request.getContextPath() );
      out.write("/assets/images/avatar-4.jpg\"\r\n");
      out.write("					alt=\"User-Profile-Image\">\r\n");
      out.write("				<div class=\"user-details\">\r\n");
      out.write("					<span id=\"more-details\">");
      out.print( session.getAttribute("usuario") );
      out.write("<i class=\"fa fa-caret-down\"></i></span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"main-menu-content\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li class=\"more-details\"><a href=\"user-profile.html\"><i\r\n");
      out.write("							class=\"ti-user\"></i>View Profile</a> <a href=\"#!\"><i\r\n");
      out.write("							class=\"ti-settings\"></i>Settings</a> <a\r\n");
      out.write("						href=\"");
      out.print( request.getContextPath() );
      out.write("/ServletLogin?acao=logout\"><i\r\n");
      out.write("							class=\"ti-layout-sidebar-left\"></i>Logout</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"p-15 p-b-0\">\r\n");
      out.write("			<form class=\"form-material\">\r\n");
      out.write("				<div class=\"form-group form-primary\">\r\n");
      out.write("					<input type=\"text\" name=\"footer-email\" class=\"form-control\"\r\n");
      out.write("						required=\"\"> <span class=\"form-bar\"></span> <label\r\n");
      out.write("						class=\"float-label\"><i class=\"fa fa-search m-r-10\"></i>Search\r\n");
      out.write("						Friend</label>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"pcoded-navigation-label\"\r\n");
      out.write("			data-i18n=\"nav.category.navigation\">Layout</div>\r\n");
      out.write("		<ul class=\"pcoded-item pcoded-left-item\">\r\n");
      out.write("			<li class=\"active\"><a href=\"index.html\"\r\n");
      out.write("				class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("						class=\"ti-home\"></i><b>D</b></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("					data-i18n=\"nav.dash.main\">Dashboard</span> <span\r\n");
      out.write("					class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li class=\"pcoded-hasmenu\"><a href=\"javascript:void(0)\"\r\n");
      out.write("				class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("						class=\"ti-layout-grid2-alt\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("					data-i18n=\"nav.basic-components.main\">Components</span> <span\r\n");
      out.write("					class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a>\r\n");
      out.write("				<ul class=\"pcoded-submenu\">\r\n");
      out.write("					<li class=\" \"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/principal/usuario.jsp\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.alert\">Usuario</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"breadcrumb.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.breadcrumbs\">Breadcrumbs</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"button.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.alert\">Button</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"tabs.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.breadcrumbs\">Tabs</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"color.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.alert\">Color</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"label-badge.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.breadcrumbs\">Label Badge</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"tooltip.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.alert\">Tooltip</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"typography.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.breadcrumbs\">Typography</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"notification.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.alert\">Notification</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"icon-themify.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.breadcrumbs\">Themify</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("\r\n");
      out.write("				</ul></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<div class=\"pcoded-navigation-label\" data-i18n=\"nav.category.forms\">Forms\r\n");
      out.write("			&amp; Tables</div>\r\n");
      out.write("		<ul class=\"pcoded-item pcoded-left-item\">\r\n");
      out.write("			<li><a href=\"form-elements-component.html\"\r\n");
      out.write("				class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("						class=\"ti-layers\"></i><b>FC</b></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("					data-i18n=\"nav.form-components.main\">Form Components</span> <span\r\n");
      out.write("					class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a href=\"bs-basic-table.html\"\r\n");
      out.write("				class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("						class=\"ti-layers\"></i><b>FC</b></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("					data-i18n=\"nav.form-components.main\">Basic Table</span> <span\r\n");
      out.write("					class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"pcoded-navigation-label\" data-i18n=\"nav.category.forms\">Chart\r\n");
      out.write("			&amp; Maps</div>\r\n");
      out.write("		<ul class=\"pcoded-item pcoded-left-item\">\r\n");
      out.write("			<li><a href=\"chart.html\" class=\"waves-effect waves-dark\"> <span\r\n");
      out.write("					class=\"pcoded-micon\"><i class=\"ti-layers\"></i><b>FC</b></span> <span\r\n");
      out.write("					class=\"pcoded-mtext\" data-i18n=\"nav.form-components.main\">Chart</span>\r\n");
      out.write("					<span class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a href=\"map-google.html\" class=\"waves-effect waves-dark\">\r\n");
      out.write("					<span class=\"pcoded-micon\"><i class=\"ti-layers\"></i><b>FC</b></span>\r\n");
      out.write("					<span class=\"pcoded-mtext\" data-i18n=\"nav.form-components.main\">Maps</span>\r\n");
      out.write("					<span class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li class=\"pcoded-hasmenu\"><a href=\"javascript:void(0)\"\r\n");
      out.write("				class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("						class=\"ti-layout-grid2-alt\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("					data-i18n=\"nav.basic-components.main\">Pages</span> <span\r\n");
      out.write("					class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a>\r\n");
      out.write("				<ul class=\"pcoded-submenu\">\r\n");
      out.write("					<li class=\" \"><a href=\"auth-normal-sign-in.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.alert\">Login</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"auth-sign-up.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.breadcrumbs\">Register</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\" \"><a href=\"sample-page.html\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.basic-components.breadcrumbs\">Sample Page</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("				</ul></li>\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"pcoded-navigation-label\" data-i18n=\"nav.category.other\">Other</div>\r\n");
      out.write("		<ul class=\"pcoded-item pcoded-left-item\">\r\n");
      out.write("			<li class=\"pcoded-hasmenu \"><a href=\"javascript:void(0)\"\r\n");
      out.write("				class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("						class=\"ti-direction-alt\"></i><b>M</b></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("					data-i18n=\"nav.menu-levels.main\">Menu Levels</span> <span\r\n");
      out.write("					class=\"pcoded-mcaret\"></span>\r\n");
      out.write("			</a>\r\n");
      out.write("				<ul class=\"pcoded-submenu\">\r\n");
      out.write("					<li class=\"\"><a href=\"javascript:void(0)\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.menu-levels.menu-level-21\">Menu Level 2.1</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"pcoded-hasmenu \"><a href=\"javascript:void(0)\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-direction-alt\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.menu-levels.menu-level-22.main\">Menu Level\r\n");
      out.write("								2.2</span> <span class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a>\r\n");
      out.write("						<ul class=\"pcoded-submenu\">\r\n");
      out.write("							<li class=\"\"><a href=\"javascript:void(0)\"\r\n");
      out.write("								class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("										class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("									data-i18n=\"nav.menu-levels.menu-level-22.menu-level-31\">Menu\r\n");
      out.write("										Level 3.1</span> <span class=\"pcoded-mcaret\"></span>\r\n");
      out.write("							</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li class=\"\"><a href=\"javascript:void(0)\"\r\n");
      out.write("						class=\"waves-effect waves-dark\"> <span class=\"pcoded-micon\"><i\r\n");
      out.write("								class=\"ti-angle-right\"></i></span> <span class=\"pcoded-mtext\"\r\n");
      out.write("							data-i18n=\"nav.menu-levels.menu-level-23\">Menu Level 2.3</span> <span\r\n");
      out.write("							class=\"pcoded-mcaret\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("\r\n");
      out.write("				</ul></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
