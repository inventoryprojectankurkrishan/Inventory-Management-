<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th {
	height: 50px;
}

button {
	background-color: #008CBA;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	border-radius: 12px;
}
</style>
</head>
<body style="text-align: center;">
	<s:form action="FetchRecords.action" method="POST">
		<button type="submit" name="fetchData" value="FetchRecords">Fetch
			Records</button>
	</s:form>
	<s:if test="fetchData=='FetchRecords'">
		<div style="margin-top: 40px; margin-right: 150px; margin-left: 150px;">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>CONTACT TYPE</th>
						<th>SALUTATION</th>
						<th>FIRST NAME</th>
						<th>MIDDLE NAME</th>
						<th>LAST NAME</th>
						<th>GENDER</th>
						<th>PHONE</th>
						<th>EMAIL ID</th>
						<th>BILLING ADDRESS</th>
						<th>SHIPPING ADDRESS</th>
					</tr>
				</thead>
				<s:iterator value="dataList">
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
			</table>
		</div>
	</s:if>
</body>
</html>