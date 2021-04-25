
public class User {
	
	public User() {
		System.out.println("Parametresiz constructor çalýþtý");
	}
	
	public User(int id, String name, String lastName, String mail, String password) {
		this.userId = id;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
		
	}
	
	int userId;
	String name;
	String lastName;
	String mail;
	String password;
}
