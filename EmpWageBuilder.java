public class EmpWageBuilder {
        public static final int IS_PART_TIME = 2;
        public static final int IS_FULL_TIME = 1;

        private final String company;
        private final int empRate;
        private final int noOfDays;
        private final int maxHrs;
        private int totalEmpWage;

        public EmpWageBuilder(String company, int empRate, int noOfDays, int maxHrs) {

            this.company = company;
            this.empRate = empRate;
            this.noOfDays = noOfDays;
            this.maxHrs = maxHrs;
        }

        public void computeEmpWage() {
            // Variables
            int empHours = 0;
            int totalWorkingHours = 0;
            int totalWorkingDays = 0;

            // Computation
            while (totalWorkingHours <= maxHrs && totalWorkingDays < noOfDays) {

                double attendence = Math.floor(Math.random() * 10) % 3;
                switch ((int) attendence) {
                    case IS_FULL_TIME:
                        empHours = 8;
                        break;
                    case IS_PART_TIME:
                        empHours = 4;
                        break;
                    default:
                        empHours = 0;
                }

                totalWorkingDays++;
                totalWorkingHours += empHours;
                System.out.println("Day#:" + totalWorkingDays + " Emp Hr:" + totalWorkingHours);
            }

            totalEmpWage = totalWorkingHours * empRate;
        }

        @Override
        public String toString() {
            return ("Total Emp Wage for Company " + company + " is: " + totalEmpWage);

        }

        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program");
            EmpWageBuilder DMart = new EmpWageBuilder("D-Mart", 20, 2, 10);
            EmpWageBuilder reliance = new EmpWageBuilder("Reliance", 10, 4, 20);
            DMart.computeEmpWage();
            System.out.println(DMart);
            reliance.computeEmpWage();
            System.out.println(reliance);
        }

    }
