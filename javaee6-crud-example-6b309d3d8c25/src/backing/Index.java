package backing;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ejb.UserDAO;
import entities.User;

@RequestScoped
@ManagedBean
public class Index {
	
	private List<User> users;
	
	@EJB
	private UserDAO userDAO;
	
	@PostConstruct
	public void init() {
		users = userDAO.getAll();
	}

	public List<User> getUsers() {
		return users;
	}
}
