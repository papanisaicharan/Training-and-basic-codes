package dbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsertApp {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com.xml");
		Department dept = (Department) apc.getBean("department");
		dept.setDeptno(36);
		dept.setDname("saicharan");
		dept.setLoc("hyderabad");
		DepartmentDaoImp dao = (DepartmentDaoImp) apc.getBean("dao");
		int rows = dao.addDepartment(dept);
		if(rows > 0) {
			System.out.println("inserted");
		}else {
			System.out.println("not inserted");
		}
		//getting employees
		List<Department> deptt = dao.getDepartments();
		for(Department dept1 : deptt) {
			System.out.println(dept1.getDeptno() + " " + dept1.getDname() + " " + dept1.getLoc());
		}
		Scanner s = new Scanner(System.in);
		int deptno = s.nextInt();
		if(dao.deleteDepartment(deptno) > 0) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
		
		
	}

}
