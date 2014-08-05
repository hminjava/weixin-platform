$(document).ready(function(){
	initWxmenuForm();
});

//设置微信菜单表单,验证+提交
function initWxmenuForm(){
	$('#wxmenu-form-modal .submit').click(function(){
		if($('#wxmenu-form-modal form').valid()){
			$('#wxmenu-form-modal form').ajaxSubmit({
				dataType: 'json',
				success: function(wxmenu){
					$('#wxmenu-form-modal').modal('close');
					if($('#id').val()){
						updateWxMenu(wxmenu);
					}else{
						appendWxMenu(wxmenu);
					}
				}
			});
		}
	});
	function updateWxMenu(wxmenu){
		
	}
	function appendWxMenu(wxmenu){
		
	}
}