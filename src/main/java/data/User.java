package data;

import java.util.HashMap;

public class User {

	private String name;
	private String pass;
	
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String toString() {
		HashMap<String, String> output = new HashMap<String, String>();
		output.put("name", this.name);
		output.put("pass", "Hey man! No Print the pass!");
		
		return output.toString();
	}
	
	
}
