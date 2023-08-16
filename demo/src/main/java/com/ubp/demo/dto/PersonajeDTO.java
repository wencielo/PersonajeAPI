package com.ubp.demo.dto;

public class PersonajeDTO {

	private String id;
	private String name;
	private String status;
	private String species;
	private String type;
	private String gender;
	private String imagen;
	private String url;
    
    
	public PersonajeDTO() {
	}
	
	
	
	public PersonajeDTO(String id, String name, String status, String species, String type, String gender,
			String imagen, String url, String created) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.type = type;
		this.gender = gender;
		this.imagen = imagen;
		this.url = url;
	}


	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "PersonajeDTO [id=" + id + ", name=" + name + ", status=" + status + ", species=" + species + ", type="
				+ type + ", gender=" + gender + ", imagen=" + imagen
				+ ", url=" + url + "]";
	}
    
    
	
}
