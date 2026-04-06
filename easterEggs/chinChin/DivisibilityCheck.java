import java.util.Scanner;
public class DivisibilityCheck {
public static void main(String[] args){
Scanner inputScanner=new Scanner(System.in);
System.out.print("Enter an integer: ");
int userNumber=inputScanner.nextInt();
System.out.println("Divisible by 4 and 5: "+(userNumber%4==0&&userNumber%5==0));
System.out.println("Divisible by 4 or 5: "+(userNumber%4==0||userNumber%5==0));
System.out.println("Divisible by 4 or 5 but not both: "+((userNumber%4==0||userNumber%5==0)&&!(userNumber%4==0&&userNumber%5==0)));
}}