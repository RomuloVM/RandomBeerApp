package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Styles {
	
	@Id
	@Column(name="id")
	private Integer id;
	private String style_name;
	
	public Styles(){}

	public Integer getId() {
		return id;
	}

	public String getStyle_name() {
		return style_name;
	}
	
	

}
