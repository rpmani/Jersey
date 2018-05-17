package com.jersey.friends.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.websocket.server.PathParam;

import com.jersey.friends.dao.FriendsDAO;
import com.jersey.friends.pojo.Friends;

public class FriendCollectionService {
	FriendsDAO dao = null;
	static HashMap<Integer, Friends> friendsmap = new HashMap<Integer,Friends>();

	public FriendCollectionService() {
		super();
		// TODO Auto-generated constructor stub
		
		Friends f1 = new Friends(1,"Mani","Chennai");
		Friends f2 = new Friends(2,"Raj","Chennai");
		Friends f3 = new Friends(3,"Manikandan","Chennai");
		Friends f4 = new Friends(4,"Arun","Chennai");
		
		friendsmap.put(1, f1);
		friendsmap.put(2, f2);
		friendsmap.put(3, f3);
		friendsmap.put(4, f4);
		
	}
	
	public List getAllFriends(){
		List friends = new ArrayList(friendsmap.values());
		return friends;
	}
	
	public Friends getFriendsById(int id){
		Friends friend = friendsmap.get(id);
	return friend;	
	}
	 

	public Friends updateFriends(Friends friends) {
		// TODO Auto-generated method stub
		friendsmap.put(friends.getId(), friends);
		return friends;
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		friendsmap.remove(id); 
		 
	}
	
}
