import java.util.Scanner;
class GradePoint {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        char grade = inputScanner.next().charAt(0);
        if (grade == 'A') System.out.println(4.0);
        else if (grade == 'B') System.out.println(3.0);
        else if (grade == 'C') System.out.println(2.0);
        else if (grade == 'D') System.out.println(1.0);
        else if (grade == 'F') System.out.println(0.0);
        else System.out.println("Error");
    }
}