import java.util.Scanner;
public class IncomeTaxCalculator {
public static void main(String[] args){
Scanner inputScanner=new Scanner(System.in);
System.out.print("Enter filing status (0-3): ");
int filingStatus=inputScanner.nextInt();
System.out.print("Enter taxable income: ");
double taxableIncome=inputScanner.nextDouble();
double taxAmount=0;
if(filingStatus==0){taxAmount=taxableIncome*0.10;}
else if(filingStatus==1){taxAmount=taxableIncome*0.12;}
else if(filingStatus==2){taxAmount=taxableIncome*0.15;}
else{taxAmount=taxableIncome*0.18;}
System.out.println("Tax: "+taxAmount);
}}