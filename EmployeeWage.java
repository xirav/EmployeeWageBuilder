public class EmployeeWage {

	public static void main(String[] args) {
		//constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//Variables
		int empHrs=0;
		int empWage=0;
		//computations
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs=8;
			empWage=empHrs * EMP_RATE_PER_HOUR;
			System.out.println("EmpWage: " + empWage);
		}

	}


}
