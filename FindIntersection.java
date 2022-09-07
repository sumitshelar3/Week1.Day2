package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {

		int[] numArray1 = { 3, 2, 11, 4, 6, 7 };
		int[] numArray2 = { 1, 2, 8, 4, 9, 7 };

		for (int i = 0; i < numArray1.length; i++) {

			for (int j = 0; j < numArray2.length; j++) {

				if (numArray1[i] == numArray2[j]) {

					System.out.print(numArray1[i] + " ");

				}

			}

		}

	}

}
