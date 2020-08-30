public class EmployeWage
{
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorking;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public EmployeWage(String company, int empRatePerHour,int numberOfWoringDays, int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmployeWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Total Emp Wage for Company: " +company+" is: "+totalEmpWage;
	}
}

public class EmployeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmployeWage[] companyEmployeWageArray;

	private EmployeWage() {
		companyEmployeWageArray = new CompanyEmployewage[5];
	}

	private void addCompanyEmployeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth ) {

		companyEmployeWageArray[numOfCompany] = new CompanyEmployeWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}

	private void computeEmployeWage()
	{
		for( int i=0; i<numOfCompany; i++ )
		{
			companyEmployeWageArray[i].setTotalEmployeWage(this.computeEmployeWage(companyEmployeWageArray[i]));
			System.out.println(companyEmployeWageArray[i]);
		}
	}

	private int computeEmployeWage(CompanyEmployeWage companyEmployeWage) {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
      		//Computation
      System.out.println("Welcome to Employee Wage Computation");
      while (totalEmpHrs <= companyEmployeWage.maxHoursPerMonth && totalWorkingDays < companyEmployeWage.numOfWorkingDays) {
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         switch(empCheck) {
            case IS_PART_TIME:
               empHrs = 8;
               break;
            case IS_FULL_TIME:
               empHrs = 12;
               break;
            default:
               empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day: " + totalWorkingDays + "Employee Hours: " + empHrs);
      }
      return totalEmpHrs * companyEmployeWage.empRatePerHours;
   }

	public static void main(String[] args) {
		empWageComputation empWagejava = new empWageComputation();
		empWagejava.addCompanyEmpWage("DMart: ", 20, 20, 100);
		empWagejava.addCompanyEmpWage("Reliance: ", 10, 4, 50);
		empWagejava.computeEmpWage();
	}
}
