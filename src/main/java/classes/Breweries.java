package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Breweries {
	
	@Id
	@Column(name="id")
	private Integer id;
	private String name;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	
	public Breweries(){}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

}
