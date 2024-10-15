
public class Account {
	private String name;
    private String phoneNo;
    private String email ;
    private String password ;
    private String retypePassword;
    
	public Account(String name, String phoneNo, String email, String password, String retypePassword) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
		this.retypePassword = retypePassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}
	
}
