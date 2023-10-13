package pac.InheritanceConcept;

public class StudentInfo extends BasicInfo {
	private String studentId;
	private String courseName;
	private String courseDuration;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public static void studentMethod()
	{	
		StudentInfo studentInfo = new StudentInfo();
	studentInfo.setStudentId("191812107");
	System.out.println("Student Id  : " + studentInfo.getStudentId());
	
	studentInfo.setCourseName("Java Full Stack Developer");
	System.out.println("Course Name  : " + studentInfo.getCourseName());
	
	studentInfo.setCourseDuration("Five Months");
	System.out.println("Course Duration  : " + studentInfo.getCourseDuration());
	
	
	}
}
