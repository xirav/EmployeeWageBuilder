public class EmployeeWage {

	  //constants
                public static final int IS_PART_TIME = 1;
                public static final int IS_FULL_TIME = 2;
                public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 20;
		public static final int TOTAL_WORKING_HOURS = 100;

	public static void main(String[] args) {

		//Variables

		
		
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		//computations
		
		while (totalEmpHrs <= TOTAL_WORKING_HOURS && totalWorkingDays < NUM_OF_WORKING_DAYS ){
			int empHrs = 0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
                		 case IS_FULL_TIME:
				
			 		empHrs=8;
					break;

		 		case IS_PART_TIME:

					empHrs = 4;
					break;

				default:
					empHrs = 0;
				

			}
			totalEmpHrs += empHrs;
			int empWage=empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("EmpWage: " + empWage);
		}
		System.out.println("totalWage: " + totalEmpWage);

	

	}


}
