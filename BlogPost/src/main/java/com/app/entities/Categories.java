package com.app.entities;

import org.hibernate.*;
import javax.persistence.*;

@Entity(name = "categories")
public class Categories {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	
	@Column(name = "descripiton", length = 40)
	private String description;
	
	@Column(name = "name", length = 20)
	private String name;

	// default constructor
	public Categories() {
		
	}

	// parametrized constructor
	public Categories(Long categoryId, String description, String name) {
		super();
		this.categoryId = categoryId;
		this.description = description;
		this.name = name;
	}

	// getters and setters
	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", description=" + description + ", name=" + name + "]";
	}
	
	
	
}
