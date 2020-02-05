<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<!-- 上传单个对象 注意表单的method属性设为post,enctype属性设为multipart/form-data -->
<form method="POST" action="SpringMVCDemo1/upload" enctype="multipart/form-data">
    <input type="file" name="file" /><br/><br/>
    <input type="submit" value="上传" />
</form>

<!-- 上传多个对象 注意表单的method属性设为post,enctype属性设为multipart/form-data -->
<form method="POST" action="SpringMVCDemo1/uploadMultiFiles" enctype="multipart/form-data">
    <p>文件1：<input type="file" name="file" /></p>
    <p>文件2：<input type="file" name="file" /></p>
    <p>文件3：<input type="file" name="file" /></p>
    <!-- 同时传递其他业务字段 -->
    <p>用户名：<input type="text" name="userName" /></p>
    <p>密码：<input type="password" name="password" /></p>
    <p><input type="submit" value="上传" /></p>
</form>
</body>
</html>