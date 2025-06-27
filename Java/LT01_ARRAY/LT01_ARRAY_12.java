/*
 * Nome do Programador:Lucas Sartorelli
 * Descrição:
 *12. Carregar códigos das peças em um tabuleiro de xadrez, onde:
		|Código|   1|    2|    3|     4|     5|  6|    7|
		|Peça  |Peão|Torre|Bispo|Cavalo|Rainha|Rei|Vazio|
	- Calcular e mostrar a soma das peças do tabuleiro.
	- Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças
 */

public class LT01_ARRAY_12 {
	public static void main(String[] args) {
		int[][] matriz = new int[8][8];
		int[] pecas = new int[7];
		// iniciar
		for (int i = 0; i < pecas.length; i++) {
			pecas[i] = 0;
		}
		// Carregar
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				pecas[matriz[i][j] - 1]++;
			}
		}
	}
}
