package week1.day2;

public class PalindromeString {

	// Build a logic to find the given string is palindrome or not

	public static void main(String[] args) {

		String input = "Madam";
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			reverse = reverse + input.charAt(i);
		}
		if (input.equalsIgnoreCase(reverse)) {

			System.out.println("Input string is Palindrome");

		} else {
			System.out.print("Input string is NOT Palindrome");
		}
	}

}
