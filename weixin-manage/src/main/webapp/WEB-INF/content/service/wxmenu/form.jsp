<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
	<form class="form-horizontal form-condensed" method="post" action="form/save.htm">
      <div class="control-group">
        <label for="menuName" class="control-label">菜单名称 </label>
        <div class="controls">
          <input id="menuName" name="menuName" type="text" placeholder="菜单名称"/>
          <input type="hidden" name="parentId" value="0" id="parentId"/>
          <input type="hidden" name="id" id="id"/>
        </div>
      </div>
      <div class="control-group">
      	<label for="menuUrl" class="control-label">链接地址</label>
      	<div class="controls">
      		<input type="text" id="menuUrl" name="menuUrl" type="text" placeholder="http://"/>
      	</div>
      </div>
	</form>
	<script type="text/javascript">
	$('#wxmenu-form-modal form').validate({
		rules: {
			menuName: {
				required: true
			}
		},
		messages: {
			menuName: {
				required: '菜单名称必填'
			}
		}
	});
	</script>