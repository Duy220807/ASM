package com.poly.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "roles")
public class Role implements Serializable {

	@Id
	private String id;
	private String name;
	
	public String getId() {
        return this.id;
    }
	
	 // Constructor mặc định
    public Role() {
    }

	public Role(String id, String name, List<Authority> authorities) {
		super();
		this.id = id;
		this.name = name;
		this.authorities = authorities;
	}


	@JsonIgnore
	@OneToMany(mappedBy = "role")
	List<Authority> authorities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}