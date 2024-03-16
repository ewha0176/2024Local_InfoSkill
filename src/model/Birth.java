package model;

import java.time.LocalDate;

public class Birth {
    public static int calculateAge(String birthDate) {
        LocalDate today = LocalDate.now();
        int birthYear = Integer.parseInt(birthDate.substring(0, 4));
        int birthMonth = Integer.parseInt(birthDate.substring(4, 6));
        int birthDay = Integer.parseInt(birthDate.substring(6, 8));
        
        int age = today.getYear() - birthYear;
        if (today.getMonthValue() < birthMonth || (today.getMonthValue() == birthMonth && today.getDayOfMonth() < birthDay)) {
            age--;
        }
        return age;
    }
}