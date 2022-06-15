public class Questao4 {

    public static void main(String[] args) {
        
    
        double velA = 110;// 110km/h
		double velAReal = velA / 60; // 1.83 km/min.
		double velB = 80;// 80km/h

		double distancia = 100;// 100km do trecho todo.

		//double tempA = distancia / velA; // tempo em horas do veiculo para fazer os 100 km.
		//double tempAMinuto = tempA * 60; // tempo em minutos do veiculo A (Carro) para fazer os 100 km.
		double tempB = distancia / velB; // Tempo em horas do veiculo B (Caminhao) para fazer os 100 km.
		double tempBMinuto = tempB * 60; // Tempo em minutos do Veiculo B (Caminhao) para fazer os 100 km.
		double tempBMinutoReal = tempBMinuto + 10; // Tempo em Minutos real para o Caminhao fazer os 100 Km, 10 minutos
													// são o tempo total que irá ficar parado nos pedágios.
		double tempBReal = tempBMinutoReal / 60; // Tempo real em horas contabilizando o pedagio.
		double velBReal = (distancia / tempBReal) / 60; // Velocidade "Real", pois como há duas paradas, a "velocidade"
														// que o veiculo leva para finalizar o trecho muda. Uma maneira
														// de encontrar o tempo padrão.

		double t = 1; // Variavel "t" de tempo, para descobrir o tempo em que os veiculos irão se
						// encontrar, ou seja, distanciaA == distanciaB.

		double distanciaA = velAReal * t; // Percurso do veículo A (Carro) no eixo x, começando por 0.
		double distanciaB = distancia - velBReal * t; // Como o veiculo B (caminhao) sai do Ponto 100, ele percorre a
														// distância de 100 à 0, então, a distância diminui.

		for (double i = t; distanciaA <= distanciaB; i = i + 0.1) { // Criar um laço, para que, enquanto a distância do carro for menor que a distância do caminhao
			distanciaA = velAReal * i; 								// somar 0.1 na variavel tempo, pois assim, diminui a distância entre os carros. O laço termina quando a distância do carro do ponto 0 for maior que a distância do caminhao do ponto 100.
			distanciaB = distancia - velBReal * i;					
			t = i;
		}   // Posteriormente, na formula do laço, substitui i por t, e coloquei na formula da distancia t como i, pois, enquanto fosse a distanciaA menor que a B, somaria 0.1 em i. Por fim, t receberia i, quando o laço acabasse, para poder assim, calcular a distancia.
		
		System.out.println(t);
		System.out.printf("A distância em que os veículos se encontram é no metro %.2f .", + velAReal * t); // Como a distância de A é em relação ao 0, com a velocidade do carro em km/min vezes o tempo, que esta em minutos, nos da a distância em que os veiculos se encontram.


    }
    
                            
   

    }