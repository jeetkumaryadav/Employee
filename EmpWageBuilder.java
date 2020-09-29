public class EmpWageBuilder{

	public static final int isFullTime = 2;
	public static final int isPartTime = 1;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxWorkingHours;
	private int totalEmpWage;

	public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxWorkingHours){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}

	public void computeEmpWage(){
		//Variables
		int empHours = 0; int totalWorkingHours = 0; int totalWorkingDays = 0;
		//Computation
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
		totalEmpWage = totalWorkingHours*empRatePerHour;
	}

	@Override
	public String toString(){
		return "Total Emp Wage for Company: "+ company+" is: " + totalEmpWage;
	}

	public static void main(String[] args){
		EmpWageBuilder Dmart = new EmpWageBuilder("Dmart", 20, 2, 10);
		EmpWageBuilder Reliance = new EmpWageBuilder("Reliance", 10, 4, 20);
		Dmart.computeEmpWage();
		System.out.println(Dmart);
		Reliance.computeEmpWage();
		System.out.println(Reliance);
	}
}