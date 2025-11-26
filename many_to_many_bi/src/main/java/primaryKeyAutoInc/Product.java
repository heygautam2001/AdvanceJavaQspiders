package primaryKeyAutoInc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE , generator = "my_tab_gen")
	@TableGenerator(name="my_tab_gen", initialValue = 1000,table="my_tab")
	private Integer p_id;
	private String p_name;
	
     public Product() {
    	 
     }

	public Product(String p_name) {
		super();
		this.p_name = p_name;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + "]";
	}
     
  }
