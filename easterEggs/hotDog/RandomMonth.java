import java.util.Scanner;

public class RandomMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = (int)(Math.random() * 12) + 1;
        System.out.println(month);
    }
}