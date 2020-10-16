package oop;

class Student {
	private int admno;
	private String name;
	private int course, feepaid;

	public Student(int no, String n, int c) {
		admno = no;
		name = n;
		course = c;
	}

	public Student(int no, String n, int c, int amount) {
		admno = no;
		name = n;
		course = c;
		feepaid = amount;
	}

	public void pay(int amount) {
		feepaid += amount;
	}

	public int getDue() {
		return getTotalFee() - feepaid;
	}

	public int getTotalFee() {
		if (course == 1)
			return 10000;
		else if (course == 2)
			return 15000;
		else
			return 8000;
	}

	public void print() {
		System.out.println(admno);
		System.out.println(name);
		System.out.println(course);
		System.out.println(feepaid);
	}

}

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student(1, "Mark", 2);
		Student s2 = new Student(2, "Scott", 3, 3000);
		s.pay(5000);
		s.pay(3000);
		System.out.println(s.getDue());
	}

}
