import java.util.Scanner;

/**
 * 10. Write a java program to input any two number and ask user to enter
 * their symbol (+, -, /, *)find addition, Subtraction, multiplication
 * and division according to their symbol (using if else)
 */
public class ChooseSymbolP10 {
    public static void calculation(int a, int b, char c)//static method
    {
        //nested if else statement is used
        if (c == '+') {
            System.out.println("Addition of given two number is " + (a + b));
        } else if (c == '-') {
            System.out.println("Subtraction of given two number is " + (a - b));
        } else if (c == '*') {
            System.out.println("Multiplication of given two number is " + (a * b));
        } else if (c == '/') {
            System.out.println("Division  of given two number is " + (a / b));
        } else {
            System.out.println("Invalid Entry");
        }
    }
    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter first number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        System.out.println("Enter any  of  these + ,-,/,* symbol to get calculation accordingly");
        char c = sc.next().charAt(0);
        sc.close();
        calculation(a, b, c);//calling static method directly
    }
}
