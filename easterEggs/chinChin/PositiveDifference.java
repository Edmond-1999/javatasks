import java.util.Random;
public class PositiveDifference {
public static void main(String[] args){
Random randomGenerator=new Random();
int firstNumber=randomGenerator.nextInt(10);
int secondNumber=randomGenerator.nextInt(10);
int differenceValue;
if(firstNumber>secondNumber){differenceValue=firstNumber-secondNumber;}
else{differenceValue=secondNumber-firstNumber;}
System.out.println("Difference: "+differenceValue);
}}