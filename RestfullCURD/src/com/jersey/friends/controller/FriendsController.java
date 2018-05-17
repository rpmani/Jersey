package com.jersey.friends.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.friends.pojo.Friends;
import com.jersey.friends.service.FriendCollectionService;

@Path("/friends")
public class FriendsController {
	
	FriendCollectionService friendCollectionService = new FriendCollectionService();
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List getAllFriends(){
		List allFriends = friendCollectionService.getAllFriends();
		return allFriends;
		
	}
	
 
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Friends getFriendsById(@PathParam("id") int id) {
		Friends friends = friendCollectionService.getFriendsById(id);
		return friends;
	}
	 
	 	@POST
	 	@Path("/update")
	    @Produces(MediaType.APPLICATION_JSON)
	public List<Friends> updateFriends(Friends friends){
		 Friends fr= friendCollectionService.updateFriends(friends);
		 List<Friends> allFriends = friendCollectionService.getAllFriends();
		 return allFriends;
	
	}
	 	
	@DELETE
	@Path("/delete")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Friends> deleteFriends(@MatrixParam("id") int id){
		 friendCollectionService.remove(id);
		 List<Friends> allFriends = friendCollectionService.getAllFriends();
		return allFriends;
	}
}
