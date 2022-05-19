// Usa os métodos definidos na classe CondicaoEleitoral.

class Main {
	public static void main (String[] args) {
		CondicaoEleitoral eleitor = new CondicaoEleitoral();
		
		// vetor contendo as idades utilizadas nos testes.
		int suaIdade[] = new int[4];
		suaIdade[0] = 14;
		suaIdade[1] = 17;
		suaIdade[2] = 25;
		suaIdade[3] = 70;
		
		// verificações de idades.
		eleitor.setIdade(suaIdade[0]);
		eleitor.verificaIdade();
		
		eleitor.setIdade(suaIdade[1]);
		eleitor.verificaIdade();
		
		eleitor.setIdade(suaIdade[2]);
		eleitor.verificaIdade();
		
		eleitor.setIdade(suaIdade[3]);
		eleitor.verificaIdade();
	}
}