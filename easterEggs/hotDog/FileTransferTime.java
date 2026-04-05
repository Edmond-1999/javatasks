import java.util.Scanner;

public class FileTransferTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file size: ");
        double fileSize = input.nextDouble();
        System.out.print("Enter speed: ");
        double speed = input.nextDouble();
        double time = fileSize / speed;
        System.out.println(time);
    }
}