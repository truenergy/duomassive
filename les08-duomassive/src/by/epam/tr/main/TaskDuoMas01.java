package by.epam.tr.main;

public class TaskDuoMas01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mas = new int[][] { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 1, 0, 0 }

		};

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j]);
			}
			System.out.println();
		}
	}
}
