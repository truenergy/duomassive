package by.epam.tr.main;

public class TaskDuoMas23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array[][] = new double[6][6];
		int count = 0;
		int n = array.length;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = Math.sin(((i * i) - (j * j)) / n);
				if (array[i][j] > 0) {
					count = count + 1;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4.1f]", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("count = " + count);
	}
}
