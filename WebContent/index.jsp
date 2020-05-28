<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
	<body>
		<h1>Struts2 Login Application</h1>
		<s:form action="verify">
		<s:textfield name="uname" label="Enter Username"/>
		<s:password name="pword" label="Enter Password"/>
		<s:submit value="Login" align="center"/>
		</s:form>
	</body>
</html>