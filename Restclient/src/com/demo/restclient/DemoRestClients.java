package com.demo.restclient;
	
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
	
	public class DemoRestClients {
	
	       public static void main(String[] args) {
	              
	              ClientConfig config = new ClientConfig();
	              
	              Client client = ClientBuilder.newClient(config);

	              
	              WebTarget webTarget = client.target(getCustomURI());
	              
	             // String response = webTarget.path("restapi").path("first").path("welcome").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();
	              //String response = webTarget.path("restapi").path("friends").path("getAll").request().accept(MediaType.APPLICATION_JSON).get(Response.class).toString();
	              String response = webTarget.path("restapi").path("friends").path("delete;id=1").request().accept(MediaType.APPLICATION_JSON).delete(Response.class).toString();
	              
	              
	              System.out.println(response);
	              
	            //  String message = webTarget.path("restapi").path("first").path("welcome").request().accept(MediaType.TEXT_PLAIN).get(String.class).toString();
	            //  String message = webTarget.path("restapi").path("friends").path("getAll").request().accept(MediaType.APPLICATION_JSON).get(String.class).toString();
	              String message = webTarget.path("restapi").path("friends").path("delete;id=1").request().accept(MediaType.APPLICATION_JSON).delete(String.class).toString();
	              
	              System.out.println(message);
	              
	              
	              
	       }
	
	       private static URI getCustomURI() {
	              // TODO Auto-generated method stub
	              
	             // return UriBuilder.fromUri("http://localhost:8084/RestDemoss").build();
	    	   return UriBuilder.fromUri("http://localhost:8084/RestfullCURD").build();
	    	   
	       
	       }
	
	}
