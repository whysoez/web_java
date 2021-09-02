import first_project.Student;

public class Student {
	String name = "Hưng";
	int age = 23;
	double id = 1.5;
}

public class StudentName {
	public static void main(String args[]) {
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.print(s1.age);
	}
}
