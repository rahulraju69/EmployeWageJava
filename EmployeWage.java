public class EmployeWage{
		public static final int IsFullTime=1;
        	public static final int IsPartTime=2;

		private final String company;
		private final int empRatePerHrs;
		private final int numberOfWorkingDays;
		private final int maxHrsPerMonth;
		public int totalEmpWage;
     public employeeWage(String company, int empRatePerHrs,int numberOfWorkingDays,int maxHrsPerMonth) {
	this.company =company;
	this.empRatePerHrs=empRatePerHrs;
	this.numberOfWorkingDays=numberOfWorkingDays;
	this.maxHrsPerMonth=maxHrsPerMonth;
}
	public void computeEmpWage() {

	System.out.println("Welcome to Employee Wage..");

	int totalEmpHrs=0;
	int empHrs=0;
	int totalWorkingDays=0;

while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numberOfWorkingDays) {
	   totalWorkingDays++;
	   int empcheck=((int)Math.floor(Math.random() * 10))%3;
		switch (( empcheck ))
		 {
		     case IsFullTime:
			empHrs=8;
			break;
		     case IsPartTime:
			empHrs=4;
			break;
		     default:
			empHrs=0;
		 }

		totalEmpHrs+=empHrs;
		System.out.println("Day: " + totalWorkingDays + "EmpHrs: " + empHrs);

	}
	     totalEmpWage = totalEmpHrs * empRatePerHrs;
}
	    public String toString() {
		   return "Total Emp Wage For Company:" +company+ " is: " +totalEmpWage ;
	}
	     public static void main (String[] args) {
		    employeeWage google = new employeeWage ("google",20,2,10);
		    employeeWage tcs = new employeeWage ("tcs",20,2,10);
		    google.computeEmpWage();
		    System.out.println(google);
		    tcs.computeEmpWage();
		    System.out.println(tcs);
	}
}
