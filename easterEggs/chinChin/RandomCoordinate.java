import java.util.Random;
public class RandomCoordinate {
public static void main(String[] args){
Random randomGenerator=new Random();
int xCoordinate=randomGenerator.nextInt(51)-25;
int yCoordinate=randomGenerator.nextInt(151)-75;
System.out.println("Point: ("+xCoordinate+", "+yCoordinate+")");
}}