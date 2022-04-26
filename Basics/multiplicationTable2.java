package Basics;

import java.util.Scanner;

public class multiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table Number");
        int n = sc.nextInt();
        System.out.println("Enter Range");
        int range = sc.nextInt();
        int i = 1;
        while(i<=range)
        {
            System.out.println(n + "*" + i + " = " + n*i);
            i++;
        }
        sc.close();
    }
}
