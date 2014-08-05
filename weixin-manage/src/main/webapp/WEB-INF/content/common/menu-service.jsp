<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<ul class="nav nav-list left-menu">
	<li<c:if test="${param.current eq 'wxmenu'}"> class="active"</c:if>><a href="${ctx}/service/wxmenu/index"><i class="icon-chevron-right"></i>自定义菜单</a></li>
	<li><a href="javascript:;"><i class="icon-chevron-right"></i>自定义菜单</a></li>
	<li><a href="javascript:;"><i class="icon-chevron-right"></i>自定义菜单</a></li>
	<li><a href="javascript:;"><i class="icon-chevron-right"></i>自定义菜单</a></li>
</ul>