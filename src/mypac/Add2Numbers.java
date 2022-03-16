package mypac;

import java.util.Scanner;

public class Add2Numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println("a = 5 \nb = 9 \na + b = " + (a+b));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter 2 numbers you want to add up: ");
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Sum of " + num1 + " and " + num2 + " is equal to: " + (num1+num2));
    }
}
