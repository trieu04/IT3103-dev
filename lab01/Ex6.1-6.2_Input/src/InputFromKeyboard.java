import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hay nhap ten ban?");
		String name = keyboard.nextLine();
		
		System.out.println("Ban may tuoi roi?");
		int age = keyboard.nextInt();
		
		System.out.println("Ban cao bao nhieu?");
		float height = keyboard.nextFloat();

		String message = "Ong/ba: " + name + ", " + age + " tuoi. Chieu cao cua ban la " + height + ".";
		System.out.println(message);
		
		keyboard.close();
	}
}
