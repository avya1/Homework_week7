import java.util.Scanner;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class NumericStringArrayP17 {
    public static void main(String[] args)//main method
    {
        System.out.println("Enter 5 integer  values for shorting ");
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        //for loop to fet number from user
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        //for loop to short the number
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]<a[j]){
                    int tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }
            }
        }
        //for loop to print the number after shorting
        System.out.println("Number after shorting");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);

        }

        System.out.println("Enter 5 words for shorting");
        String s[]=new String[5];
        //for loop to get input from the user
        for(int i=0;i<5;i++){
            s[i]=sc.nextLine();
        }
        //short the input in alphabetical order
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(s[j].compareTo(s[i])<0)
                {
                    String  tem=s[i];
                    s[i]=s[j];
                    s[j]=tem;
                }
            }
        }
        //for loop to print  alphabetically shorted input
        System.out.println("Values after shorting");
        for(int i=0;i<5;i++){
            System.out.println(s[i]);
        }
        sc.close();
    }
}
