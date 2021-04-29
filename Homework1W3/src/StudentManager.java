
public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Student "+ user.getFirstName() +" " + user.getLastName() +" added.");
	}
}
