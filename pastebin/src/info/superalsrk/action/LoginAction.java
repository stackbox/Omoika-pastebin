package info.superalsrk.action;

import java.util.Map;

import info.superalsrk.entity.LoginUser;
import info.superalsrk.service.LoginAndRegistService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginUser user;

	public LoginUser getUser() {
		return user;
	}

	public void setUser(LoginUser user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (user.getUsername().equals("public")) {
			
			return Action.ERROR;
		} else {

			if (LoginAndRegistService.checkLogin(user)) {
				Map<String, Object> session = ActionContext.getContext()
						.getSession();
				session.put("user", user.getUsername());
				return Action.SUCCESS;
			} else {
				return Action.ERROR;
			}
		}
	}

}
