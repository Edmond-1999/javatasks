import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.print("Enter third number: ");
        int third = input.nextInt();

        int smallest;
        int largest;
        int middle;

        if (first <= second && first <= third) {
            smallest = first;
        } else if (second <= first && second <= third) {
            smallest = second;
        } else {
            smallest = third;
        }

        if (first >= second && first >= third) {
            largest = first;
        } else if (second >= first && second >= third) {
            largest = second;
        } else {
            largest = third;
        }

        middle = first + second + third - smallest - largest;

        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);
    }
}