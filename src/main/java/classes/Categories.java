package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {

	@Id
	@Column(name="id")
	private Integer id;
	private String cat_name;
	
	public Categories(){}

	public Integer getId() {
		return id;
	}

	public String getCat_name() {
		return cat_name;
	}
	
	
}
