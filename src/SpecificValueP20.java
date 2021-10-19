import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class SpecificValueP20 {
    public static void main(String[] args)//main method
    {
        //static area
        int[] list = {1, 12, 3, 15, 5,18,7,8,16,10,11,9,17,14,4};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number between 1 to 20 to check its in list or not");
        int a=sc.nextInt();
        boolean b = false;
        //for loop to check given number is in list or not
        for (int n : list) {
            if (n == a) {
                b = true;
                break;
            }
        }
        if(b)
            System.out.println(" This number is  in list.");
        else
            System.out.println(" This  number is not in the list try another number between range.");
        sc.close();
    }
}
