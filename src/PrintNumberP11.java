/**
 * Write a java program to print the numbers between 1 - 100 which can
 * be divided by 3 and 5 separately.
 **/
public class PrintNumberP11 {

    public void print() //instance method
    {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println("Number which is divisible by 5 ");
        for (int j = 1; j <= 100; j++) {
            if (j % 5 == 0) {
                System.out.print(j + ",");
            }

        }

    }


    public static void main(String[] args) //main method
    {
        System.out.println("Number which is divisible by 3 is ");
        PrintNumberP11 obj = new PrintNumberP11();//object creation
        obj.print();//calling instance method in static area with the help of object


    }
}
