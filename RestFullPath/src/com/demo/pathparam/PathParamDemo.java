package com.demo.pathparam;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType; 
 
@Path("/jaxy")
public class PathParamDemo {    
@GET
@Path("{id}")
@Produces(MediaType.TEXT_PLAIN)  
 public Response getMassegeWithSingleParam(
                               @PathParam("id") String id) {            
        String output = "RESTful WS Jersey example. " +"Hello your id is : " + id; 
        return Response.status(200).entity(output).build();
        		
        		//return Response.status(200).entity(output).build(); 
 }
 
@GET
@Path("{name}/{class}/{rollNo}")
@Produces(MediaType.TEXT_PLAIN)  
 public Response getMassegeWithMultiParam(
        @PathParam("name") String name,
        @PathParam("class") String className, 
        @PathParam("rollNo") String rollNo) {             
        String output = "Student Name : " + name + ", Class: " 
                       +className+ ", Roll No. : " + rollNo; 
        return Response.status(200).entity(output).build(); 
 }


@GET
@Path("/")
@Produces(MediaType.TEXT_PLAIN)  
public Response getMassegeWithMatrixParam(@MatrixParam("name") String name,@MatrixParam("class") String className,@MatrixParam("rollNo") String rollNo,@MatrixParam("id") String id)
//public Response getMassegeWithMatrixParam(@PathParam("name") String name,@MatrixParam("class") String className)
{		 
	String output = "Student Name : " + name + ", Class: " +className + ", Roll No. : " + rollNo + ", id : " + id; 
	return Response.status(200).entity(output).build(); 
}

@POST
@Path("/add")
public Response addStudent(@FormParam("name") String name,@FormParam("rollNo") String rollNo) {	 
	String output = "Student Name: " + name + ", Roll No.: " + rollNo; 
	return Response.status(200).entity(output).build(); 
}

}
