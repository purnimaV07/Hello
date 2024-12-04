package lab8116;

import java.util.Scanner;

public class GradeCategorizer {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Step 1: Collect the number of scores
	        System.out.print("Enter the number of student scores: ");
	        int numberOfScores = input.nextInt();

	        // Step 2: Initialize an array to store scores
	        int[] scores = new int[numberOfScores];

	        // Step 3: Get scores from the user
	        System.out.println("Enter the scores (0-100):");
	        for (int i = 0; i < scores.length; i++) {
	            // TODO: Prompt the user to enter each score and store it in the array
	        	System.out.println("Enter score #"+(i+1)+":");
	        	scores[i]=input.nextInt()	;        	
	        }

	        // Step 4: Initialize counters for each grade category
	        int countA = 0;
	        int countB = 0;
	        int countC = 0;
	        int countD = 0;
	        int countF = 0;

	        // Step 5: Categorize the grades
	        for (int score : scores) {
	            // TODO: Use if-else statements to count the number of grades in each category
	        	if (score>=90 && score<=100) {
	        		countA++;
	        	}
	        	else if (score>=80 && score<=89) {
	        		countB++;
	        	}else if (score>=70 && score<=79) {
	        		countC++;
	        	}else if (score>=60 && score<=69) {
	        		countD++;
	        	}else {
	        		countF++;
	        	}
	        }

	        // Step 6: Display results
	        System.out.println("Grade Distribution:");
	        // TODO: Print the counts for each grade category (A, B, C, D, F)
         
            	 System.out.println("A: "+countA);
            	 System.out.println("B: "+countB);
            	 System.out.println("C: "+countC);
            	 System.out.println("D: "+countD);
            	 System.out.println("F: "+countF);
             
	        // Close the scanner
	        input.close();
	    }}
	