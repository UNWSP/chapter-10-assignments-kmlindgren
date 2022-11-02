import java.util.*;

public class UseCourse {
	static String department, courseNum;
	static int credits, fee;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the department (e.g., COS): ");
		department = input.next();
		
		System.out.print("Enter the course number (e.g., 101): ");
		courseNum = input.next();
		
		System.out.print("Enter the number of credits for the course: ");
		credits = input.nextInt();
		
//		switch(department.toUpperCase()) {
//			case "BIO":
//			case "CHM":
//			case "CIS":
//			case "PHY":
//				LabCourse myCourse = new LabCourse(department, courseNum, credits);
//			default:
//				CollegeCourse myCourse = new CollegeCourse(department, courseNum, credits);
//		}
		department = department.toUpperCase();
		
		if(department.equals("BIO") || department.equals("CHM")|| department.equals("CIS")|| department.equals("PHY")) {
			LabCourse myCourse = new LabCourse(department, courseNum, credits, 170);
			myCourse.display();
		} else {
			CollegeCourse myCourse = new CollegeCourse(department, courseNum, credits, 120);
			myCourse.display();
		}
		
	}

}
