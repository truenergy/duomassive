package by.epam.tr.main;

public class TaskDuoMas22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][] = new int[6][6];

		for (int i = 0; i < array.length; i++) {
			for (int j = array[i].length - 1 - i; j >= 0; j--) {
				array[i][j] = i + j + 1;
			}
		}

		TaskDuoMas18.method(array);

	}
}
