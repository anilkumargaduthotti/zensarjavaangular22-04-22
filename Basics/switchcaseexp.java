package Basics;

public class switchcaseexp {
    public static void main(String[] args) {
        int i =3;
        //if i = 0 hello, 1 hello world, 2 AnilKumar, 3 hello Again
        switch (i) {
            case 0:
                System.out.println("Hello");
                break;
            case 1:
                System.out.println("Hello World");
                break;
            case 2:
                System.out.println("AnilKumar");
                break;
            case 3:
                System.out.println("Hello Again");
                break;
                default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
