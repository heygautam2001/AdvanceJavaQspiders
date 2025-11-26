package primaryKeyAutoInc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq_gen")
	@SequenceGenerator(name = "my_seq_gen", initialValue = 500, sequenceName = "my_seq_tab")
	private Integer u_id;

	private String u_name;

	public Users() {

	}

	public Users(String u_name) {
		super();
		this.u_name = u_name;
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

}
