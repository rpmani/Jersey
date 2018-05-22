package org.arpit.java2blog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.arpit.java2blog.bean.Country;

public class CountryService {
	static HashMap<Integer, Country> countryIdMap = new HashMap<Integer, Country>();

	public CountryService() {
		super();
		 
			countryIdMap = new HashMap<Integer, Country>();

			Country indiaCountry = new Country(1, "India", 100000);
			Country chinaCountry = new Country(2, "China", 100000);
			Country nepalCountry = new Country(3, "Napal", 100000);
			Country puttonCountry = new Country(4, "putton", 100000);

			countryIdMap.put(1, indiaCountry);
			countryIdMap.put(2, chinaCountry);
			countryIdMap.put(3, nepalCountry);
			countryIdMap.put(4, puttonCountry);

		}
 

	public List getAllCountries() {
		List countries1 = new ArrayList(countryIdMap.values());
		System.out.println("========>>>"+countries1);
		return countries1;
	}

	public Country getContry(int id) {
		Country country = countryIdMap.get(id);
		return country;

	}
	
	public Country addCountry(Country country){
		country.setId(countryIdMap.size()+1);
		countryIdMap.put(country.getId(),country);
		return country;
	}
	
	 public Country updateCountry(Country country)
	 {
	  if(country.getId()<=0)
	   return null;
	  countryIdMap.put(country.getId(), country);
	  return country;
	 
	 }
	 public void deleteCountry(int id)
	 {
	  countryIdMap.remove(id);
	 }
	 
	 public static HashMap<Integer, Country> getCountryIdMap() {
	  return countryIdMap;
	 }

}
