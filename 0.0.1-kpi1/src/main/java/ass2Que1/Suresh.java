package ass2Que1;

public class Suresh extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee S1 = new Suresh();
		S1.show();
		S1.empID();
		S1.empName();
		S1.empFatherName();
		S1.empDOB();
		S1.empAge();
		S1.empRole();
		S1.empWorkHr();
		S1.empWorkStatus();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Employee");
	}

	@Override
	void empID() {
		// TODO Auto-generated method stub
		System.out.println("Empoyee ID is:"+" "+101);
	}

	@Override
	void empName() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name is:"+" "+"Suresh");
	}

	@Override
	void empAge() {
		// TODO Auto-generated method stub
		System.out.println("Employee Age is:"+" "+34);
	}

	@Override
	void empFatherName() {
		// TODO Auto-generated method stub
		System.out.println("Employee father name is:"+" "+"Hanuman");
	}

	@Override
	void empDOB() {
		// TODO Auto-generated method stub
		System.out.println("Employee DOB is:"+" "+"10/May/1988");
	}

	@Override
	void empWorkHr() {
		// TODO Auto-generated method stub
		System.out.println("Emplyee working hour is:"+" "+8);
	}

	@Override
	void empWorkStatus() {
		// TODO Auto-generated method stub
		System.out.println("Employee working status is:"+" "+"Working");
	}

	@Override
	void empRole() {
		// TODO Auto-generated method stub
		System.out.println("Employee role is:"+" "+"Data Engineer");
	}

}
