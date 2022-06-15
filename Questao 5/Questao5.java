import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String a = entrada.next();
		String b = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		System.out.println("A palavra ao contrário é: " + b);

		entrada.close();
	}

}
