public class CompanyEmpWage{

    public final String company;
    public final int empRate;
    public final int numOfDays;
    public final int maxHrs;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int empRate, int numOfDays, int maxHrs){
        this.company=company;
        this.empRate=empRate;
        this.numOfDays=numOfDays;
        this.maxHrs=maxHrs;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }

    @Override
    public String toString(){
        return "Total Emp Wage for Comapny: "+company+" is: " +totalEmpWage;
    }
}