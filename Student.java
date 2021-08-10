public class Student {

	static String consultancyName = "APEX";//what to do with static, OK done
						//remove "private" to call from outside class
	//Encapsulation
	private String firstName;
	private String lastName;
	private int age;
	private int rollNo;
	private String ssnNo = "xxx1337";// hardcode
	
	public Student(String firstName, String lastName, int age, int rollNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.rollNo = rollNo;
	}
	public Student(int age, int rollNo) {
		int a = 0;
		int k; 
		if (a == 0) 
			k = 5; 
	}
	public Student() {
	}


	public static String getConsultancyName(){
		return consultancyName; 
	}

	public static void setConsultancyName(String consultancyName) {
		Student.consultancyName = consultancyName; //similar2 "this.consultancyName"; 
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo() {
		this.rollNo = rollNo; 
	}



	public String getSsnNo(){
		return ssnNo;
	}
	// void setSsnNO(){
	//	this.ssNo = ssnNo; 
	//}
	// Delete this method to prevent the setting of SsnNo from outside the class

}