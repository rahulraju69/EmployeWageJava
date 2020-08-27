public class EmployeWage{

        //Constant
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUMBER_OF_WORKINGDAYS=2;

        public static void main(String[] args){
                //Local Variable
                int emp_Hour=0;
                int emp_Wages=0;
                int totalEmployeWage=0;
                for (int day=0; day<NUMBER_OF_WORKINGDAYS; day++ )
                {
                        int randomCheck=(int)(Math.random()*10)%3;
                        switch(randomCheck){
                                case IS_FULL_TIME:
                                        emp_Hour=8;
                                        break;
                                case IS_PART_TIME:
                                        emp_Hour=4;
                                        break;
                                default:
                                        emp_Hour=0;
                        }
                        emp_Wages=emp_Hour*EMP_RATE_PER_HOUR;
                        totalEmployeWage += emp_Wages;
                        System.out.println("Employee Wages : "+ emp_Wages);
                }
                System.out.println("Total Wages : " + totalEmployeWage);
        }
}
