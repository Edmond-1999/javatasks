import java.util.Scanner;
public class ShippingCost {
public static void main(String[] args){
Scanner inputScanner=new Scanner(System.in);
System.out.print("Enter weight: ");
double packageWeight=inputScanner.nextDouble();
if(packageWeight<=1){System.out.println("Cost: 2.5");}
else if(packageWeight<=3){System.out.println("Cost: 4.5");}
else if(packageWeight<=10){System.out.println("Cost: 7.5");}
else if(packageWeight<=20){System.out.println("Cost: 10.5");}
else{System.out.println("Cannot be shipped");}
}}