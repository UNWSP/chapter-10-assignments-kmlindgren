
public class LabCourse extends CollegeCourse {
	
	public LabCourse(String dept, String num, int cred, int feeRate) {
		super(dept, num, cred, feeRate);
	}
	
	public void display() {
		System.out.println("\n***Lab Course Info***" + "\nDepartment: " + department + "\nCourse Number: " + courseNum + "\n# of Credits: " + credits + "\nTotal Fee: $" + fee);
	}
	
}
