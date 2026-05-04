public class Conversion {

    public static double mileToKilometer(double miles) {
        return miles * 1.609;
    }

    public static double kilometerToMile(double kilometers) {
        return kilometers / 1.609;
    }

    public static void main(String[] args) {
        double miles = 10;
        double kilometers = mileToKilometer(miles);
        System.out.println(miles + " miles = " + kilometers + " kilometers");

        kilometers = 16.09;
        miles = kilometerToMile(kilometers);
        System.out.println(kilometers + " kilometers = " + miles + " miles");
    }
}
