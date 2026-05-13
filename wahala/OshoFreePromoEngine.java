public class OshoFreePromoEngine{

    public static double calculateFinalPrice(double cartTotal, String promoCode){

        if (cartTotal < 5000){
            return cartTotal;
        }

        switch (promoCode.toUpperCase()){

            case "STARTER10":

                if (cartTotal >= 5000 && cartTotal <= 14999){
                    return cartTotal - (cartTotal * 0.10);
                }
                break;

            case "BIGBOY20":

                if (cartTotal >= 15000 && cartTotal <= 29999){
                    return cartTotal - (cartTotal * 0.20);
                }
                break;

            case "OSHOFREE35":

                if (cartTotal >= 30000){
                    return cartTotal - (cartTotal * 0.35);
                }
                break;

            default:
                return cartTotal;
        }

        return cartTotal;
    }

    public static void main(String[] args){

        double cartTotal = 12000;
        String promoCode = "STARTER10";
        System.out.println(calculateFinalPrice(cartTotal, promoCode));

    }

}
