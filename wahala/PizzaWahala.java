import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = input.nextInt();
        input.nextLine();

        System.out.print("Enter pizza type (Sapa, Small, Big, Odogwu): ");
        String type = input.nextLine();

        int slicesPerBox = 0;
        int pricePerBox = 0;

        switch (type.toLowerCase()) {
            case "sapa":
                slicesPerBox = 4;
                pricePerBox = 2500;
                break;
            case "small":
                slicesPerBox = 6;
                pricePerBox = 2900;
                break;
            case "big":
                slicesPerBox = 8;
                pricePerBox = 4000;
                break;
            case "odogwu":
                slicesPerBox = 12;
                pricePerBox = 5200;
                break;
            default:
                System.out.println("Invalid pizza type");
                return;
        }

        int boxes = (people + slicesPerBox - 1) / slicesPerBox;
        int totalSlices = boxes * slicesPerBox;
        int leftover = totalSlices - people;
        int totalPrice = boxes * pricePerBox;

        System.out.println("Boxes needed: " + boxes);
        System.out.println("Leftover slices: " + leftover);
        System.out.println("Total price: " + totalPrice);
    }
}






