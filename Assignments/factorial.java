package Assignments;

public class factorial {
    public static void main(String[] args) {
        //Assignment -6;
        
        int n = 5;
        int result = 1;
        
       /* Method -1 ->
       for (int i = n; i>0 ; i--) {
            result *= i;
        }
        System.out.println("Factorial of " + n + " is " + result);*/

        /*method -2 ->*/
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + n + " is " + result);
    }
}
