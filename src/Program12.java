import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class Program12 {
    public static void getResult(char ch)//static method
    {
        //nested if else statement
        if(Character.isAlphabetic(ch))//.isAlphabetic()is pre define method in java to determine character is an alphabet  or not
        {
            System.out.println("User entered "+ch+" is  an Alphabet");
        }else if(Character.isDigit(ch))//.isDigit(char ch)is pre define method in java to determine character is digit or not
        {
            System.out.println("User entered "+ch+" is  a Number");
        }else{
            System.out.println("User entered "+ch+" is  a Symbol");
        }
    }
    public static void main(String[] args)//main method
    {
        //static area
        System.out.println("Enter any value from keyboard and get the respective result");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        getResult(c);
        sc.close();

    }
}
