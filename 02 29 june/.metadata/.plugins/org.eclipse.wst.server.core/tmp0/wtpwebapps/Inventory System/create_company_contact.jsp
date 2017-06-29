<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create new Company Customer contact</title>

Create new Company Customer contact
</head>
	<body>
		<s:form action="create_company_customer_contact" method="post" theme="simple">
		<br>
		<%-- <s:radio name="contact_type" label="Type of Contact "
											list="{'Customer','Vendor'}" theme="xhtml"/>
			 --%>
			<br>
			<s:textfield name="company_name" label="Customer Company Name" placeholder="Enter Company name here"
					theme="xhtml" />
			
			<s:div>
				<s:textfield name="company_phone" placeholder="Enter your company office phone number"
					label="Company Phone No." theme="xhtml" />	
					<br>
				<s:textfield name="company_fax" placeholder="Enter your company office Fax number"
					label="Company Fax No." theme="xhtml" />		
			</s:div>
			<s:div>
				<s:textfield name="company_emailid" label="Company E-Mail Id " type="email"
					theme="xhtml" />
			</s:div>
			<s:div>
				<s:textfield name="company_billing_address" label="Company Billing Address" type="address"
					theme="xhtml" />
			</s:div>
			<s:div>
				<s:textfield name="company_shipping_address" label="Company Shipping Address " type="address"
					theme="xhtml" />
			</s:div>
			<br>
			
			<s:reset />
			<s:submit value="Create Contact" />
	
	
	</s:form>
	
</body>
</html>