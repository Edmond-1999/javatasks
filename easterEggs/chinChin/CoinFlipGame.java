import java.util.Random;
import java.util.Scanner;
public class CoinFlipGame {
public static void main(String[] args){
Random randomGenerator=new Random();
Scanner inputScanner=new Scanner(System.in);
int coinResult=randomGenerator.nextInt(2);
System.out.print("Enter your guess (0 for head, 1 for tail): ");
int userGuess=inputScanner.nextInt();
if(userGuess==coinResult){System.out.println("Correct!");}
else{System.out.println("Wrong!");}
}}