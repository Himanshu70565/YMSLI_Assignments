package work.practice.q8;

import java.util.Scanner;

/*
 * Exercise 5: Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string, 
 * 	if on moving from left to right each character in the String comes
 *  after the previous characters in the Alphabetical order.
 *  For Example: ANT is a positive String (Since T comes after N and N comes after A).
 *  The method should return true if the entered string is positive.
 */
public class CheckPositiveString {

	public static boolean isPositive(String str) {

		boolean isPositive = true;
		char maxChar = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) > maxChar) {
				maxChar = str.charAt(i);
			} else {
				isPositive = false;
				break;
			}
		}
		return isPositive;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string for which you want to check its positivity");
		String str = sc.next();
		boolean isPositive = isPositive(str);
		System.out.println(isPositive);
	}
}
