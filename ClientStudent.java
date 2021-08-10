public class ClientStudent {

	public static void main(String[] args) {
		//int a = 10;
		Student std = new Student(); //getting memory space
		std.setFirstName("Trump");// No parameter constructor

		Student std1 = new Student();
		std1.setFirstName("Biden");//No parameter constructor

		Student std2 = new Student("Syam", "Sundar", 40, 1234);

		System.out.println(std.getFirstName());
		System.out.println(std1.getFirstName());
		System.out.println(std2.getFirstName());

		System.out.println("Before: ");		
		System.out.println(std.getConsultancyName());
		System.out.println(std1.getConsultancyName());
		System.out.println(std2.getConsultancyName());

		System.out.println("After: ");
		std2.setConsultancyName("Apex Consultancy"); 
		System.out.println(std.getConsultancyName());
		System.out.println(std1.getConsultancyName());
		System.out.println(std2.getConsultancyName());

		System.out.println("Another change: ");
		Student.consultancyName = "APEX CONSULTANCY";
		System.out.println(Student.getConsultancyName());
	}
}