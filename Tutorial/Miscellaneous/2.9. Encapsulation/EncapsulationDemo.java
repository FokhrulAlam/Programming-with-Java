package miscellaneous.tutorial.programmingWithJava;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Student student = new Student();
		
		//Get student's name and id from class Student{}
		String name = student.getStudentName();
		int id = student.getStudentId();
		
		//Change the id
		//If id>30000 and id<40000, new id will be 31231
		//Otherwise id will remain the same
		if (id>30000 && id<40000) {
			student.setStudentId("",31231);
		}
		else {
			student.setStudentId("ID did not change.",id);
		}
		
	}

}

class Student{
	
	private String studentName = "Md Fokhrul Alam";
	private int studentId = 35267;
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String comment,int id) {
		System.out.println(comment+studentName+"'s new id is "+id);
	}
}
