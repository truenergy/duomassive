package by.epam.tr.main;

public class TaskDuoMas18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[6][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j <= array[i].length - 1 - i) {
					array[i][j] = i + 1;
				}
			}
		}
		//int i = array.length-1;
		//int j = array[i].length-1;
		method(array);
	}

///////////////////////////////////////////////////////////////
	public static void method(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%2d]", array[i][j]);
			}
			System.out.println();
		}
	}
//////////////////////////////////////////////////////////////
}
