package com.example.compare;

import java.io.Serializable;

public class Pokemon implements Serializable, Comparable<Pokemon> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7071634871994209641L;
	private Integer id;
	private String name;
	private String type1;
	private String type2;
	
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pokemon(Integer id, String name, String type1, String type2) {
		super();
		this.id = id;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
	}
	
	public int compareTo(Pokemon other) {
		return this.id - other.getId();
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

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", type1=" + type1 + ", type2=" + type2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type1 == null) ? 0 : type1.hashCode());
		result = prime * result + ((type2 == null) ? 0 : type2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type1 == null) {
			if (other.type1 != null)
				return false;
		} else if (!type1.equals(other.type1))
			return false;
		if (type2 == null) {
			if (other.type2 != null)
				return false;
		} else if (!type2.equals(other.type2))
			return false;
		return true;
	}
}
