package com.Pojo_;

public class Pojo_Practice {

	public static void main(String[] args) {
		
		Pojo_Access poj = new Pojo_Access();
		
//		System.out.println(poj.getUsername());
//		System.out.println(poj.getPassword());
		
		poj.SetUsername("Asikjainul");
		poj.setPassword("123456");
		poj.setEmail_Address("Asik@gmail.com");
		poj.setLocation("NYC");
		poj.setCon_num("98568222");
		poj.setGender("male");
		
		System.out.println("Username is "+poj.getUsername());
		System.out.println("Password is "+poj.getPassword());
		System.out.println("location is "+poj.getEmail_Address());
		System.out.println("location is "+poj.getLocation());
	    System.out.println("contactnum is "+ poj.getCon_num());
	    System.out.println("Gender is "+poj.getGender());
	    
	    
	    
	    
	    
	    
	}
		  
		  
		  
		  
		  
		  
	}
	
	
	
	

	
	
	
	
	
	
	

