import java.util.Random;

public class RainbowColourDisplay {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(7) + 1;

        if (randomNumber == 1) {
            System.out.println("Violet");
        } else if (randomNumber == 2) {
            System.out.println("Indigo");
        } else if (randomNumber == 3) {
            System.out.println("Blue");
        } else if (randomNumber == 4) {
            System.out.println("Green");
        } else if (randomNumber == 5) {
            System.out.println("Yellow");
        } else if (randomNumber == 6) {
            System.out.println("Orange");
        } else {
            System.out.println("Red");
        }
    }
}
