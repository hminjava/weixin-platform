$(document).ready(function(){
	initWxmenuForm();
});

//����΢�Ų˵���,��֤+�ύ
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