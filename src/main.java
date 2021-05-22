import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int column = sc.nextInt();

		int[][] numbers = new int[row][column];

		for (int a = 0; a < numbers.length; a++) {
			for (int b = 0; b < numbers[a].length; b++) {
				numbers[a][b] = sc.nextInt();

			}
		}
		int chosenNumber = sc.nextInt();
		for (int a = 0; a < numbers.length; a++) {
			System.out.println();
			for (int b = 0; b < numbers[a].length; b++) {
				if (chosenNumber == numbers[a][b]) {
					System.out.println("Positon " + a + "," + b);
					if (b > 0) {
						System.out.println("Left: " + numbers[a][b - 1]);
					}
					if (a > 0) {
						System.out.println("Up: " + numbers[a - 1][b]);
					}
					if (b < numbers[a].length-1) {
						System.out.println("Right: " + numbers[a][b + 1]);
					}
					if (a < numbers.length - 1) {
						System.out.println("Down: " + numbers[a + 1][b]);
					}
				}
			}
		}
	}
}
