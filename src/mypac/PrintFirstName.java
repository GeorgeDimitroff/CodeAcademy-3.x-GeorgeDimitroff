package mypac;

import java.util.Scanner;

public class PrintFirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        String name1 = "PeTEr";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println("\n" + name1.length());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
    }
}
