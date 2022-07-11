package by.epam.tr.main;

import java.util.Random;

public class TaskDuoMas04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mas = new int[4][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(20);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("First line --------------");
		for (int element : mas[0]) {
			System.out.print(" " + element);
		}
		System.out.println();

		System.out.println("Last line --------------");
		for (int element : mas[mas.length-1]) {
			System.out.print(" " + element);
		}
		System.out.println();
	}


}
