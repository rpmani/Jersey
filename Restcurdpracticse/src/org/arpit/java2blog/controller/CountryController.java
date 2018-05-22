package org.arpit.java2blog.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.arpit.java2blog.bean.Country;
import org.arpit.java2blog.service.CountryService;

@Path("/countries")
public class CountryController {
	CountryService countryService = new CountryService();
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List getCountries(){
		List listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id") int id){
		
		return countryService.getContry(id);
		 
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(Country country){
			
		return countryService.addCountry(country);
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> updateCountry(Country country){
		Country cun = countryService.updateCountry(country);
		List allCountrys = countryService.getAllCountries();
		return allCountrys;
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Country> deleteCountry(@PathParam("id")int id){
		countryService.deleteCountry(id);
		List allCountrys = countryService.getAllCountries();
		return allCountrys;
	}
	
	
}
