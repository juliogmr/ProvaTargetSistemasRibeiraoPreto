//import java.util.Arrays;

public class Questao3 {

    public static void main(String[] args) throws Exception {
    
        int[] a = new int[6];

	    for(int i = 0; i <= 5 ; i++){
	        a[i] = i + i + 1;
	        }
	    System.out.println("A) " + a[4]);
		
		int[] b = new int[8];
		
		for(int i = 0; i <= 7; i++) {
			b[i] = (int) Math.pow(2, i);
		}
		System.out.println("B) " + b[7]);
		
		int[] c = new int[9];
		
		for(int i = 0; i <= 8; i++) {
			c[i] = i * i; 
		}
		System.out.println("C) " + c[7]);
		
		int[] d = new int[6];
		
		for(int i = 0; i <=5 ; i++) {
			d[i] = (2+i+i) * (2+i+i);
		}
		System.out.println("D) " + d[4]);
		
		int q = 1;
		int r = 0;
		int t;
		int[] e = new int[8];
		
		for(int i = 0; i < 8; i++) {
				e[i] = q;
				t = q;
				q = q + r;
				r = t;
			}
		System.out.println("E) " + e[6]);
		
		// Para a questão F, é simples.
		// f) 2,10, 12, 16, 17, 18, 19, ____
		// A sequência se refere a números que começam com a letra "D".
		// Ou seja, o número referente a lacuna é o número 200.
   
    
    }
}