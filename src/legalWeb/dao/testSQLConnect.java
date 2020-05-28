package legalWeb.dao;

import java.util.List;

import legalWeb.model.Employee;

public class testSQLConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EmployeeManage m = new EmployeeManage();
		 m.setup();
		 //System.out.println(m.GetEmployee());
		 List<Employee> emp = m.GetEmployees();
		 
	      for (Employee temp : emp) {
	            System.out.println(temp.getFirstName());
	        }
		 
		 
	}

}
