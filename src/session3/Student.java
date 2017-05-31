package session3;

public class Student {

	// initialize Instance variable String to store name
	String name;

	// initialize Instance variable rollNo
	int rollNo;

	// initialize Instance variable age
	int age;

	// initialize Instance variable String to store result
	String result;

	// created Constructor with three parameters
	public Student(String name, int rollNo, int age) {

		this.name = name;// stores result in instance variable name

		this.rollNo = rollNo;// stores rollNo in instance variable rollNo

		this.age = age;// stores age in instance variable age

	}

	// Method created for student result details
	public void studentDetails() {

		System.out.println(name + " " + rollNo + " " + age + " " + result);// print
		// the
		// given
		// statement

	}

	// Method created to store result
	public void result(int marks) {

		// conditions to check marks and age

		if (marks > 80) {
			result = "A";// save the 'A' grade in result
		}

		else if (marks >= 61 && marks <= 80) {
			result = "B";// save the 'B' grade in result
		}

		else if (marks > 40 && marks <= 60) {
			result = "C";// save the 'C' grade in result
		} else {
			result = "D";// save the 'D' grade in result
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("Amritha", 1, 16);
		// creating object for stu in Student class

		Student stu1 = new Student("Tanaya", 2, 15);
		// creating object for stu1 in Student class

		Student stu2 = new Student("Kaushik", 3, 17);
		// creating object for stu2 in Student class

		System.out.println("Name" + " " + "RollNo" + " " + "Age" + " " + "Result");
		// print the given statement

		// objects calling result method

		stu.result(85);

		stu1.result(65);

		stu2.result(45);

		// objects calling studentDetails method

		stu.studentDetails();

		stu1.studentDetails();

		stu2.studentDetails();

	}

}
