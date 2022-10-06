package ass2Que1;

public abstract class Employee implements Employee1{
	 int empID;
	 String empName;
	 int empAge;
	 String empFatherName;
	 String empDOB;
	 int empWorkHr;
	 String empWorkStatus;
	 String empRole;
	 Employee(int empID, String empName, int empAge, String empFatherName, String empDOB,
	 int empWorkHr, String empWorkStatus, String empRole)
	 {
		 this.empID = empID;
		 this.empName = empName;
		 this.empAge = empAge;
		 this.empFatherName = empFatherName;
		 this.empDOB = empDOB;
		 this.empWorkStatus = empWorkStatus;
		 this.empWorkHr = empWorkHr;
		 this.empRole = empRole;
	 }

}
