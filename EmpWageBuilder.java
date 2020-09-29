public class EmpWageBuilder{
	
	 public static final int isFullTime = 2;
	 public static final int isPartTime = 1;
	
	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxWorkingHours){
		int empHours = 0; int totalWorkingHours = 0; int totalWorkingDays = 0;
		while(totalWorkingHours <=maxWorkingHours && 
								totalWorkingDays < numOfWorkingDays) {
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
			totalWorkingDays++;
			totalWorkingHours += empHours;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: "+ totalWorkingHours);
		} 
		int totalEmpWage = totalWorkingHours*empRatePerHour;
		System.out.println("Total Emp Wage for Company: "+ company+" is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args){
		computeEmpWage("Dmart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 4, 20);
	}
}		