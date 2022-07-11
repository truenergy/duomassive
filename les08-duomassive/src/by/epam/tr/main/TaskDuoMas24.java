package by.epam.tr.main;

public class TaskDuoMas24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[] = { 1, 5, 7, 9, 10, 12, 10 };
		int array[][] = new int[array1.length][array1.length];
		for (int j = 0; j < array1.length; j++) {

			for (int i = 0; i < array1.length; i++) {

				array[i][j] = (int) Math.pow(array1[j], i + 1);

			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%8d]", array[i][j]);
			}
			System.out.println();
		}

	}
}
