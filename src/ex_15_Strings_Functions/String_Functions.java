package ex_15_Strings_Functions;

public class String_Functions {
    public static void main (String[] args)
    {
        String greeting = "Hello Word";

        // length of a string can be found with the length() method
        System.out.println("Length of string is:"+greeting.length());

        //To convert length of string into UPPERCASE
        System.out.println(greeting.toUpperCase());

        //To convert length of string into Lowercase
        System.out.println(greeting.toLowerCase());

        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        System.out.println(greeting.indexOf("W"));

        //The + operator can be used between strings to combine them. This is called concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        // You can also use the concat() method to concatenate two strings:
        String firstName1 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName1.concat(lastName2));
// / ////////////////////////////////////////////////////////////////////////////////
//        WARNING!
//        Java uses the + operator for both addition and concatenation.
//        Numbers are added. Strings are concatenated.
//        If you add two numbers, the result will be a number:
        int x = 10;
        int y = 20;
        int z = x + y; // z will be 30 (an integer/number)
        // If you add two strings, the result will be a string concatenation:
        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;  // z1 will be 1020 (a String)
        //If you add a number and a string, the result will be a string concatenation:
        String x2 = "10";
        int y2 = 20;
        String z2 = x2 + y2;  // z2 will be 1020 (a String)
    }
}
