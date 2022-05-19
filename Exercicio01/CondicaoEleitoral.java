// Verifica a condição eleitoral

class CondicaoEleitoral {
	private static int idade;
	
	public void setIdade(int minhaIdade) {
		if (minhaIdade > 0) {
			idade = minhaIdade;
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void verificaIdade() {
		if (getIdade() < 16) {
			System.out.println("Sua idade eh " + getIdade() + " portanto voce nao pode votar.");
		} 
		else if (getIdade() >= 16 && getIdade() <= 17 || getIdade() > 65) {
			System.out.println("Sua idade eh " + getIdade() + " portanto o seu voto eh facultativo.");
		} 
		else if (getIdade() >= 18 || getIdade() <= 65){
			System.out.println("Sua idade eh " + getIdade() + " portanto seu voto eh obrigatorio.");
		}
	}
}