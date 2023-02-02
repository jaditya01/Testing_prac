package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DateOfDays {

    private static LocalDate calculateHundredDaysFromNow(LocalDate today) {
        return today.plusDays(100);
    }

    public static void main(String[] args) {
        LocalDate today =  LocalDate.now();
        System.out.println(calculateHundredDaysFromNow(today));
    }
}
