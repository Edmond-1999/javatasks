public class PizzaWahala {

    public static int pizzaPrice(int numberOfPeople, String typeOfPizza) {


        int slicesPerBox = 0;
        int pricePerBox = 0;

        switch (typeOfPizza.toLowerCase()) {
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
        }

        int boxes = (numberOfPeople + slicesPerBox - 1) / slicesPerBox;
//        int totalSlices = boxes * slicesPerBox;
//        int leftover = totalSlices - numberOfPeople;
        int totalPrice = boxes * pricePerBox;

        System.out.println("Boxes needed: " + boxes);
        System.out.println("Leftover slices: " + leftover);
        return totalPrice;
    }

//    public static int leftOverSlices(int numberOfPeople, String typeOfPizza){



    }
   
}






