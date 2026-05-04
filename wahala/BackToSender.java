public class BackToSender {

    public static int calculateWage(int successfulDeliveries) {
        int basePay = 5000;
        int ratePerParcel;

        double percentage = (successfulDeliveries / 100.0) * 100;

        if (percentage < 50) {
            ratePerParcel = 160;
        } else if (percentage < 60) {
            ratePerParcel = 200;
        } else if (percentage < 70) {
            ratePerParcel = 250;
        } else {
            ratePerParcel = 500;
        }

        int totalPayment = (successfulDeliveries * ratePerParcel) + basePay;

        return totalPayment;
    }
}
