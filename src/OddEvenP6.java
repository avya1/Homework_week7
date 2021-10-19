import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class OddEvenP6 {
    public static void oddEven(int num)//static method
    {//static area
          if(num%2==0)
          {
              System.out.println("Given number "+num+" is even number");
          }
          else {
              System.out.println("Given number "+num+" is odd number");
          }
 }
    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter any number to check ist even or odd");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        oddEven(n);//calling static method directly
    }
}
