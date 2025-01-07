
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AdvanceAgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth day (1-31):");
        int birthDay = sc.nextInt();
        System.out.println("Enter your birth month (1-12):");
        int birthMonth = sc.nextInt();
        System.out.println("Enter your birth year:");
        int birthYear = sc.nextInt();
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        // create the localDate object for the birth date
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        // check if the birth date is valid
        if (birthDate.isAfter(currentDate)) {
            System.out.println("Error: Birth date cannot be earlier than current date");
        } else {
            // calculate the age
            Period age = Period.between(birthDate, currentDate);
            System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and "
                    + age.getDays() + " days old.");
        }
        sc.close();
    }
}
