import java.util.Scanner;
public class DivisionSafe {
public static void main(String[] args){
Scanner inputScanner=new Scanner(System.in);
System.out.print("Enter first number: ");
int firstNumber=inputScanner.nextInt();
System.out.print("Enter second number: ");
int secondNumber=inputScanner.nextInt();
if(secondNumber==0){System.out.println("Cannot divide by zero");}
else{System.out.println("Result: "+(firstNumber/secondNumber));}
}}