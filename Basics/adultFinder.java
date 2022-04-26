package Basics;

import java.util.Scanner;

public class adultFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        System.out.println("Enter a age");
        int age = sc.nextInt();
         if (age >= 18) {
             System.out.println("Name is " + name + " age is " + age + " is an adult");
         } else {
             System.out.println("Name is " + name + " age is " + age + "is not an adult");
         }
    }
}
