import java.util.Scanner;
class ByteConverter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double bytes = inputScanner.nextDouble();
        double kilobytes = bytes / 1024;
        double megabytes = kilobytes / 1024;
        double gigabytes = megabytes / 1024;
        System.out.println(kilobytes);
        System.out.println(megabytes);
        System.out.println(gigabytes);
    }
}