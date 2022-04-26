package Basics;

import java.util.Scanner;

public class weightswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight");
        int weight = sc.nextInt();
        int ch= -1;
        if (weight > 90) {
            ch = 0;
        }
        else if (weight <= 30) {
            ch = 1;
        } else if (weight >= 45 && weight <= 65) {
            ch = 2;
        }

        switch (ch) {
            case 0:
            System.out.println("Fat");
                break;
            case 1:
            System.out.println("Thin");
            break;
            case 2:
            System.out.println("Healthy");
            break;
            default:
            System.out.println("Invalid key");
                break;
        }
    }
}