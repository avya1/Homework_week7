import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and
 * it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class DaysInWeekP13 {
    public void getDay(int n)//instance method
    {
        //instance area
        //using switch case statement to get day
        switch (n) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;

            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");

                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week Contains 1 to 7 days");

        }
    }

    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter any number to get respective week ");
        Scanner sc = new Scanner(System.in);//Using Scanner class to get input
        int a = sc.nextInt();
        sc.close();
        DaysInWeekP13 obj = new DaysInWeekP13();//object creation
        obj.getDay(a);//calling instance method with the help of object in static area

    }
}
