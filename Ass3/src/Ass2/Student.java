package Ass2;

public class Student extends Teacher {
	void student_work()
	{
		System.out.println("Student work is to Learn");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student();
		S1.teacher_work();
		S1.student_work();
		S1.period();
	}

}
