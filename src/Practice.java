import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// bezwgledna();
		// sumaElementowTablicy();
		zliczanieIlosciZadanejLiczby();

	}

	private static void sumaElementowTablicy() {
		int n, wynik = 0;
		System.out.println("Podaj liczbe elementow tablicy");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] liczby = new int[n];
		// uzupelnianie tablicy
		for (int i = 0; i < n; i++) {
			System.out.println("Podaj element a [" + i + "]");
			liczby[i] = scan.nextInt();
		}
		// sumowanie elementow tablicy
		for (int i = 0; i < n; i++) {
			wynik += liczby[i];
		}
		System.out.println("Wynik sumowania wynosi: " + wynik);

	}

	private static void bezwgledna() {
		int x, wynik;

		System.out.println("Podaj wartoœæ x: ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println(wynik = Math.abs(x));

	}

	private static void zliczanieIlosciZadanejLiczby() {
		int a, b, wynik = 0;
		Scanner scan = new Scanner(System.in);
		// Rozmiar tablicy
		System.out.println("Podaj ile elementów ma tablica");
		a = scan.nextInt();
		System.out.println("Podaj zliczany element");
		// Jaki element zliczamy
		b = scan.nextInt();

		int[] tablica = new int[a];
		// uzupe³neinie tablicy
		for (int i = 0; i < a; i++) {
			System.out.println("Podaj " + i + " element");
			tablica[i] = scan.nextInt();
		}

		// szukanie w tablicy

		for (int i = 0; i < a; i++) {
			if (b == tablica[i]) {
				wynik++;
			}

		}
		System.out.println("Iloœæ wystapiêñ liczby " + b + " wynosi " + wynik);
	}
}
