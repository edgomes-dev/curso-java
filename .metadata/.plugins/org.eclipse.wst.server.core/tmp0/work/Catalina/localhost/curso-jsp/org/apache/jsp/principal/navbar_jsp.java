/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.23
 * Generated at: 2022-10-07 14:29:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.principal;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<nav class=\"navbar header-navbar pcoded-header\">\r\n");
      out.write("	<div class=\"navbar-wrapper\">\r\n");
      out.write("		<div class=\"navbar-logo\">\r\n");
      out.write("			<a class=\"mobile-menu waves-effect waves-light\" id=\"mobile-collapse\"\r\n");
      out.write("				href=\"#!\"> <i class=\"ti-menu\"></i>\r\n");
      out.write("			</a>\r\n");
      out.write("			<div class=\"mobile-search waves-effect waves-light\">\r\n");
      out.write("				<div class=\"header-search\">\r\n");
      out.write("					<div class=\"main-search morphsearch-search\">\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							<span class=\"input-group-addon search-close\"><i\r\n");
      out.write("								class=\"ti-close\"></i></span> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("								placeholder=\"Enter Keyword\"> <span\r\n");
      out.write("								class=\"input-group-addon search-btn\"><i class=\"ti-search\"></i></span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<a href=\"index.html\"> <img class=\"img-fluid\"\r\n");
      out.write("				src=\"");
      out.print( request.getContextPath() );
      out.write("/assets/images/logo.png\" alt=\"Theme-Logo\" />\r\n");
      out.write("			</a> <a class=\"mobile-options waves-effect waves-light\"> <i\r\n");
      out.write("				class=\"ti-more\"></i>\r\n");
      out.write("			</a>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"navbar-container container-fluid\">\r\n");
      out.write("			<ul class=\"nav-left\">\r\n");
      out.write("				<li>\r\n");
      out.write("					<div class=\"sidebar_toggle\">\r\n");
      out.write("						<a href=\"javascript:void(0)\"><i class=\"ti-menu\"></i></a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"header-search\">\r\n");
      out.write("					<div class=\"main-search morphsearch-search\">\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							<span class=\"input-group-addon search-close\"><i\r\n");
      out.write("								class=\"ti-close\"></i></span> <input type=\"text\" class=\"form-control\">\r\n");
      out.write("							<span class=\"input-group-addon search-btn\"><i\r\n");
      out.write("								class=\"ti-search\"></i></span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li><a href=\"#!\" onclick=\"javascript:toggleFullScreen()\"\r\n");
      out.write("					class=\"waves-effect waves-light\"> <i class=\"ti-fullscreen\"></i>\r\n");
      out.write("				</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"nav-right\">\r\n");
      out.write("				<li class=\"header-notification\"><a href=\"#!\"\r\n");
      out.write("					class=\"waves-effect waves-light\"> <i class=\"ti-bell\"></i> <span\r\n");
      out.write("						class=\"badge bg-c-red\"></span>\r\n");
      out.write("				</a>\r\n");
      out.write("					<ul class=\"show-notification\">\r\n");
      out.write("						<li>\r\n");
      out.write("							<h6>Notifications</h6> <label class=\"label label-danger\">New</label>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"waves-effect waves-light\">\r\n");
      out.write("							<div class=\"media\">\r\n");
      out.write("								<img class=\"d-flex align-self-center img-radius\"\r\n");
      out.write("									src=\"");
      out.print( request.getContextPath() );
      out.write("/assets/images/avatar-2.jpg\"\r\n");
      out.write("									alt=\"Generic placeholder image\">\r\n");
      out.write("								<div class=\"media-body\">\r\n");
      out.write("									<h5 class=\"notification-user\">");
      out.print( session.getAttribute("usuario") );
      out.write("</h5>\r\n");
      out.write("									<p class=\"notification-msg\">Lorem ipsum dolor sit amet,\r\n");
      out.write("										consectetuer elit.</p>\r\n");
      out.write("									<span class=\"notification-time\">30 minutes ago</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"waves-effect waves-light\">\r\n");
      out.write("							<div class=\"media\">\r\n");
      out.write("								<img class=\"d-flex align-self-center img-radius\"\r\n");
      out.write("									src=\"");
      out.print( request.getContextPath() );
      out.write("/assets/images/avatar-4.jpg\"\r\n");
      out.write("									alt=\"Generic placeholder image\">\r\n");
      out.write("								<div class=\"media-body\">\r\n");
      out.write("									<h5 class=\"notification-user\">Joseph William</h5>\r\n");
      out.write("									<p class=\"notification-msg\">Lorem ipsum dolor sit amet,\r\n");
      out.write("										consectetuer elit.</p>\r\n");
      out.write("									<span class=\"notification-time\">30 minutes ago</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"waves-effect waves-light\">\r\n");
      out.write("							<div class=\"media\">\r\n");
      out.write("								<img class=\"d-flex align-self-center img-radius\"\r\n");
      out.write("									src=\"");
      out.print( request.getContextPath() );
      out.write("/assets/images/avatar-3.jpg\"\r\n");
      out.write("									alt=\"Generic placeholder image\">\r\n");
      out.write("								<div class=\"media-body\">\r\n");
      out.write("									<h5 class=\"notification-user\">Sara Soudein</h5>\r\n");
      out.write("									<p class=\"notification-msg\">Lorem ipsum dolor sit amet,\r\n");
      out.write("										consectetuer elit.</p>\r\n");
      out.write("									<span class=\"notification-time\">30 minutes ago</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("				<li class=\"user-profile header-notification\"><a href=\"#!\"\r\n");
      out.write("					class=\"waves-effect waves-light\"> <img\r\n");
      out.write("						src=\"");
      out.print( request.getContextPath() );
      out.write("/assets/images/avatar-4.jpg\" class=\"img-radius\"\r\n");
      out.write("						alt=\"User-Profile-Image\"> <span>");
      out.print( session.getAttribute("usuario") );
      out.write("</span> <i\r\n");
      out.write("						class=\"ti-angle-down\"></i>\r\n");
      out.write("				</a>\r\n");
      out.write("					<ul class=\"show-notification profile-notification\">\r\n");
      out.write("						<li class=\"waves-effect waves-light\"><a href=\"#!\"> <i\r\n");
      out.write("								class=\"ti-settings\"></i> Settings\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"waves-effect waves-light\"><a\r\n");
      out.write("							href=\"user-profile.html\"> <i class=\"ti-user\"></i> Profile\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"waves-effect waves-light\"><a\r\n");
      out.write("							href=\"email-inbox.html\"> <i class=\"ti-email\"></i> My Messages\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"waves-effect waves-light\"><a\r\n");
      out.write("							href=\"auth-lock-screen.html\"> <i class=\"ti-lock\"></i> Lock\r\n");
      out.write("								Screen\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"waves-effect waves-light\"><a\r\n");
      out.write("							href=\"");
      out.print( request.getContextPath() );
      out.write("/ServletLogin?acao=logout\"> <i\r\n");
      out.write("								class=\"ti-layout-sidebar-left\"></i> Logout\r\n");
      out.write("						</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
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
