package backing;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.UserDAO;
import entities.User;

@ViewScoped
@ManagedBean
public class UserDelete {
	
	private User user;
	
	@EJB
	private UserDAO userDAO;
	
	public String delete() {
		userDAO.delete(user);
		return "index?faces-redirect=true";
	}
	
	public String cancel() {
		return "index?faces-redirect=true";
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
