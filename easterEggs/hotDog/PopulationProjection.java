import java.util.Scanner;
class PopulationProjection {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int years = inputScanner.nextInt();
        int population = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;
        int births = secondsPerYear / 7;
        int deaths = secondsPerYear / 13;
        int immigrants = secondsPerYear / 45;
        int yearlyChange = births + immigrants - deaths;
        int result = population + yearlyChange * years;
        System.out.println(result);
    }
}