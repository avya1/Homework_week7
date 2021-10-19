/**
 * 14. Person
 * Write a class with the name Person. The class needs three fields (instance variables)
 * with the names firstName, lastName of type String and age of type int. Write the
 * following methods (instance methods):
 * Method named getFirstName without any parameters, it needs to return the value of the firstName field.
 * *Method named getLastName without any parameters, it needs to return the value of the lastName field. *Method named getAge without any parameters, it needs to return the value of the age field.
 * *Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
 * *Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
 * *Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 * *Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
 * *Method named getFullName without any parameters, it needs to return the full name of the person
 * *Method named getFullName without any parameters, it needs to return the full name of the person.
 * *In case both firstName and lastName fields are empty, Strings return an empty String.
 * *In case firstName is an empty String, return firstName.
 * *In case lastName is an empty String, return lastName.
 * To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true
 * if the String is empty or in other words,when the String does not contain any characters.
 * TEST EXAMPLE TEST CODE: (Write below code in to main method then check out put)
 * Person person = new Person();
 * person.setFirstName(""); // firstName is set to empty string
 * person.setLastName(""); // lastName is set to empty string
 * person.setAge(10);
 * System.out.println("fullName= " + person.getFullName());
 * System.out.println("teen= " + person.isTeen());
 * person.setFirstName("John");// firstName is set to John
 * person.setAge(18);
 * System.out.println("fullName= " + person.getFullName());
 * System.out.println("teen= " + person.isTeen());
 * person.setLastName("Smith"); // lastName is set to Smith
 * System.out.println("fullName= " + person.getFullName());
 * OUTPUT
 * fullName=
 * teen= false
 * fullName= John
 * teen= true
 * fullName= John Smith
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */
public class Person {
    int age;
    String firstName, lastName;
    public String getFirstName(String fstNm)//instance method with return type with parameter
    {

        return fstNm;
    }
    public String getLastName(String lstNm) //instance method with return type with parameter
    {

        return lstNm;
    }
    public int getAge(int a) ////instance method with return type with parameter
    {

        return a;
    }
    public void setFirstName(String f) //instance method no return type with parameter
    {

        firstName = f;
    }
    public void setLastName(String l)//instance method no return type with parameter
    {
        lastName = l;
    }

    public void setAge(int b)//instance method no return type with parameter
    {
        if (age < 0 && age > 100) {
            age = 0;
        }
        age = b;
    }

    public boolean isTeen() //instance method with return type no parameter
    {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;

    }

    public String getFullName()//instance method with return type no parameter
    {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";

        } else if (firstName.isEmpty()) {
            return firstName;
        } else if (lastName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " "+lastName;

        }
    }

    public static void main(String[] args) //main method
    {
        Person person = new Person();
        person.setFirstName("");//first name is set to empty string
        person.setLastName("");//last name is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");//first name is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");//last name is set to smith
        System.out.println("fullName= " + person.getFullName());


    }


}
