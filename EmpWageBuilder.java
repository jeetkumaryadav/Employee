public class EmpWageBuilder{
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		
		 int isFullTime = 2;
		 int isPartTime = 1;
		 int empRatePerHour = 20;
		
		int empHours = 0;
		int empWage  = 0;
		
		double empCheck = Math.floor(Math.random()*10) % 3;
		if(empCheck == isFullTime)
			empHours = 8;
		else if(empCheck == isPartTime)
			empHours = 4;
		
		empWage = empHours * empRatePerHour;
		System.out.println("Emp Wage: " + empWage);

	}
}