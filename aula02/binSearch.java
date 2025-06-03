public static int buscaBinaria(int[] vetor, int chave) {
	int inicio = 0;
	int fim = vetor.length - 1; //inicio e fim percorrem nos indices 
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2; //divisão com resultado inteiro 
				if (vetor[meio] == chave) {
				return meio;
				} else if (vetor[meio] < chave) {
				inicio = meio + 1; //avança no array
				} else {
				fim = meio - 1;
				}
		}
return -1;
}
