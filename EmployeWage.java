public class EmployeWage {
	public static final int IsPresent=1;
       	public static final int IsPartTime=2;
        public static final int empRatePerHrs=20;
	public static final int NumberofWorkingDays=20;
	public static final int MaxHrsInMonth=100; //Usecase6 - total working hrs or days reached for month

	public static int computeEmpWage() //UseCase7 - Refactor code with class method and variables
	{

	System.out.println("Welcome to Employee Wage computation Problem");
	//UseCase1 - Check employee present or absent
	int empHrs=0;
	int empwage=0;
	int TotalWorkingDays=0;
	int TotalEmpHrs=0;
	while(TotalEmpHrs <= MaxHrsInMonth && TotalWorkingDays < NumberofWorkingDays)
	{
		TotalWorkingDays++;
		int empcheck=((int)Math.floor(Math.random() * 10))%3;
		switch ((empcheck)) //UseCase4- Switch case
		{
			case IsPresent:
				empHrs=8;
				break;
			case IsPartTime:  //Usecase3-part time
				empHrs=4;
				break;
			default:
				empHrs=0;
		}
		TotalEmpHrs+=empHrs;
		System.out.println("days: "+TotalWorkingDays + " Employee hrs: "+empHrs);
		//empwage=empHrs*empRatePerHrs;
		//System.out.println("Employee Daily Wage= " +empwage); //Usecase2-daily wage
		//TotalEmpWage+=empwage; //UseCase5- calculate wages for month
	}
		int TotalEmpWage=TotalEmpHrs *empRatePerHrs;
		System.out.println("Total employee wage: "+TotalEmpWage);
		return TotalEmpWage;
	}
		public static void main(String[] args) {
			computeEmpWage();
		}

}
