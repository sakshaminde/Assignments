package ass2Que1;

public class Suresh extends Employee {

	Suresh(int empID, String empName, int empAge, String empFatherName, String empDOB, int empWorkHr,
			String empWorkStatus, String empRole) {
		super(empID, empName, empAge, empFatherName, empDOB, empWorkHr, empWorkStatus, empRole);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suresh S1 = new Suresh(101,"Suresh",34,"Hanuman","10/May/1972",8,"Working","Data Engineer");
		S1.empID=101;
		/*
		 * //S1.show(); S1.empID=101; S1.empName="Suresh"; S1.empAge=34;
		 * S1.empFatherName="Hanuman"; S1.empDOB="10/May/2000"; S1.empWorkHr=8;
		 * S1.empWorkStatus"Working"; S1.empRole(Data Engineer";
		 */		
	}

	public int empID() {
		// TODO Auto-generated method stub
		System.out.println("ID:" +empID);
		return 101;
	}

	public String empName() {
		// TODO Auto-generated method stub
		System.out.println("Name:"+empName);
		return "Suresh";
	}

	public int empAge() {
		// TODO Auto-generated method stub
		System.out.println("Age:"+empAge);
		return 34;
	}

	public String empFatherName() {
		// TODO Auto-generated method stub
		System.out.println("Father Name:"+empFatherName);
		return "Hanuman";
	}

	public String empDOB() {
		// TODO Auto-generated method stub
		System.out.println("DOB:"+empDOB);
		return "10/May/1972";
	}

	public int empWorkHr() {
		// TODO Auto-generated method stub
		System.out.println("Work Hour:"+empWorkHr);
		return 8;
	}

	public String empWorkStatus() {
		// TODO Auto-generated method stub
		System.out.println("Work status:"+empWorkStatus);
		return "Working";
	}

	public String empRole() {
		// TODO Auto-generated method stub
		System.out.println("Role:"+empRole);
		return "Data Engineer";
	}	
}
