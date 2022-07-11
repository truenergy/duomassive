package by.epam.tr.main;

import java.util.Random;

public class TaskDuoMas09 {

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
		System.out.println("Main diag------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.printf("[%2d]", mas[i][j]);
				}
			}
		}
		
		System.out.println();
		System.out.println("Second diag-----------");

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d]", mas[mas[i].length - 1 - i][i]);
		}
		
	}

}
