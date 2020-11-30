public class Login {
	private String username;
	private String password;
	private boolean isAdmin;

	public Login(String username, String password, boolean isAdmin){
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getUsername(){
		return this.username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public boolean getIsAdmin(){
		return this.isAdmin;
	}

	public void setIsAdmin(boolean isAdmin){
		this.isAdmin = isAdmin;
	}

}
