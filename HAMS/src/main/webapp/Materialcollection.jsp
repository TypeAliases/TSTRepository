<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <div class="Materialcollection">
	<div class="title" align="center">
		<h2>用文字记录你出行的点滴</h2>
	</div>


	<div class="row clearfix">

		<div class="col-md-12 column">
			<form class="form-horizontal" role="form">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-1 control-label">文章标题</label>
					<div class="col-sm-11">
						<input type="email" class="form-control" id="inputEmail3" /> 
					</div>
				</div>
				
			</form>
		</div>
		
		<div class="row clearfix">
			<div class="col-md-12 column "
				style="min-height: 500px; padding: 10px 30px;">
				<div class="col-md-12 column wang">222</div>
			</div>
		</div>

		<button class="btn btn-info" style="float: right;" onclick="">发布</button>
	</div>
</div>

<script type="text/javascript">
	var E = window.wangEditor

	var editor = new E('.wang')
	editor.customConfig.menus = [ 'head', // 标题
	'bold', // 粗体
	'fontSize', // 字号
	'fontName', // 字体
	'justify', // 对齐方式
	'image', // 插入图片
	'undo', // 撤销
	'redo' // 重复
	]
	
	 <script type="text/javascript">
      var E = window.wangEditor;
      var editor = new E('.wang');
      //editor.create();
      // 自定义菜单配置
      editor.customConfig.menus = [
          'head',  // 标题
          'bold',  // 粗体
          'fontSize',  // 字号
          'fontName',  // 字体
          'italic',  // 斜体
          'underline',  // 下划线
          'strikeThrough',  // 删除线
          'foreColor',  // 文字颜色
          'backColor',  // 背景颜色
          'link',  // 插入链接
          'list',  // 列表
          'justify',  // 对齐方式
          'quote',  // 引用
          'emoticon',  // 表情
          'image',  // 插入图片
          'table',  // 表格
          'video',  // 插入视频
          'code',  // 插入代码
          'undo',  // 撤销
          'redo'  // 重复
      ];
	
	
	
	
	
	editor.customConfig.fontNames = [ 'Verdana' ]
	editor.create()
	var muenid = editor.toolbarElemId;
	document.getElementById(muenid).style.background = "#5bc0de";
	$('.w-e-toolbar .w-e-menu i').css({
		"color" : "white"
	});
	$('.w-e-text-container').css({
		"height" : "480px"
	});

	console.log(muenid);
</script> -->






 
 
 
 
<body class="gray-bg">
     <div> 
     <span class="col-lg-8" id="editor"></span>
     </div>
     <div>
     <button id="btn2">获取text</button>
        </div>
     <script type="text/javascript">
      var E = window.wangEditor;
      var editor = new E('#editor');
      //editor.create();
      // 自定义菜单配置
      editor.customConfig.menus = [
          'head',  // 标题
          'bold',  // 粗体
          'fontSize',  // 字号
          'fontName',  // 字体
          'italic',  // 斜体
          'underline',  // 下划线
          'strikeThrough',  // 删除线
          'foreColor',  // 文字颜色
          'backColor',  // 背景颜色
          'link',  // 插入链接
          'list',  // 列表
          'justify',  // 对齐方式
          'quote',  // 引用
          'emoticon',  // 表情
          'image',  // 插入图片
          'table',  // 表格
          'video',  // 插入视频
          'code',  // 插入代码
          'undo',  // 撤销
          'redo'  // 重复
      ];
 
      //editor.customConfig.uploadImgServer = '/admin.php/Upload/wang_editor';  // 上传图片到服务器
      //editor.customConfig.uploadImgServer = '/upload';
      editor.customConfig.uploadImgShowBase64 = true;   // 使用 base64 保存图片
      // 3M
      editor.customConfig.uploadImgMaxSize = 3 * 1024 * 1024;
      // 限制一次最多上传 5 张图片
      editor.customConfig.uploadImgMaxLength = 1;
      // 自定义文件名
      editor.customConfig.uploadFileName = 'editor_img';
      // 将 timeout 时间改为 3s
      editor.customConfig.uploadImgTimeout = 5000;
        
      editor.create();
      editor.customConfig.uploadImgHooks = {
          before: function (xhr, editor, files) {
              // 图片上传之前触发
              // xhr 是 XMLHttpRequst 对象，editor 是编辑器对象，files 是选择的图片文件
 
              // 如果返回的结果是 {prevent: true, msg: 'xxxx'} 则表示用户放弃上传
              // return {
              //     prevent: true,
              //     msg: '放弃上传'
              // }
              // alert("前奏");
          },
          success: function (xhr, editor, result) {
              // 图片上传并返回结果，图片插入成功之后触发
              // xhr 是 XMLHttpRequst 对象，editor 是编辑器对象，result 是服务器端返回的结果
              // var url = result.data.url;
              // alert(JSON.stringify(url));
              // editor.txt.append(url);
              // alert("成功");
          },
          fail: function (xhr, editor, result) {
              // 图片上传并返回结果，但图片插入错误时触发
              // xhr 是 XMLHttpRequst 对象，editor 是编辑器对象，result 是服务器端返回的结果
              alert("失败");
          },
          error: function (xhr, editor) {
              // 图片上传出错时触发
              // xhr 是 XMLHttpRequst 对象，editor 是编辑器对象
              // alert("错误");
          },
          // 如果服务器端返回的不是 {errno:0, data: [...]} 这种格式，可使用该配置
          // （但是，服务器端返回的必须是一个 JSON 格式字符串！！！否则会报错）
          customInsert: function (insertImg, result, editor) {
              // 图片上传并返回结果，自定义插入图片的事件（而不是编辑器自动插入图片！！！）
              // insertImg 是插入图片的函数，editor 是编辑器对象，result 是服务器端返回的结果
              // 举例：假如上传图片成功后，服务器端返回的是 {url:'....'} 这种格式，即可这样插入图片：
              var url = result.data[0];
              insertImg(url);
              // result 必须是一个 JSON 格式字符串！！！否则报错
          }
      }
 
      
      //获取文本输入的内容
      document.getElementById('btn2').addEventListener('click', function () {
            editor.txt.html(content);
            var content = editor.txt.html();
            console.log(content);
            // 读取 text
              var announcement_mag = editor.txt.text();
              alert("保存成功")     
            $.ajax({
            url : "http://localhost:8099/HAMS/inserAnnouncements?announcement_mag="+announcement_mag,
            type : "post",
            dataType : "json",
            success : function(data) {
                alert(data.result);
                
            },
            /*  error : function(msg) {
                    alert("ajax连接异常：" + msg);
                } */
        });
           
      }, false)
      
      </script>

 --%>
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title></title>
    <script src="${pageContext.request.contextPath}/js/wangEditor.min.js"></script>
    <script src="${pageContext.request.contextPath}/jquery/jquery.min.js"></script>


