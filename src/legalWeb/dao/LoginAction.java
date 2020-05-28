package legalWeb.dao;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import legalWeb.dao.EmployeeManage;
import legalWeb.model.Employee;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	public String uname,pword,theName;
	public List<Employee> emps = null;

	public String getUname() {
		return uname;
	}

	public void setname(String username) {
		this.uname = username;
	}

	public String getPword() {
		return pword;
	}

	public void setPd(String password) {
		this.pword = password;
	}

	public String execute() {
		if (uname.equals("admin") && pword.equals("admin")){
			 EmployeeManage m = new EmployeeManage();
			 m.setup();
			 emps = m.GetEmployees();

			return "SUCCESS";		
		} else if (uname.equals("user") && pword.equals("user")){
			return "USER";
		}else {
			return "ERROR";
		}
	}
}

