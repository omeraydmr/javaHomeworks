
public class Main {

	public static void main(String[] args) {
		Education education1 = new Education(1,"C# Angular", "Engin Demirog" , 0);
		Education education2 = new Education(2,"Java+React" , "Engin Demirog" , 44);
		
		Category category1 = new Category(3, "Programming");
		
		System.out.println(category1.name + "(" + category1.piece+")");
		
		EducationManager educationmanager = new EducationManager();
		educationmanager.addEducation(education1);
		educationmanager.cancelEducation(education2);
	}

}
