
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("�mer");
		student.setLastName("Aydemir");
		student.setEmail("omer@aydemir.com");
		student.setCoursesApplied("JAVA+REACT");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setEmail("engin@demiro�.com");
		instructor.setCoursesInstructor("JAVA+REACT");
		
		UserManager userManager = new InstructorManager();
		UserManager userManager2 = new StudentManager();
		UserManager userManager3 = new UserManager();
		
		User[] users = {student, instructor};
		
		userManager.add(instructor);
		userManager2.add(student);
		userManager3.addMultiple(users);
		
		

	}

}
