
public class Authenticator {
	
	public void Authentication(User user, AuthenticationValue userAuthentication) {
		
		if(user.getAge() > 18) {
			
			if(user.getFirstName() == userAuthentication.getUserFirstName() &&
			   user.getLastName() == userAuthentication.getUserLastName()	&&
			   user.getNationalId() == userAuthentication.getUserNationalId()	&&
			   user.getAge() == userAuthentication.getUserAge()	&&
			   user.getGender() == userAuthentication.getUserGender()) {
				
				System.out.println(user.getFirstName() + " is real person. Authentication is succed.");
				
			}
			
			else {
				System.out.println(user.getFirstName() + " is not real person. Authentication is denied.");
			}	
		}
		else {
			System.out.println(user.getFirstName() + " named user is not over 18. Authentication is denied.");
		}

		
	}

}
