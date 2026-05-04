import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Menstrual Cycle Calculator");

        System.out.print("Enter the date of the first day of your last period in this format (DD-MM-YYYY): ");
        String lastPeriodInText = input.nextLine();

        System.out.print("Enter your cycle length: ");
        int cycleLength = input.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate lastPeriodDate = LocalDate.parse(lastPeriodInText, formatter);

        LocalDate nextPeriodDate = lastPeriodDate.plusDays(cycleLength);


        int ovulationDay = cycleLength - 14;
        LocalDate ovulation = lastPeriodDate.plusDays(ovulationDay);

        LocalDate fertileDateStart = ovulation.minusDays(5);
        LocalDate fertileDateEnd = ovulation;

        LocalDate firstSafeDateStart = lastPeriodDate;
        LocalDate firstSafeDateEnd = fertileDateStart.minusDays(1);

        LocalDate secondSafeDateStart = fertileDateEnd.plusDays(1);
        LocalDate secondSafeDateEnd = nextPeriodDate.minusDays(1);

        System.out.println("");

        System.out.println("Results:");

        System.out.println("");

        System.out.println("Last Period: " + lastPeriodDate.format(formatter));
        System.out.println("Next Period: " + nextPeriodDate.format(formatter));
        System.out.println("Ovulation Date: " + ovulation.format(formatter));

        System.out.println("Fertile Window: " + fertileDateStart.format(formatter) + " to " + fertileDateEnd.format(formatter));

        System.out.println("Safe Dates:");
        System.out.println(firstSafeDateStart.format(formatter) + " to " + firstSafeDateEnd.format(formatter));
        System.out.println(secondSafeDateStart.format(formatter) + " to " + secondSafeDateEnd.format(formatter));






    }
}
