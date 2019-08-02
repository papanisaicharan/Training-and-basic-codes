package component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("234")
	private int code;
	@Value("saicharan")
	private String name;
	@Autowired
	private Basic salary;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Basic getSalary() {
		return salary;
	}
	public void setSalary(Basic salary) {
		this.salary = salary;
	}

	
}
