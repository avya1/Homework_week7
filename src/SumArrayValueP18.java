import java.util.Scanner;

/**
 * Write a Java program to sum values of an array.
 */
public class SumArrayValueP18 {
    public static void main(String[] args) //main method
    {

        System.out.println("Enter 10 integer  values to get sum of them ");
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        //for loop to get integer values form user
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int sum=0;
        //for loop to sum of all entered values from user
        for(int i=0;i<10;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of all the integer values  of an array is "+sum);
        sc.close();
    }
}
