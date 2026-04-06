import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
public static void main(String[] args){
Random randomGenerator=new Random();
Scanner inputScanner=new Scanner(System.in);
int computerChoice=randomGenerator.nextInt(3);
System.out.print("Enter 0 (scissor), 1 (rock), 2 (paper): ");
int userChoice=inputScanner.nextInt();
if(userChoice==computerChoice){System.out.println("Draw");}
else if((userChoice==0&&computerChoice==2)||(userChoice==1&&computerChoice==0)||(userChoice==2&&computerChoice==1)){System.out.println("You win");}
else{System.out.println("You lose");}
}}