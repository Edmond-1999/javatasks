import java.util.Scanner;
public class CylinderCalculator {
public static void main(String[] args){
Scanner inputScanner=new Scanner(System.in);
System.out.print("Enter radius: ");
double radiusValue=inputScanner.nextDouble();
System.out.print("Enter height: ");
double heightValue=inputScanner.nextDouble();
double surfaceArea=2*Math.PI*radiusValue*radiusValue+2*Math.PI*radiusValue*heightValue;
double volume=Math.PI*radiusValue*radiusValue*heightValue;
System.out.println("Surface Area: "+surfaceArea);
System.out.println("Volume: "+volume);
}}