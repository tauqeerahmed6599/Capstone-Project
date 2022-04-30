package com.demo.placement.domain;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity

public class Placement {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
	
private String type;
private String vacancy;
private String description;

public Placement() {
	super();
	}
public Placement(long id, String type, String vacancy, String description) {
	super();
	this.id = id;
	this.type = type;
	this.vacancy = vacancy;
	this.description = description;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getVacancy() {
	return vacancy;
}
public void setVacancy(String vacancy) {
	this.vacancy = vacancy;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
