package classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Beers {
	
	@Id
	private Integer id;
	private String name;
	private String descript;
	private String abv; //Alcohol percentage
	
	@OneToOne
	@JoinColumn(name="brewery_id")
	private Breweries brewery;
	
	@OneToOne
	@JoinColumn(name="cat_id")
	private Categories categories;
	
	@OneToOne
	@JoinColumn(name="style_id")
	private Styles styles; 
	
	public Beers(){}
		
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public String getDescription() {
		return descript;
	}
	public String getAbv() {
		return abv;
	}

	public Breweries getBrewery() {
		return brewery;
	}
	
	public Categories getCategories() {
		return categories;
	}

	public Styles getStyles() {
		return styles;
	}
	
	
	
}
