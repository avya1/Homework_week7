
import java.util.Scanner;

/**Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 *
 */
public class CityP8 {
    public static void getCity(String ch)//static method
    {
        //static area
        ch=ch.toLowerCase();
        String k="a",l="b",m="c",n="d",o="e",p="f";
        String a="Ahmedabad",b="Bombay",c="Chennai",d="Delhi",e="Erode",f="Faridabad";
        //using if else to get city name according to the entered character
        if(ch.equals(k)){
            System.out.println("City name which is starts with A is   "+a);
        }else if(ch.equals(l)){
            System.out.println("City name which is starts with B is  "+b);
        }else if(ch.equals(m)){
            System.out.println("City name which is starts with C is "+c);
        }else if(ch.equals(n)){
            System.out.println("City name which is starts with D is "+d);
        }else if(ch.equals(o)){
            System.out.println("City name which is starts with E is  "+e);
        }else if(ch.equals(p)){
            System.out.println("City name which is starts with F is "+f);
        }else
        {
            System.out.println("invalid entry");
        }

    }
    public static void main(String[] args)//main method
    {
        System.out.println("Enter alphabet to get related city");
        Scanner sc=new Scanner(System.in);
        String  c=sc.nextLine();
        sc.close();//closing statement for Scanner
        getCity(c);//calling static method directly



    }
}
