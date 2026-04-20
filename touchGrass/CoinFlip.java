public class CoinFlip {
    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;

        for (int count = 1; count <= 1000000; count++) {
            int result = (int)(Math.random() * 2);

            if (result == 0) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
