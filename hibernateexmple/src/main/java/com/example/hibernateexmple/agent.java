package com.example.hibernateexmple;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class agent {

@Id

private int id;
private String name,city;
private int com_amt;

@Override
public String toString() {
	return "agent [id=" + id + ", name=" + name + ", city=" + city + ", com_amt=" + com_amt + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getCom_amt() {
	return com_amt;
}
public void setCom_amt(int com_amt) {
	this.com_amt = com_amt;
}


}
