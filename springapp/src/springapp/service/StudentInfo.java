package springapp.service;

public class StudentInfo {

	@Override
	public String toString() {
		return "StudentInfo [rollNumber=" + rollNumber + ", studentName="
				+ studentName + ", age=" + age + ", sex=" + sex + ", grade="
				+ grade + ", country=" + country + "]";
	}
	private int rollNumber;
	private String studentName;
	private int age;
	private String sex;
	private String grade;
	private String country;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
