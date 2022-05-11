package Assignments;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateTime {
    public static void main(String[] args) {

       // "Assignment-1(11-05-2022);
        System.out.println("Current Date is : " + LocalDate.now());
        System.out.println("Current Time is : " + LocalTime.now());
        
        System.out.println("Current Date and Timer is : " + LocalDateTime.now());
    }
}
