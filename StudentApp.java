package day3.task1;

public class StudentApp {
	// user of application
	public static void main(String[] args) {
		
		Student ramesh = new Student();
		ramesh.setStudentName("Ramesh");
		ramesh.setTotalMarks(58);
		
		ramesh.giveExam(98);
		
		
		Student suresh = new Student();
		suresh.setStudentName("Suresh");
		suresh.setTotalMarks(48);
		
		// --- calling of business method 
		suresh.giveExam(98);
		
		
		System.out.println(ramesh.getTotalMarks()+" - "+ramesh.getStudentName());
		System.out.print(ramesh.getStudentName()+" Status  ");
		if(ramesh.isStatus()) {
			System.out.print("is pass");
		}
		else {
			System.out.print("is failed");
		}
		
		Student abc = new Student("Mike");
		
		
	}

}
