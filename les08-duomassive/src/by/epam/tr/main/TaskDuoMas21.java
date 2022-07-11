package by.epam.tr.main;

public class TaskDuoMas21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[6][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				array[i][j] = j + array.length - i;

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
