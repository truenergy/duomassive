package by.epam.tr.main;

import java.util.Random;

public class TaskDuoMas08 {

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

		int count = 0;
		int number = 7;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == number) {
					count++;
				}
			}
		}
		System.out.println("Number 7 occurs " + count + " times");
	}
}
