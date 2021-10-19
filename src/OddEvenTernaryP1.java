import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class OddEvenTernaryP1 {
    public void evenOdd(int num) //instance method to find number is even or odd
    {
        //instance area
        String result;
        result = num % 2 == 0 ? "Even" : "Odd";//ternary operator used to find even odd
        System.out.println("The given number " + num + " is " + result);
    }

    public static void main(String[] args)//main method
    {
        System.out.println("Enter number to check even or odd: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        OddEvenTernaryP1 obj = new OddEvenTernaryP1();//object creation
        obj.evenOdd(a);
    }
}

