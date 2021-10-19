import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007)
 * and find out if it is leap year or not?
 */
public class LeapYearP2 {
        public void LeapYearCalculator(int y)//instance method
        {//instance area
            //logic to check the year is leap year or not using if else statement
            if(y%4==0 || y%100!=0 && y%400==0)
            {
                System.out.println("The entered year "+y+" is a leap year");
            }
            else{
                System.out.println("The entered year "+y+" is not a leap year ");
            }
        }
    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter any year to check leap year:");
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        sc.close();
        LeapYearP2 ly=new LeapYearP2();
        ly.LeapYearCalculator(year);//calling instance method
    }
}
