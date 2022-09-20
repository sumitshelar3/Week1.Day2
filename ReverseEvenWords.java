package week1.day2;

public class ReverseEvenWords {

	/* Write program for to reverse only even words from the String & print the input string as it is.*/
	public static void main(String[] args) {

		// Declare the input as Follow
		String test = "I am a software tester";

		// Split the sentence and have it in string Array
		String[] split = test.split(" ");

		for (int i = 0; i < split.length; i++) {

			if (i % 2 != 0) {

				// Split the words have it into Char Array
				char[] array = split[i].toCharArray();

				for (int j = array.length - 1; j >= 0; j--) {
					System.out.print("" + array[j]);

				}
			} else {
				System.out.print(" " + split[i] + " ");
			}
		}

	}

}
