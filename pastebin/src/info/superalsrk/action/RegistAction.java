package info.superalsrk.action;

import info.superalsrk.entity.RegistUser;
import info.superalsrk.service.LoginAndRegistService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	RegistUser registUser;

	public RegistUser getRegistUser() {
		return registUser;
	}

	public void setRegistUser(RegistUser registUser) {
		this.registUser = registUser;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(registUser.getUsername());
		System.out.println(registUser.getEmail());
		System.out.println(registUser.getPassword());
		
		if(LoginAndRegistService.registUser(registUser)) {
			return Action.SUCCESS;
		} else {
			return Action.ERROR;
		}
	
	}

}
