package ex_17_OOPs;

public class Lab160_Constructor {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Pramod");
	}

}

class Student {
	String name;

	Student() {
		System.out.println("Hi my name is .");
	}

	Student(String name) {
		System.out.println("Hi my name is " + name);
	}

	void sleep() {
	}

	void study() {
	}

	void eat() {
	}

}
