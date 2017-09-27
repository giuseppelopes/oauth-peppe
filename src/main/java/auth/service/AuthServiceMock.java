package auth.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import auth.data.User;

@Service("authServiceMockImpl")
public class AuthServiceMock implements AuthService {

	private ArrayList<User> users;
	
	public AuthServiceMock() {
		super();
		this.users = new ArrayList<>();
		users.add(new User("Giuseppe", "1qaz2wsx"));
		users.add(new User("fulano", "zaq1xsw2"));
	}

	@Override
	public Boolean auth(String name, String pass) {
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			if (user.getName().equals(name) && user.getPass().equals(pass)){
				return true;
			}
		}
		return false;
	}
	
}
