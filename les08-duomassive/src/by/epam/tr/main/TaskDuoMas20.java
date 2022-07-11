package by.epam.tr.main;

public class TaskDuoMas20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[8][8];
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = 0; j < i + 1; j++) {
				array[i][j] = 1;

			}
		}

		for (int i = array.length - 1; i >= array.length / 2; i--) {
			for (int j = 0; j < array.length - i; j++) {
				array[i][j] = 1;

			}
		}

		for (int i = 0; i < array.length / 2; i++) {
			for (int j = array[i].length - 1; j >= array[i].length - 1 - i; j--) {
				array[i][j] = 1;

			}
		}
		for (int i = array.length - 1; i >= array.length / 2; i--) {
			for (int j = array[i].length - 1; j >= i; j--) {
				array[i][j] = 1;

			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%2d]", array[i][j]);
			}
			System.out.println();
		}
	}

}
