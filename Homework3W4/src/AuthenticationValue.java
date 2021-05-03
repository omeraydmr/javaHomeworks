
public class AuthenticationValue {

		private String userFirstName;
		private String userLastName;
		private String userNationalId;
		private int userAge;
		private String userGender;
		
		public AuthenticationValue() {
			
		}
		
		public AuthenticationValue(int userId, String userUserName, String userFirstName, String userLastName,
				String userNationalId, int userAge, String userGender) {
			super();
			this.userFirstName = userFirstName;
			this.userLastName = userLastName;
			this.userNationalId = userNationalId;
			this.userAge = userAge;
			this.userGender = userGender;
		}


		public String getUserFirstName() {
			return userFirstName;
		}

		public void setUserFirstName(String userFirstName) {
			this.userFirstName = userFirstName;
		}

		public String getUserLastName() {
			return userLastName;
		}

		public void setUserLastName(String userLastName) {
			this.userLastName = userLastName;
		}

		public String getUserNationalId() {
			return userNationalId;
		}

		public void setUserNationalId(String userNationalId) {
			this.userNationalId = userNationalId;
		}

		public int getUserAge() {
			return userAge;
		}

		public void setUserAge(int userAge) {
			this.userAge = userAge;
		}

		public String getUserGender() {
			return userGender;
		}

		public void setUserGender(String userGender) {
			this.userGender = userGender;
		}
		
		

		
		
	

}
