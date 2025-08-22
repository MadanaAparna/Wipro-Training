package Lab2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

public class Lab14 {
	public static void printDateTimeByZone(String zoneId) {
        Set<String> availableZones = ZoneId.getAvailableZoneIds();

        if (availableZones.contains(zoneId)) {
            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

            System.out.println("Current date and time in " + zoneId + ": " +
                    zonedDateTime.format(formatter));
        } else {
            System.out.println("Invalid Zone ID: " + zoneId);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Zone ID (e.g. America/New_York, Europe/London, Asia/Tokyo):");
        String inputZone = scanner.nextLine();

        printDateTimeByZone(inputZone);

        scanner.close();
    }

}
