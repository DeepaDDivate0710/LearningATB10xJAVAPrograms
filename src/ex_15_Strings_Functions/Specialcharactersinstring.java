package ex_15_Strings_Functions;

public class Specialcharactersinstring {
    public static void main (String[] args) {

       /* Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
              String txt = "We are the so-called "Vikings" from the north.";
        The solution to avoid this problem, is to use the backslash escape character. */



      /*  The backslash (\) escape character turns special characters into string characters:

          Escape character	             Result	                        Description
    1.        \'	                        '	                        Single quote
    2.        \"	                        "	                        Double quote
    3.        \\	                        \	                        Backslash

         */
        //Example 1:
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);


        //Example2 :
        String txt2 = "It\'s alright.";
        System.out.println(txt2);

        //Example 3
        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt3);

    }
}
