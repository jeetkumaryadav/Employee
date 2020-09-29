public class EmpWageBuilder{
	
	     public static final int isFullTime = 2;
		 public static final int isPartTime = 1;
		 public static final int empRatePerHour = 20;
		 public static final int numOfWorkingDays = 20;
	
	public static void main(String[] args){
		
		System.out.println("Welcome to Employee Wage Computation");
		
		int empHours = 0;
		int empWage  = 0;
		int totalEmpWage = 0;
		
		for(int day =0; day < numOfWorkingDays; day++) {
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch(empCheck){
				case isFullTime:
					empHours = 8;
					break;
				case isPartTime:
					empHours = 4;
					break;
				default :
					empHours = 0;
			}
			
			empWage = empHours * empRatePerHour;
		    totalEmpWage += empWage;
		}
		
		System.out.println("Emp Wage for 20 working days: " + totalEmpWage);

	}
}	