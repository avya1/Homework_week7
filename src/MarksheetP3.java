import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                             |
 * |        Mark Sheet           |
 * |_____________________________|
 * |   Name        :     Jay     |
 * |   Roll No     :     08      |
 * |_____________________________|
 * |   Subjects    :     Marks   |
 * |_____________________________|
 * |    Math       :      98     |
 * |    Science    :      90     |
 * |    English    :      85     |
 * |_____________________________|
 * |   Total       :     273     |
 * |_____________________________|
 * |   Percentage  :     91.0    |
 * |   Result      :     Pass    |
 * |   Grade       :      A+     |
 * |_____________________________|
 */
public class MarksheetP3 {
    int total = 300;
    float per,got;
    String result,grade;
    public void getDetails(String name,int rn,int m, int s, int e) {
        got = m + s + e;//equation to get total obtain marks by student
        per = got / total * 100;//equation to get percentage
        //this if statement is to check the range of marks which is between 0 and 100
        if (m >= 0 && m <= 100 && s >= 0 && s <= 100 && e >= 0 && e <= 100)
        {
            if(m<35||s<35||e<35){
                result="Fail";
                grade=" ";
            }else
            {
                result="Pass";
            }
            //this nested if else is to give grade of student
            if (per >= 35 && per >= 80) {
                grade = "A+";

            } else if (per >= 35 && per >= 60) {
                grade = "A";

            } else if (per >= 35 && per >= 50) {
                grade = "B";

            } else if (per >= 35) {
                grade= "C";

            }
        //print statement is to print market sheet  in proper format
        System.out.println("---------------------------------");
        System.out.println("|                                |");
        System.out.println("|           Mark Sheet           |");
        System.out.println("|--------------------------------|");
        System.out.println("|    Name      :  "+name+"            |");
        System.out.println("|    RollNo    :  "+rn+"              |");
        System.out.println("|--------------------------------|");
        System.out.println("|    Subject   :  Marks          |");
        System.out.println("|    Maths     :  "+m+"             |");
        System.out.println("|    Science   :  "+s+"             |");
        System.out.println("|    English   :  "+e+"             |");
        System.out.println("|--------------------------------|");
        System.out.println("|    Total     : "+got+"           |");
        System.out.println("|--------------------------------|");
        System.out.println("|    Percentage: "+per+"            |");
        System.out.println("|    Result    : "+result+"            |");
        System.out.println("|    Grade     :  "+grade+"             |");
        System.out.println("|                                |");
        System.out.println("----------------------------------");
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }
    }

    public static void main(String[] args) //main method
    {
        //static area
        System.out.println("Enter student details:");
        Scanner sc = new Scanner(System.in);//object creation for Scanner class
        System.out.println("Name:");
        String name = sc.nextLine();//getting input with the help of Scanner class object
        System.out.println("Roll Number:");
        int rn = sc.nextInt();
        System.out.println("Marks in following Subjects =");
        System.out.println("Maths:");
        int m = sc.nextInt();
        System.out.println("Science:");
        int s = sc.nextInt();
        System.out.println("English:");
        int e = sc.nextInt();
        sc.close();
        MarksheetP3 obj = new MarksheetP3();//object creation for the MarkSheet class
        obj.getDetails(name,rn,m, s, e);//calling instance method with the help of object
    }
}
