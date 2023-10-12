package pac.JDBCConcept;

import java.sql.Date;

public class UserInfo {
	int studentInfoId;
	String studentId;
	String studentName;
	Long studentMobileNumber;
	String studentEmail;
	String studentGender;
	Date studentDOB;
	int studentYearOfJoining;
	String courseId;
	String studentBloodGroup;
	int studentYearOfCourseCompletion;
	public int getStudentInfoId() {
		return studentInfoId;
	}
	public String getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Long getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public int getStudentYearOfJoining() {
		return studentYearOfJoining;
	}
	public String getCourseId() {
		return courseId;
	}
	public String getStudentBloodGroup() {
		return studentBloodGroup;
	}
	public int getStudentYearOfCourseCompletion() {
		return studentYearOfCourseCompletion;
	}
	public void setStudentInfoId(int studentInfoId) {
		this.studentInfoId = studentInfoId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentMobileNumber(Long studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public void setStudentYearOfJoining(int studentYearOfJoining) {
		this.studentYearOfJoining = studentYearOfJoining;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public void setStudentBloodGroup(String studentBloodGroup) {
		this.studentBloodGroup = studentBloodGroup;
	}
	public void setStudentYearOfCourseCompletion(int studentYearOfCourseCompletion) {
		this.studentYearOfCourseCompletion = studentYearOfCourseCompletion;
	}
	@Override
	public String toString() {
		return "UserInfo [studentInfoId= " + studentInfoId + ", studentId=" + studentId + ", studentName=" + studentName
				+ ", studentMobileNumber=" + studentMobileNumber + ", studentEmail=" + studentEmail + ", studentGender="
				+ studentGender + ", studentDOB=" + studentDOB + ", studentYearOfJoining=" + studentYearOfJoining
				+ ", courseId=" + courseId + ", studentBloodGroup=" + studentBloodGroup
				+ ", studentYearOfCourseCompletion=" + studentYearOfCourseCompletion + "]";
	}
}