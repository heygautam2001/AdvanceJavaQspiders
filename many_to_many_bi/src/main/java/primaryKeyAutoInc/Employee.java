package primaryKeyAutoInc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
// Identity : it will use db default mechanism to auto increment p-key
// limitation is we cannot customize the pk auto incr
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer e_id;
	
	private String e_name;

	public Employee(String e_name) {
		super();
		this.e_name = e_name;
	}

	public Integer getE_id() {
		return e_id;
	}

	public void setE_id(Integer e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + "]";
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
