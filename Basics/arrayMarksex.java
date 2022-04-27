package Basics;

public class arrayMarksex {
    public static void main(String[] args) {
        
        int[] arr = {92,91,90,94,93,96,95,99,97,98};
        // max, min marks
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        System.out.println("Minimun " + min + " \nMaximum " + max);

        //average marks
        int avg = 0;
         for (int i : arr){
             avg=(avg+i);
         }
         System.out.println("Average = " + avg/10);
    }

    private static void SortOrder(int[] arr) {
    }
}
