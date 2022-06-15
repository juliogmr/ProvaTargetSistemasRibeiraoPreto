import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("Digite um valor: ");
		int d = entrada.nextInt();
		
		System.out.println("O número digitado " + d + " pertence a sequência?");
		
		for(int i = 0; i < d && c < d; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		if(c == d) {
			System.out.println("O número digitado pertence a equação de"
					+ " fibonacci");
		} else {
			System.out.println("O número digitado não pertence a equação de"
					+ " fibonacci");
		}
					
		entrada.close();
	}
}