public class InvestmentValue {

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        double futureValue = futureInvestmentValue(1000, 0.01, 5);
        System.out.println("Future Investment Value: " + futureValue);
    }
}
