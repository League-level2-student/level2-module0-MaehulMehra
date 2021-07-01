package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] animals = {"Monkey", "Gorilla", "Cheetah", "Elephant", "Lion"};
		//2. print the third element in the array
		System.out.println (animals [2]);
		//3. set the third element to a different value
		animals [2] = "Leopard";
		//4. print the third element again
		System.out.println(animals [2]);
		//5. use a for loop to print all the values in the array
		for (int i = 0; i < animals.length; i ++) {
			System.out.println(animals [i]);
		}
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		int [] numbers = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random ();
		for (int i = 0; i < numbers.length; i ++) {
			numbers [i] = ran.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = numbers [0];
		for (int i = 1; i < numbers.length; i ++) {
			if (smallestNumber > numbers [i]) {
				smallestNumber = numbers [i];
			}
		}
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(numbers));
		//10. print the largest number in the array.
		int largestNumber = numbers [0];
		for (int i = 1; i < numbers.length; i ++) {
			if (largestNumber < numbers [i]) {
				largestNumber = numbers [i];
			}
		}
		System.out.println(largestNumber);
	}
}
