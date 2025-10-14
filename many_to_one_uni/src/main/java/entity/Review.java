package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	private Integer r_id;

	private Double rating;

	private String r_desc;

	@ManyToOne
	private Movie m;

	public Movie getM() {
		return m;
	}

	public void setM(Movie m) {
		this.m = m;
	}

	public Review() {

	}

	public Review(Integer r_id, Double rating, String r_desc, Movie m) {
		super();
		this.r_id = r_id;
		this.rating = rating;
		this.r_desc = r_desc;
		this.m = m;
	}

	public Integer getR_id() {
		return r_id;
	}

	public void setR_id(Integer r_id) {
		this.r_id = r_id;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getR_desc() {
		return r_desc;
	}

	public void setR_desc(String r_desc) {
		this.r_desc = r_desc;
	}

	@Override
	public String toString() {
		return "Review [r_id=" + r_id + ", rating=" + rating + ", r_desc=" + r_desc + "]";
	}

}
