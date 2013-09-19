package backing;

import static util.Messages.addFlashMessage;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.UserDAO;
import entities.User;

@ViewScoped
@ManagedBean
public class UserEdit {
	
	private User user;

	@EJB
	private UserDAO userDAO;
		
	public void preRenderView() {
		if (user == null) {
			user = new User();
		}
	}

	public String saveUser() {
		if (user.getId() != null) {
			userDAO.update(user);
		} 
		else {
			userDAO.save(user);
		}
		
		addFlashMessage("User " + user.getId() + " saved");
		
		return "index.xhtml?faces-redirect=true";
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

}
