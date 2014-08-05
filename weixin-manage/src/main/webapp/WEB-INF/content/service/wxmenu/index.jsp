<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="/commons/resources.jsp"%>
	</head>
	<body>
		<%@ include file="/WEB-INF/content/common/page-head.jsp"%>
		<%@ include file="/WEB-INF/content/common/menu-top.jsp"%>
		<div class="page">
			<div class="page-container">
				<div class="container">
					<div class="row">
						<div class="span3">
							<jsp:include page="/WEB-INF/content/common/menu-service.jsp">
								<jsp:param value="wxmenu" name="current"/>
							</jsp:include>
						</div>
						<div class="span9">
							<div class="pull-right">
								<a class="btn" data-toggle="modal" href="add" data-target="#wxmenu-form-modal">添加菜单</a>
							</div>
							<h4 class="header">自定义菜单</h4>
							<div id="d3" style="width: 100%; margin-top: -30px"></div>
							<br/>
							<div class="row-fluid">
								<table class="table table-bordered" height="400">
									<col width="25%"/>
									<col width="75%"/>
									<thead>
										<tr>
											<th>菜单管理</th><th>动作设置</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td class="nopadding">
												<div id="menu-list" class="list-tree">
													<div class="level-1" data-level="1">
														<div data-id="1" class="list-tree-node" id="menu-node-1" data-parent="0">
															<a href="javascript:;"><span class="node-name">最新资讯</span></a>
															<div class="btns">
																<a href="javascript:;" class="add"><i class="icon-plus"></i></a>
																<a href="#" class="edit"><i class="icon-pencil"></i></a>
																<a href="#" class="del"><i class="icon-trash"></i></a>
															</div>
															<a href="#" class="move"><i class="icon-align-justify"></i></a>
														</div>
														<div class="level-2" data-level="2">
															<div data-id="2" class="list-tree-node" id="menu-node-2" data-parent="1">
																<a href="javascript:;"><span class="list-tree-placeholder"></span><span class="node-name">最新资讯</span></a>
																<div class="btns">
																	<a href="javascript:;" class="add"><i class="icon-plus"></i></a>
																	<a href="#" class="edit"><i class="icon-pencil"></i></a>
																	<a href="#" class="del"><i class="icon-trash"></i></a>
																</div>
																<a href="#" class="move"><i class="icon-align-justify"></i></a>
															</div>
														</div>
													</div>
												</div>
											</td>
											<td>
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="/WEB-INF/content/common/page-foot.jsp"%>
<div id="wxmenu-form-modal" class="modal hide fade" data-backdrop="static">
  <div class="modal-header">
    <button type="button" data-dismiss="modal" aria-hidden="true" class="close">&times;</button>
    <h3>自定义菜单编辑</h3>
  </div>
  <div class="modal-body"></div>
  <div class="modal-footer">
  	<a href="javascript:void(0);" data-dismiss="modal" class="btn">取消</a>
  	<a href="javascript:void(0);" class="btn btn-primary submit">保存</a>
  </div>
</div>
<script type="text/javascript" src="${staticServer}/manage/js/service/wxmenu/index.js"></script>
	</body>
</html>