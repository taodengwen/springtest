<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
        String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<script>
	function validate(){
		/*var userName=document.getElementById("userName");*/
		
	}
</script>
<center>
	<form action="<%=path %>/servlet/user" method="post">
		<table>
			<tr><td>用户名</td><td><input name="userName" id="userName"/></td></tr>
			<tr><td>密码</td><td><input name="password" type="password" id="password"/></td></tr>
			<tr><td>邮箱</td><td><input name="email" id="email"/></td></tr> 
			<tr><td colspan="2"><center><input type="submit" value="submit" /></center></td></tr>
			<tr><td colspan="2"><center>${msg }</center></td></tr>
		</table>
	</form>
</center>
</body>
</html>