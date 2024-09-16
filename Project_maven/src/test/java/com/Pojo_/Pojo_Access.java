package com.Pojo_;

public class Pojo_Access  {


	private  String Username;
	private  String Password;
	private String Email_Address;
	private String Location;
	private String Con_num;
	String Gender;
	
	
//************************************
	public String getUsername() {
		return Username;

	}

	public String getPassword() {
		return Password;
	}
   
	
	public String getEmail_Address() {
		return Email_Address;
	}
	
	public String getLocation() {
		return Location;
	}
	
	public String getCon_num() {
		return Con_num;
	}
	
	public String getGender() {
		return Gender;
	}
	
	//*****************************************
	
     public void SetUsername(String value) {
    	 Username = value ;
		
	}
	
	
	public void setPassword(String pass) {
		Password = pass;
	}
	
	public void setEmail_Address(String email) {
		Email_Address = email;
	}
	
	public void setLocation(String loc) {
		Location = loc;
	}
	
	public void setCon_num(String contact) {
		Con_num = contact;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	

	}
	



