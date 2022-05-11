package Assignments;

public class PrimeNumbers1_50 {
    public static void main(String[] args) {
        //Assignment-7;

    for(int n=1; n<=50 ;n++) {
        int factor = 0;
        for (int i = 1; i<=50 ; i++) {
            if (n % i == 0) {
                factor++;
            }
        }
        if (factor == 2) {
            System.out.println(n);
        }
    }
    }
}
