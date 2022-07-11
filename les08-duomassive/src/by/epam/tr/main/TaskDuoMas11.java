package by.epam.tr.main;

import java.util.Random;

public class TaskDuoMas11 {

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
		
		System.out.printf("New massive --------");
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = mas[i].length - 1; j >= 0; j--) {
					System.out.printf("[%2d]", mas[i][j]);
				}
			} else {
				for (int j = 0; j < mas.length; j++) {
					System.out.printf("[%2d]", mas[i][j]);
				}

			}

			System.out.println();
		}

	}

}
