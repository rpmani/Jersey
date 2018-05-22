package org.arpit.java2blog.bean;

public class Country {
int id;
String cuntryName;
long population;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCuntryName() {
	return cuntryName;
}
public void setCuntryName(String cuntryName) {
	this.cuntryName = cuntryName;
}
public long getPopulation() {
	return population;
}
public void setPopulation(long population) {
	this.population = population;
}
public Country() {
	super();
	// TODO Auto-generated constructor stub
}
public Country(int id, String cuntryName, long population) {
	super();
	this.id = id;
	this.cuntryName = cuntryName;
	this.population = population;
}
 


}
