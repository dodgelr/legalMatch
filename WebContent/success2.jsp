<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Reports</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
	<h2>The Office Employees</h2>
	<div style="margin-top: 40px;">
		<s:if test="noData!=true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>First name</th>
						<th>Last name</th>
						<th>Birthday</th>
						<th>Gender</th>
						<th>Marital Status</th>
						<th>Position</th>
						<th>Date Hired</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="emps">
					<tr>
						<td><s:property value="firstName"/></td>
						<td><s:property value="lastName"/></td>											
						<td><s:property value="birthDt" /></td>
						<td><s:property value="gender" /></td>
						<td><s:property value="maritalStatus"/></td>
						<td><s:property value="position" /></td>
						<td><s:property value="dtHired" /></td>
						<td>
							<button class="button-update">Update</button>
							<button class="button-delete">Delete</button>
						<!--  <a href="updatedetails.action?submitType=updatedata&uemail=<s:property value="uemail"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?uemail=<s:property value="uemail"/>">
								<button class="button-delete">Delete</button>
							</a>-->	
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
	</div>
</body>
</html>