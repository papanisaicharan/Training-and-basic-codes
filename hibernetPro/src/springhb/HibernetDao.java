package springhb;

import java.util.List;  

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class HibernetDao extends HibernateDaoSupport {
	public void addEmployee(Employee2 e) {
		getHibernateTemplate().save(e);
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee2> getEmployees(){
		List<Employee2> empls = (List<Employee2>) getHibernateTemplate().find("from Employee2");
		return empls;
	}
	
	//method to return one employee of given id  
	public Employee2 getById(int id){  
	    Employee2 e=(Employee2)getHibernateTemplate().get(Employee2.class,id);  
	    return e;  
	}  
	
	public void deleteEmployeeE(Employee2 emp) {
		getHibernateTemplate().delete(emp);
	}
	
	//method to update employee  
	public void updateEmployee(Employee2 e){  
	    getHibernateTemplate().update(e);  
	} 
}
