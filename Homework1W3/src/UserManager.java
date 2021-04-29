
public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý "+ user.getId() +" eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
}
