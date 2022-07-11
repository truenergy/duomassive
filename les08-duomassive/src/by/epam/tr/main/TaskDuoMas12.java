package by.epam.tr.main;

public class TaskDuoMas12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[7][7];
		for (int i = 0; i < array.length; i++) {
			array[i][i] = i;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%2d]", array[i][j]);
			}
			System.out.println();
		}
	}

}
