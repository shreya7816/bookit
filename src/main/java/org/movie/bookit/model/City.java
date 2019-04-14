package org.movie.bookit.model;

/**
 * @author shreya
 *
 */
public class City {
	
	private Integer id;
	private String name;
	private String state;
	private String country;
	private String countryCode;
	private Boolean isLaunched;
	
	public City(int i, String name, String state, String country, String countryCode, boolean isLaunched) {
		this.id = i;
		this.name = name;
		this.state = state;
		this.country = country;
		this.countryCode = countryCode;
		this.isLaunched = isLaunched;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Boolean getIsLaunched() {
		return isLaunched;
	}
	public void setIsLaunched(Boolean isLaunched) {
		this.isLaunched = isLaunched;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", state=" + state + ", country=" + country + ", countryCode="
				+ countryCode + ", isLaunched=" + isLaunched + "]";
	}

	
}
