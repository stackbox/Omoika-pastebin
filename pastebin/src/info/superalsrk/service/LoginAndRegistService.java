package info.superalsrk.service;

import info.superalsrk.entity.*;

public class LoginAndRegistService {
	
	public static boolean checkLogin(LoginUser user) {
		if(user.getUsername().equals("omoika") && user.getPassword().equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean registUser(RegistUser user) {
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		
		return true;
	}
}
