import java.util.Random;
import java.util.Scanner;
public class LotteryGame {
public static void main(String[] args){
Random randomGenerator=new Random();
Scanner inputScanner=new Scanner(System.in);
int lotteryNumber=randomGenerator.nextInt(100);
System.out.print("Enter a two-digit number: ");
int userNumber=inputScanner.nextInt();
int lotteryFirstDigit=lotteryNumber/10;
int lotterySecondDigit=lotteryNumber%10;
int userFirstDigit=userNumber/10;
int userSecondDigit=userNumber%10;
if(userNumber==lotteryNumber){System.out.println("$10000");}
else if(userFirstDigit==lotterySecondDigit&&userSecondDigit==lotteryFirstDigit){System.out.println("$3000");}
else if(userFirstDigit==lotteryFirstDigit||userFirstDigit==lotterySecondDigit||userSecondDigit==lotteryFirstDigit||userSecondDigit==lotterySecondDigit){System.out.println("$1000");}
else{System.out.println("No prize");}
}}