package by.epam.tr.main;

import java.util.Random;

public class TaskDuoMas10 {

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

		int k = 2;
		int p = 3;
		System.out.println(k + " line --------------");
		for (int element : mas[k - 1]) {
			System.out.print(" " + element);
		}
		System.out.println();

		System.out.println(p + " column --------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.println(" " + mas[i][p - 1]);
		}
		System.out.println();
	}

}
