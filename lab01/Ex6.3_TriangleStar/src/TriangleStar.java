import java.util.Scanner;

public class TriangleStar {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap so dong:");
		int n = keyboard.nextInt();
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < n - i; j++) System.out.print(' ');
			for (int j = 0; j < 2 * i - 1; j++) System.out.print('*');
			for (int j = 0; j < n - i; j++) System.out.print(' ');
			System.out.print('\n');
		}
		
		keyboard.close();
	}
}
