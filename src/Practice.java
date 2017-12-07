import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		bezwgledna();

	}

	private static void bezwgledna() {
		int x, wynik;

		System.out.println("Podaj wartoœæ x: ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println(wynik = Math.abs(x));

	}

}
