package ex_02_Java_Basic;

public class Multiplication_Task_printf_withoutloop {
    public static void main(String[] args) {
        int a = 9;

        System.out.printf("Table of %d without loop%n", a); // This method is used to print formatted output in Java.
       // %d → Placeholder for an integer (a).

        System.out.printf("%d × 1 = %2d%n", a, a * 1); //%2d → A placeholder for an integer (a * 1) with a minimum width of 2 characters (right-aligned).
        System.out.printf("%d × 2 = %2d%n", a, a * 2);
        System.out.printf("%d × 3 = %2d%n", a, a * 3);
        System.out.printf("%d × 4 = %2d%n", a, a * 4);
        System.out.printf("%d × 5 = %2d%n", a, a * 5);
        System.out.printf("%d × 6 = %2d%n", a, a * 6);
        System.out.printf("%d × 7 = %2d%n", a, a * 7);
        System.out.printf("%d × 8 = %2d%n", a, a * 8);
        System.out.printf("%d × 9 = %2d%n", a, a * 9);
        System.out.printf("%d × 10 = %2d%n", a, a * 10);



    }
}
