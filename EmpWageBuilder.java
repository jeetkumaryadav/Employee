public class EmpWageBuilder{
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		
		 int isFullTime = 1;
		 int empRatePerHour = 20;
		
		int empHours = 0;
		int empWage  = 0;
		
		double empCheck = Math.floor(Math.random()*10) % 2;
		if(empCheck == isFullTime)
			empHours = 8;
		
		empWage = empHours * empRatePerHour;
		System.out.println("Emp Wage: " + empWage);

	}
}