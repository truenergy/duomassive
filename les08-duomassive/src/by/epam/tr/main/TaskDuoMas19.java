package by.epam.tr.main;

public class TaskDuoMas19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[7][7];
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[i].length - i; j++) {
				array[i][j] = 1;
			}
		}

		int k = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = k; j < array[i].length - k; j++) {
				array[i][j] = 1;
			}
			k++;
		}
		
		TaskDuoMas18.method(array);

	}

}