/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-04-25 17:48:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.magazine;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class side2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/lyj/finally_workSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/finalpro/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1708193184989L));
    _jspx_dependants.put("jar:file:/C:/Users/lyj/finally_workSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/finalpro/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/lyj/finally_workSpace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/finalpro/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");

request.setCharacterEncoding("utf-8");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".name-container {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".kor-reply-container {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center; /* Align kor and replyCnt vertically */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 사이드 바 숨김/나타내기 -->\r\n");
      out.write("<script>\r\n");
      out.write("	document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("		var btn = document.querySelector('.btn_show');\r\n");
      out.write("		var sidebar = document.querySelector('.sidebar');\r\n");
      out.write("\r\n");
      out.write("		btn.addEventListener('click', function() {\r\n");
      out.write("\r\n");
      out.write("			if (sidebar.style.display === 'none'\r\n");
      out.write("					|| sidebar.style.display === '') {\r\n");
      out.write("				sidebar.style.display = 'block';\r\n");
      out.write("			} else {\r\n");
      out.write("				sidebar.style.display = 'none';\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/chart.js@2.8.0\"></script>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	window.onload = function() {\r\n");
      out.write("		// 사용자가 텍스트를 입력할 때마다 listBrand 함수 호출\r\n");
      out.write("		\r\n");
      out.write("		listBrand('');\r\n");
      out.write("		\r\n");
      out.write("		document.getElementById('brandInput').addEventListener('keyup',\r\n");
      out.write("				function() {\r\n");
      out.write("					listBrand(this.value); // 입력된 값으로 listBrand 함수 호출\r\n");
      out.write("				});\r\n");
      out.write("	};\r\n");
      out.write("\r\n");
      out.write("	function listBrand(alphabet) {\r\n");
      out.write("		var currentURL = window.location.href;\r\n");
      out.write("		var extractedString = currentURL.match(/\\/([^\\/.]+)\\./)[1];\r\n");
      out.write("\r\n");
      out.write("		let dataToSend = {\r\n");
      out.write("			firstLetter : alphabet,\r\n");
      out.write("			kindOfMagazine : extractedString\r\n");
      out.write("		};\r\n");
      out.write("\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url : \"/finalpro/magazine/listBrand.do\",\r\n");
      out.write("			method : 'POST',\r\n");
      out.write("			contentType : 'application/json',\r\n");
      out.write("			data : JSON.stringify(dataToSend),\r\n");
      out.write("			success: function(data) {\r\n");
      out.write("		        var brandList = data.brandList.slice(0, 20);\r\n");
      out.write("		        var filteredBrandList = brandList.filter(function(brand) {\r\n");
      out.write("		            // Filter brands by user input in both English and Korean brand names\r\n");
      out.write("		            return brand.brandEng.toLowerCase().includes(alphabet.toLowerCase()) || \r\n");
      out.write("		                   brand.brand.toLowerCase().includes(alphabet.toLowerCase());\r\n");
      out.write("		        });\r\n");
      out.write("\r\n");
      out.write("				var brandListUl = document.getElementById('brandlistslide');\r\n");
      out.write("				brandListUl.innerHTML = ''; // 리스트 초기화\r\n");
      out.write("				console.log(brandListUl);\r\n");
      out.write("\r\n");
      out.write("				// 필터링된 목록으로 UI 업데이트\r\n");
      out.write("				filteredBrandList.forEach(function(brand) {\r\n");
      out.write("				    var listItem = document.createElement('li');\r\n");
      out.write("				    listItem.className = 'listItem';\r\n");
      out.write("\r\n");
      out.write("				    var brandLink = document.createElement('a');\r\n");
      out.write("				    brandLink.href = \"/finalpro/magazine/pictorialList.do?brand=\" + brand.brand;\r\n");
      out.write("				    brandLink.className = 'command-brand-link';\r\n");
      out.write("\r\n");
      out.write("				    var titleSpan = document.createElement('span');\r\n");
      out.write("				    titleSpan.className = 'title';\r\n");
      out.write("\r\n");
      out.write("				    var nameContainerDiv = document.createElement('div');\r\n");
      out.write("				    nameContainerDiv.className = 'name-container';\r\n");
      out.write("\r\n");
      out.write("				    var engSpan = document.createElement('span');\r\n");
      out.write("				    engSpan.className = 'eng';\r\n");
      out.write("				    engSpan.textContent = brand.brandEng;\r\n");
      out.write("\r\n");
      out.write("				    var korReplyContainer = document.createElement('div');\r\n");
      out.write("				    korReplyContainer.className = 'kor-reply-container';\r\n");
      out.write("\r\n");
      out.write("				    var korSpan = document.createElement('span');\r\n");
      out.write("				    korSpan.className = 'kor';\r\n");
      out.write("				    korSpan.textContent = brand.brand;\r\n");
      out.write("\r\n");
      out.write("				    var replyCntSpan = document.createElement('span');\r\n");
      out.write("				    replyCntSpan.className = 'replyCnt parentheses';\r\n");
      out.write("				    replyCntSpan.textContent = '(' + brand.magazineCount + ')';\r\n");
      out.write("				    \r\n");
      out.write("				    \r\n");
      out.write("				    korReplyContainer.appendChild(korSpan);\r\n");
      out.write("				    korReplyContainer.appendChild(replyCntSpan);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				    nameContainerDiv.appendChild(engSpan);\r\n");
      out.write("				    nameContainerDiv.appendChild(korReplyContainer);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				    titleSpan.appendChild(nameContainerDiv);\r\n");
      out.write("				    brandLink.appendChild(titleSpan);\r\n");
      out.write("				    listItem.appendChild(brandLink);\r\n");
      out.write("				    brandListUl.appendChild(listItem);\r\n");
      out.write("				});\r\n");
      out.write("			},\r\n");
      out.write("			error : function(error) {\r\n");
      out.write("				console.error('Error:', error);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<h2></h2>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"sidebar\">\r\n");
      out.write("		<div class=\"searchTab tabBox\" br-data-name=\"magazine_left_tab\">\r\n");
      out.write("			<ul class=\"brand-option-list list\">\r\n");
      out.write("				<li class=\"listItem\"><label class=\"spell\">브랜드명 입력 <input\r\n");
      out.write("						type=\"text\" class=\"ui-brand-kwd\" id=\"brandInput\">\r\n");
      out.write("				</label>\r\n");
      out.write("					<ul class=\"letter-list\">\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyA\" ktype=\"A\">A</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyB\" ktype=\"B\">B</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyC\" ktype=\"C\">C</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyD\" ktype=\"D\">D</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyE\" ktype=\"E\">E</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyF\" ktype=\"F\">F</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyG\" ktype=\"G\">G</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyH\" ktype=\"H\">H</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyI\" ktype=\"I\">I</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyJ\" ktype=\"J\">J</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyK\" ktype=\"K\">K</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyL\" ktype=\"L\">L</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyM\" ktype=\"M\">M</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyN\" ktype=\"N\">N</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyO\" ktype=\"O\">O</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyP\" ktype=\"P\">P</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyQ\" ktype=\"Q\">Q</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyR\" ktype=\"R\">R</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyS\" ktype=\"S\">S</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyT\" ktype=\"T\">T</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyU\" ktype=\"U\">U</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyV\" ktype=\"V\">V</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyW\" ktype=\"W\">W</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyX\" ktype=\"X\">X</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyY\" ktype=\"Y\">Y</li>\r\n");
      out.write("						<li class=\"listItem btn ui-brand-btn tyZ\" ktype=\"Z\">Z</li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("				<li class=\"listItem\">\r\n");
      out.write("					<ul class=\"brand-list list area-list-brand\" id=\"brandlistslide\">\r\n");
      out.write("					</ul>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<button type=\"button\" class=\"btn_show\">\r\n");
      out.write("		<svg width=\"30\" height=\"30\" viewBox=\"0 0 30 30 file=\"\r\n");
      out.write("			none\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("					<path fill-rule=\"evenodd\" clip-rule=\"evenodd\"\r\n");
      out.write("				d=\"M5 9.5H25V8.5H5V9.5ZM25 15.5H5V14.5H25V15.5ZM25 21.5H5V20.5H25V21.5Z\"\r\n");
      out.write("				fill=\"black\"></path>	 \r\n");
      out.write("				</svg>\r\n");
      out.write("	</button>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	let letterListItems = document.querySelectorAll('.letter-list > li'); // CSS 선택자 수정\r\n");
      out.write("\r\n");
      out.write("	letterListItems.forEach(function(item) {\r\n");
      out.write("		item.addEventListener('click', function(event) {\r\n");
      out.write("			var alphabet = event.target.getAttribute('ktype'); // 커스텀 데이터 속성 사용 권장\r\n");
      out.write("			listBrand(alphabet);\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/magazine/side2.jsp(41,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/magazine/side2.jsp(41,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/magazine/side2.jsp(41,0) '#{pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"#{pageContext.request.contextPath }",java.lang.Object.class)));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
