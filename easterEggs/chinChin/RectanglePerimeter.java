import java.util.Scanner;
public class RectanglePerimeter {
public static void main(String[] args){
Scanner inputScanner=new Scanner(System.in);
System.out.print("Enter first edge: ");
double firstEdge=inputScanner.nextDouble();
System.out.print("Enter second edge: ");
double secondEdge=inputScanner.nextDouble();
if(firstEdge!=secondEdge){
double perimeterValue=2*(firstEdge+secondEdge);
System.out.println("Perimeter: "+perimeterValue);}
else{System.out.println("Invalid input");}
}}