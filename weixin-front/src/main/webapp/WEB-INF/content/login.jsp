<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
  <head>
    <title>Login Page</title>
	<%@ include file="/commons/taglibs.jsp"%>
	<%@ include file="/commons/resources.jsp"%>
  </head>
  
  <body>
    <div class="navbar navbar-static-top front-navbar-top" role="banner">
    	<div class="container">
    		<div class="navbar-header">
    			
    		</div>
    		<div class="collapse navbar-collapse" role="navigation">
    			<ul class="nav navbar-nav">
    				<li><a href="#">菜单链接</a></li>
    				<li><a href="#">菜单链接</a></li>
    				<li><a href="#">菜单链接</a></li>
    				<li><a href="#">菜单链接</a></li>
    			</ul>
    			<ul class="nav navbar-nav navbar-right">
    				<li class="active"><a href="#">登录</a></li>
    				<li><a href="#">注册</a></li>
    			</ul>
    		</div>
    	</div>
    </div>
    <div id="login-bg-slide" class="carousel slide" data-ride="carousel">
    	<ol class="carousel-indicators">
    		<li data-target="#login-bg-slide" data-slide-to="0" class="active"></li>
    		<li data-target="#login-bg-slide" data-slide-to="1"></li>
    		<li data-target="#login-bg-slide" data-slide-to="2"></li>
    	</ol>
    	<div class="carousel-inner" role="listbox">
    		<div class="item active">
    			<div class="slide-bg"><img src="https://res.wx.qq.com/mpres/htmledition/images/bg/bg_login_banner_v51e5b3a.jpg"/></div>
    			<div class="carousel-caption">
    				<h3>第一张</h3>
    				<p>第一张啊第一张啊第一张</p>
    			</div>
    		</div>
    		<div class="item">
    			<div class="slide-bg"><img src="https://res.wx.qq.com/mpres/htmledition/images/bg/bg_login_banner_v51e5b3a.jpg"/></div>
    			<div class="carousel-caption">
    				<h3>第二张</h3>
    				<p>第二张啊第二张啊第二张</p>
    			</div>
    		</div>
    		<div class="item">
    			<div class="slide-bg"><img src="https://res.wx.qq.com/mpres/htmledition/images/bg/bg_login_banner_v51e5b3a.jpg"/></div>
    			<div class="carousel-caption">
    				<h3>第三张</h3>
    				<p>第三张啊第三张啊第三张</p>
    			</div>
    		</div>
    	</div>
    	<div class="login-container">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-5 col-md-offset-7">
    				<div class="login-panel">
    					<h3>登录</h3>
    					<form role="form">
    						<div class="form-group">
    							<input type="text" class="form-control input-lg username" placeholder="邮箱/微信号/QQ号"/>
    							<input type="text" class="form-control input-lg password" placeholder="密码"/>
    						</div>
    						<div class="login-help">
    							<div class="pull-left">
    								<div class="checkbox"><label><input type="checkbox"/>记住密码</label></div>
    							</div>
    							<div class="pull-right">
    								<a class="login-forget-pwd" href="/cgi-bin/readtemplate?t=home/find_pwd_tmpl&amp;lang=zh_CN">无法登录？</a>
    							</div>
    						</div>
    						<div class="form-group">
    							<button type="button" class="login-btn btn btn-success">登    录</button>
    						</div>
    					</form>
    				</div>
    			</div>
    		</div>
    	</div>
    	</div>
    </div>
  </body>
  <script type="text/javascript">
  $(document).ready(function(){
	  $('.carousel').carousel();
  });
  </script>
</html>
