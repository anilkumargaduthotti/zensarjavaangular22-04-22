package Basics;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        // n % 2 ==0 (Even)
        // n % 2 not  ==0 (odd)

        if(n % 2 == 0) {
            System.out.println(n + " is Even Number");
        }
        else {
            System.out.println(n + "is Odd Number");
        }
    }
}
