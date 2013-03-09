package info.superalsrk.service;

import info.superalsrk.dao.LoginDAO;
import info.superalsrk.dao.RegistDAO;
import info.superalsrk.entity.*;

public class LoginAndRegistService {
	
	public static boolean checkLogin(LoginUser user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		return LoginDAO.checkLogin(user);
	}
	
	public static boolean registUser(RegistUser user) {
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		
		
		return RegistDAO.save(user);
	}
}
