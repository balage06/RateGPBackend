package hu.balpo.rategp.backend.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NamedEntity extends BaseEntity {
	
	private String name;
	
	public NamedEntity() {
		super();
	}
	
	public NamedEntity(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
