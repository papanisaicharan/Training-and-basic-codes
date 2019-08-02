package hdmcustomer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer1")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	@Column(name = "CUSTNAME" , nullable = false,length = 20)
	private String custname;

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}
	
}
