import java.util.Scanner;
public class HiFiveHiEven {
public static void main(String[] args){
Scanner inputScanner=new Scanner(System.in);
System.out.print("Enter an integer: ");
int userNumber=inputScanner.nextInt();
if(userNumber%5==0){System.out.println("HiFive");}
if(userNumber%2==0){System.out.println("HiEven");}
}}