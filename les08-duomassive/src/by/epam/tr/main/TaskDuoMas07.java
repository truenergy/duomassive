package by.epam.tr.main;

public class TaskDuoMas07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mas = new int[5][5];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) ((Math.random() * 40) - 10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((mas[i][j] < 0) && (mas[i][j] % 2 != 0)) {
					sum = (-1) * mas[i][j] + sum;
				}
			}
		}
		System.out.println("Sum = " + sum);
	}
}
