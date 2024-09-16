//package com.Helper;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class Data_Reader {
//
//
//	Properties p;
//
//	public Data_Reader() throws IOException{
//
//		File fi = new File ("C:\\Project\\Cucumber_Practice\\src\\main\\java\\com\\PropertyFile\\Adacting_info_properties");
//
//		FileInputStream fis = new FileInputStream(fi);
//
//		Properties p = new Properties();
//
//		p.load(fis);
//
//	}
//
//	public String getpropUrl() throws IOException {
//
//		String url = p.getProperty("url");
//
//		return url;
//
//	}
//
//
//	public String getpropUsername() {
//
//		String Username = p.getProperty("Username");
//		return Username;
//	}
//
//
//	public String getpropPassword() {
//		String pass = p.getProperty("Password");
//		return pass;
//
//	}
//
//
//
//}
