package com.jsbomb.spittr.web.data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spitter {
	private Long id;
	
	@NotNull
	@Size(min=5, max=16)
	private String username; //username not null 5-16 chars
	
	@NotNull
	@Size(min=5, max=25)
	private String password;
	
	@NotNull
	@Size(min=2, max=30)
	private String firstName;
	
	@NotNull
	@Size(min=2, max=30)
	private String lastName;
	
	public Spitter() {}
	
	public Spitter(Long id, String username, String password,
			String firstName, String lastName) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Spitter(String username, String password,
			String firstName, String lastName) {
		this(null, username, password, firstName, lastName);

	}

	public String getUsername() {
		return username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	  @Override
	  public boolean equals(Object that) {
	    return EqualsBuilder.reflectionEquals(this, that, "firstName",
	    		"lastName", "username", "password");
	  }
	  
	  @Override
	  public int hashCode() {
	    return HashCodeBuilder.reflectionHashCode(this, "firstName",
	    		"lastName", "username", "password");
	  }

}
