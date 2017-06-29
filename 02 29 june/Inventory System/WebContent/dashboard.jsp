<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome to DashBoard</h1>

	Hello 
		<s:iterator value="list">
						<s:property value="userid" />
						<s:property value="password" />
						<s:property value="salutation" />
						<s:property value="firstname" />
						<s:property value="middlename" />
						<s:property value="lastname" />
						<s:property value="dateofbirth" />
						<s:property value="gender" />
						<s:property value="phone" />
						<s:property value="emailid" />
						<s:property value="address" />		
						
				<s:iterator value="roleDTO">
					<tr>
						<td><s:property value="name" /></td>
						<td><s:property value="descr" /></td>
						<s:iterator value="groupMap">
							<tr>
								<td><s:property value="contact_type" /></td>
								<td><s:property value="salutation" /></td>
								<td><s:property value="firstname" /></td>
								<td><s:property value="middlename" /></td>
								<td><s:property value="lastname" /></td>
								<td><s:property value="gender" /></td>
								<td><s:property value="phone" /></td>
								<td><s:property value="emailid" /></td>
								<td><s:property value="billing_address" /></td>
								<td><s:property value="shipping_address" /></td>
					</tr>
				</s:iterator>
					</tr>
				</s:iterator>		
			
						
		</s:iterator>	
					
					
					
					
	
</body>
</html>