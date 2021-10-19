import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class AvgArrayElementP19 {
    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter 10 integer values to  get average of them ");
        Scanner sc = new Scanner(System.in);
        double a[] = new double[10];
        //for loop to get input from user
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextDouble();
        }
        double sum=0;
        double avg=0;
        //for loop to get sum of all input values
        for(int i=0;i<10;i++){
            sum=sum+a[i];
        }
        avg=sum/10;//average of all input values
        System.out.println("Average of all the element of an array is "+avg);
        sc.close();
    }
    }


