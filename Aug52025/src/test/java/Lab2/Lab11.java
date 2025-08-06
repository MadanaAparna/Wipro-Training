package Lab2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lab11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date (YYYY-MM-DD):");
        String input = scanner.nextLine();

        LocalDate enteredDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();

        Period period;
        if (enteredDate.isBefore(currentDate)) {
            period = Period.between(enteredDate, currentDate);
        } else {
            period = Period.between(currentDate, enteredDate);
        }

        System.out.println("Duration: " + period.getYears() + " years, " +
                           period.getMonths() + " months, " +
                           period.getDays() + " days");

        scanner.close();
 

	}

}
