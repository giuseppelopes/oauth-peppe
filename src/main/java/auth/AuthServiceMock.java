package auth;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import data.User;

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
		return false;
	}
	
}
