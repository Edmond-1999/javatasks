public class Combinations {
    public static void main(String[] args) {

        for (int first = 1; first <= 7; first++) {
            for (int second = first + 1; second <= 7; second++) {
                System.out.println(first + " " + second);
            }
        }
    }
}
