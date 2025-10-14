package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pancard {
  @Id
  private int pan_id;
  
  private String pan_address;
   
  Pancard(){
	  
	  
  }

public Pancard(int pan_id, String pan_address) {
	super();
	this.pan_id = pan_id;
	this.pan_address = pan_address;
}

public int getPan_id() {
	return pan_id;
}

public void setPan_id(int pan_id) {
	this.pan_id = pan_id;
}

public String getPan_address() {
	return pan_address;
}

public void setPan_address(String pan_address) {
	this.pan_address = pan_address;
}

@Override
public String toString() {
	return "Pancard [pan_id=" + pan_id + ", pan_address=" + pan_address + "]";
}
  
  
  
  
}
