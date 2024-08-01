package JavaSelenium;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FinalExamQ {

	public static void main(String[] args) {
			
				Random rnum = new Random(); 
				int[] numbers = new int[500]; 
				for (int i = 0; i < 500; i++) 
				{ numbers[i] = rnum.nextInt(1000); } 
				// Sort the array in ascending order 
				Arrays.sort(numbers); 
				// Ask user for Nth smallest number 
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the value of N: "); 
				int n = sc.nextInt(); 
				// Print the Nth smallest number 
				System.out.println("The " + n + "th smallest number is: " + numbers[n-1]); 
			
			}
		
		
		
	}


