package legalWeb.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import legalWeb.model.Employee; 
public class EmployeeManage{
	
	  protected SessionFactory sessionFactory;
	    protected void setup() {
	        // code to load Hibernate Session factory
	    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() .build();
	    	// configures settings from hibernate.cfg.xml
	    	try {
	    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	    	} catch (Exception ex) {
	    	    StandardServiceRegistryBuilder.destroy(registry);
	    	}
	    }

	    protected void exit() {
	        // code to close Hibernate Session factory
	    }
	 
	    
	    protected List<Employee> GetEmployees()
	    {	
	 		List<Employee> emps = new ArrayList<Employee>();        
		    	Session session = sessionFactory.openSession();
		 		session.beginTransaction();
		 		emps = session.createQuery("FROM Employee").list();
	        return emps;
	    }
	    
	    
	    protected void CreateEmployee() {
	    	//create/add new employee
	    	Employee mp = new Employee();
	    	//mp.setId(555);
	        mp.setFirstName("holly");
	        mp.setLastName("flaxx");
	        mp.setMiddleName("F");
	        mp.setPosition("HR");
	       mp.setBirthDt(Date.valueOf("1989-12-12"));
	       mp.setDtHired(Date.valueOf("1989-12-12"));
	        mp.setGender("Female");
	        mp.setMaritalStatus("Single");
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	        session.save(mp);
	        session.getTransaction().commit();
	        session.close();
	       
	    }
	 
	    public String GetEmployee() {
	        // code to get a Employee
	    	System.out.println("Am here!");
	    	this.setup();
	    	Session session = sessionFactory.openSession();
	 		session.beginTransaction();
	    	    long id = 4444;
	    	    Employee emp = session.get(Employee.class, id);
	    	    /*System.out.println("id: " + emp.getId());
	    	    System.out.println("Firtname: " + emp.getFirstName());
	    	    System.out.println("Lastname: " + emp.getLastName());
				System.out.println("is there a name? " + emp.getFirstName() + emp.getLastName());
				*/
	    	    session.close();
	    	    return  emp.getFirstName() + emp.getLastName();
	    	
	    }
	 
	    protected void UpdateEmployee() {
	        // code to modify a book
	    }
	 
	    protected void DeleteEmployee() {
	        // code to remove a book
	    }
	

}