</head>
<body>

<div class="Materialcollection">
<div class="title" align="center">
		<h2>用文字记录你出行的点滴</h2>
	</div>
<form method="post" action="##" id="form1">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-1 control-label">文章标题</label>
					<div class="col-sm-11">
						<input type="text" name="title" class="form-control" id="inputEmail3" value="请输入文章标题" defaultvalue="请输入文章标题" /> 
					</div>
				</div>
				<br>
				<hr>
    <div>
        <%--文本编辑框--%>
        <div id="intro" class="TextContent"></div>
        <textarea style="display: none" name="mytxtIntro" id="txtIntro" ></textarea>
        <%--提交按钮--%>
        <input id="btn2" class="btn btn-primary" type="submit" value="确认提交" onclick="display_alert()">
    </div>
</form>
</div>
</body>


<%--文本编辑器插件js--%>
<script type="text/javascript">

    var E = window.wangEditor;
    var editor = new E('#intro');

    //    获取隐藏控件<textarea>的id，用于显示内容，也方便后台获取内容
    var $text1 = $('#txtIntro');
	
    // 监控wangEditor中的内容变化，并将html内容同步更新到 textarea
    editor.customConfig.onchange = function (html) {
        $text1.val(html);
    }
   
  
    //    设置上传本地图片到服务器
    editor.customConfig.uploadImgServer = '/upload';
    editor.create();
    $text1.val(editor.txt.html());// 初始化 textarea 的值

    editor.customConfig.fontNames = [ 'Verdana' ]
	var muenid = editor.toolbarElemId;
	
    document.getElementById(muenid).style.background = "#5bc0de";
	$('.w-e-toolbar .w-e-menu i').css({
		"color" : "white"
	});
	$('.w-e-text-container').css({
		"height" : "480px"
	});

	console.log(muenid);
	/* function toCollection(){
		$('.container').load('Materialcollection.jsp');

	} */
	function display_alert()
	  {
		 $.ajax({
			 type:"POST",
			 url:"insertCollections",
			 data: $('#form1').serialize(),
		     success: function (result) {
		         console.log(result);//打印服务端返回的数据(调试用)
		         if (result.resultCode == 200) {
		             alert("SUCCESS");
		         }
		         ;
		     },
		     error : function() {
		         alert("异常！");
		     }
		 });
	  }
	 
	 
	         //jQuery的页面加载完成时触发的事件
	 $(document).ready(function(){
         
         $("input[type='text']").on("blur focus",function(){
             var defaultvalue = $(this).attr("defaultvalue");
             
             //判断是否获取焦点
             if($(this).is(":focus")){
                 //把输入框里面的文字颜色变为黑色
                 $(this).css("color", "#000");
                 //如果之前的内容是默认值，那么清空
                 if($(this).val() == defaultvalue){
                     $(this).val("");
                 }
             }else{//失去焦点
                 //判断内容是空的或默认值
                 if($(this).val() == "" || $(this).val() == defaultvalue){
                     alert("文章标题不能为空！！！！")
                     //设置为默认值
                     $(this).val(defaultvalue);
                     //文字颜色设置为灰色
                     $(this).css("color", "#999"); 
                 }else{
                     //文字设置为黑色
                     $(this).css("color", "#000");
                 }
             }
         });
     });
</script>
	     <!--  <input type="text" id="button1" value="请输入账号" defaultvalue="请输入账号" style="color:#999"/>
	     <input type="text" id="button2" value="请输入手机号" defaultvalue="请输入手机号" style="color:#999"/>  -->
    