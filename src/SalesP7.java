import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic
 * and then fined this sales
 * Commission Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class SalesP7 {
    public static void sales(float amount)//static method
    {
        //static area
        float sc;
        //nested if else statement to get the sales commission
        if(amount>=50000)
        {
            sc=amount *35/100;
        }else if(amount>=30000)
        {
            sc=amount*20/100;
        }else if(amount>=20000)
        {
            sc=amount*10/100;
        }else if(amount>=10000)
        {
            sc=amount*5/100;
        }else{
            sc=amount*2/100;
        }
        System.out.println("Sales commission  "+sc+" is going to add on basic salary  ");
    }
    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter sales details");
        Scanner sc=new Scanner(System.in);//Scanner class and object is use  take data at run time
        System.out.println("Sales id ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Seller name ");
        String name=sc.nextLine();
        System.out.println("Sales amount ");
        int amount=sc.nextInt();
        System.out.println("Salary ");
        int salary=sc.nextInt();
        sales(amount);//calling static method
        sc.close();

    }
}
