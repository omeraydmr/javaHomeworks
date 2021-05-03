
public class UserManager implements UserServices{
	
	@Override
	public void addUser(User user) {
		System.out.println("Id : "+ user.getId() + " Username : " + user.getUserName() + " is added.");
		
	}
	
	@Override
	public void removeUser(User user) {
		System.out.println("Id : "+ user.getId() + " Username : " + user.getUserName() + " is removed.");
		
	}
	
	@Override
	public void updateUser(User user) {
		System.out.println("Id : "+ user.getId() + " Username : " + user.getUserName() + " is updated.");
		
	}

	@Override
	public void getAll(User[] users) {
		
		for(User user : users) {
			System.out.println("Id : "+ user.getId() + " Username : " + user.getUserName() + ".");
		}
		
	}


}
