
public class EducationManager {
	public void addEducation(Education education) {
		System.out.println("This "+ education.name+" given by "+ education.teacher.toUpperCase() + " added.");
	}
	
	public void cancelEducation(Education education) {
		System.out.println("This "+ education.name+" given by "+education.teacher.toUpperCase() + " cancelled.");
	}
}
