
public class CollegeCourse {
	String department, courseNum;
	int credits, fee, feeRate;

	public CollegeCourse(String dept, String num, int cred, int feeRate) {
		department = dept;
		courseNum = num;
		credits = cred;
		fee = credits * feeRate;
	}
	
	public void display() {
		System.out.println("\n***Course Info***" + "\nDepartment: " + department + "\nCourse Number: " + courseNum + "\n# of Credits: " + credits + "\nTotal Fee: $" + fee);
	}
}
