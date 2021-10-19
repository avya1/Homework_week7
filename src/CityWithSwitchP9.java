import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 * using switch statement
 */
public class CityWithSwitchP9 {
     static void getCity(char ch)//static method
     {
         //static area
         //using switch case statement to city name according to entered character
         switch (ch) {
             case 'a':
                 System.out.println("City name which is starts with a is  Ahmedabad");
                 break;
             case 'b':
                 System.out.println("City name which is starts with b is  Bombay ");
                 break;
             case 'c':
                 System.out.println("City name which is starts with c is  Chennai");
                 break;
             case 'd':
                 System.out.println("City name which is starts with d is  Delhi");
                 break;
             case 'e':
                 System.out.println("City name which is starts with  e is Erode ");
                 break;
             case 'f':
                 System.out.println("City name which is starts with f is Faridabad ");
                 break;
             default:
                 System.out.println("Invalid entry please enter alphabet in small latter");
         }
     }
     public static void main(String[] args) //main method
     {
         //static area
        System.out.println("Enter alphabet to get related city");
        Scanner sc=new Scanner(System.in);
        char  c=sc.next().charAt(0);
        sc.close();//closing statement for Scanner
        getCity(c);//calling static method directly
    }

}


