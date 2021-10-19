import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class PositiveNegativeP16 {
    public static void check(int num)//static method
    {
        //using if else to check number is positive negative or zero
        if(num>0)
        {
            System.out.println("Entered number is POSITIVE");
        }else if(num<0)
        {
            System.out.println("Entered number is NEGATIVE");
        }
        else {
            System.out.println("Entered number is ZERO");
        }
    }


    public static void main(String[] args) //main method
    {
        System.out.println("Enter  any number to check ");
        Scanner sc=new Scanner(System.in);//using Scanner  class to get input from user
        int n= sc.nextInt();
        sc.close();
        check(n);//calling static method
    }
}
