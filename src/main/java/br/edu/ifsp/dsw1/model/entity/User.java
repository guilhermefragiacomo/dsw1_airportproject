package br.edu.ifsp.dsw1.model.entity;

public class User {
	private String username;
	private String password;
	
	public User() {

	}
	
	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String user) {
		username = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		password = pass;
	}
}
