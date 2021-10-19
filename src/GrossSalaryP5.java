import java.util.Scanner;

/**5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 *HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20%
 *Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * |        Salary Slip           |
 * |______________________________|
 * | Employee Id      : 2564      |
 * | Employee Name    : Jay       |
 * |______________________________|
 * | Basic Salary     : 25000.0   |
 * | HRA 10%          : 2500.0    |
 * | TA 8%            : 2250.0    |
 * | DA 9%            : 2000.0    |
 * | PF - 20&         : 5000.0    |
 * |______________________________|
 * | Gross Salary     : 26750.0   |
 * |==============================|
 */
public class GrossSalaryP5 {
    public void grossSalary(int id,String name,float bs)//instance method
    {
        //logic to get basic salary of employee
        float har,ta,da,pf,gs;
        har=bs*10/100;
        ta=bs*9/100;
        da=bs*8/100;
        pf=bs*20/100;
        gs=(bs+har+ta+da)-pf;
        System.out.println("------------------------");
        System.out.println("|     Salary Slip       |");
        System.out.println("|_______________________|");
        System.out.println("|Employee Id   :"+id+"    |");
        System.out.println("|Employee Name :"+name+"     |");
        System.out.println("|_______________________|");
        System.out.println("|Basic Salary  :"+bs+" |");
        System.out.println("|HAR 10%       :"+har+"  |");
        System.out.println("|TA  8%        :"+ta+"  |");
        System.out.println("|DA  9%        :"+da+"  |");
        System.out.println("|PF  20%       :"+pf+"  |");
        System.out.println("|_______________________|");
        System.out.println("|Gross Salary  :"+gs+" |");
        System.out.println("|=======================|");


    }
    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter Employee details:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee ID  ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Employee name  ");
        String name=sc.nextLine();
        System.out.println("Employee basic salary  ");
        int bs=sc.nextInt();
        sc.close();
        GrossSalaryP5 obj=new GrossSalaryP5();//object creation for the class GrossSalary
        obj.grossSalary(id,name,bs);//calling static method with the help of object




    }
}
