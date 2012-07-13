<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
        String path = request.getContextPath();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv= "Refresh" content= "5;url=<%=path %>/jsp/login/login.jsp ">
	</head>
<body>
<script>
var time = 5;
function clock(){
	var value = document.getElementById("lastTime");
}
window.setInterval("clock()", 1000);
</script>

		<table>
			<tr><td colspan="2"><center>恭喜你，${userInfo.userName } 登录成功!<div id="lastTime">5</div>秒钟后跳转...</center></td></tr>
		</table>
		
</body>
</html>