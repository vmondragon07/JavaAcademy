package main;

public class ChallengeMatriz {

	public static void imprimirMatrizDiagonal(int tam) {

		int[][] matriz = new int[tam][tam];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {

				if (x == 0 || x == matriz[x].length - 1 || y == x || x+y == matriz.length-1 ) {
					matriz[x][y] = 1;
				}
			}
		}

		imprimirMatriz(matriz);

	}

	public static void imprimirMatrizEspiral(int tam) {

		int[][] matriz = new int[tam][tam];
		int num = 1;
		int i = 0;
		int j =tam-1;

		for (int x = 0; x < matriz.length; x++) {

			//llena parte superior â†’
			for (int y = i; y <= j; y++) {
				matriz[i][y] = num++;
			}
			//llena extremo derecho â†“
			for (int y = i+1; y <= j; y++) {
				matriz[y][j] = num++;
			}

			//llena extremo izquierdo â†�
			for (int y = j - 1; y >= i; y--) {
				matriz[j][y] = num++;
			}
			
			//llena extremo izquierdo â†‘
			for (int y = j - 1; y >= i + 1; y--) {
				matriz[y][i] = num++;
			}

			i++;
			j--;
		}

		
		imprimirMatriz(matriz);

	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			System.out.print("|");
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]);
				if (y != matriz[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}
	}

	public static void main(String[] args) {

		imprimirMatrizDiagonal(4);
		System.out.print("\n");
		imprimirMatrizEspiral(3);

	}

}
