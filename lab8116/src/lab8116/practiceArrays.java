package lab8116;

import java.util.Scanner;

public class practiceArrays {
	public static final int MIN_RANGE = 10;
	public static final int MAX_RANGE = 50;
	
	public static void main(String[] args) {
		int count = 0;
		EvenoddPractice pp = new EvenoddPractice();
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the count of numbers you wish to enter:");
		int noTotal = input.nextInt();
		
		int[] numbers = new int[noTotal];
		while(count<noTotal) {
			System.out.printf("Enter the number you wish to enter between %d and %d ",MAX_RANGE,MIN_RANGE);
             int  number = input.nextInt();
		if(number < MIN_RANGE || number > MAX_RANGE) {
			System.out.println("Number is out of range.\n Please Try Again");
		}else {
			numbers[count]= number;
			count++;
		}}pp.getNumbers();
		pp.setNumbers(numbers);
		System.out.printf("There are %d even numbers and %d odd numbers in your given of numbers",pp.evenNumbers(),pp.oddNumbers());
	
	}}