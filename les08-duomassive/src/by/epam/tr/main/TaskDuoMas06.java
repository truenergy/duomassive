package by.epam.tr.main;

import java.util.Random;

public class TaskDuoMas06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mas = new int[5][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(40);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}

		for (int j = 0; j < mas[0].length; j = j + 2) {
			if (mas[0][j] > mas[mas.length - 1][j]) {
				for (int k = 0; k < mas.length; k++) {
					System.out.printf("[%2d]\n", mas[k][j]);
				}
				System.out.println();
			}

		}
	}

}
