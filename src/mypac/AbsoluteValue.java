package mypac;

import static java.lang.Math.abs;

public class AbsoluteValue {
    public static void main(String[] args) {
        int num1 = -147;
        int num2 = 15;
        int num3 = 0;
        int num4 = 18;
        String tab = "\u0009"; // 'U+0009' Unicode character representing tab space;
        System.out.println("Absolute value of initial number: -147, 15, 0 and 18 is:\n" + abs(num1) + "\t" + abs(num2) + "\t" + abs(num3) + "\t" + abs(num4));
        System.out.println("Absolute value of initial number: -147, 15, 0 and 18 is:\n" + abs(num1) + tab + abs(num2) + tab + abs(num3) + tab + abs(num4));
    }
}
