package by.epam.tr.main;

import java.util.Random;

public class TaskDuoMas05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mas = new int[6][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(40);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i = i + 2) {
			System.out.printf("{%3d}-", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d] ", mas[i][j]);
			}
			System.out.println();

		}

	}
}

