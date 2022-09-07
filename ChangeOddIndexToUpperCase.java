package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String sample = "welcomeplease";

		char[] array1 = sample.toCharArray();

		for (int i = 0; i < array1.length; i++) {

			if (i % 2 != 0) {

				System.out.print(Character.toUpperCase(array1[i]));
			} else
				System.out.print(array1[i]);
		}

	}

}
