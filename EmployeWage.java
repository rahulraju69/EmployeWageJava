public class employeWage{
        public static void main(String[] args){
                //Constant
                int IS_FULL_TIME=1;
                int IS_PART_TIME=2;
                int EMP_HOUR=0;
                int EMP_WAGES=0;

                //Variables
                int emp_rate_per_hour=20;

                int randomCheck=(int)(Math.random()*10)%3;
                System.out.println(randomCheck);
                if(IS_FULL_TIME == randomCheck){
                        EMP_HOUR=8;
                }else if(IS_PART_TIME == 2 ){
                        EMP_HOUR=4;
                }
                EMP_WAGES=EMP_HOUR*emp_rate_per_hour;
                System.out.print("Employee wages: "+EMP_WAGES);
        }

}
