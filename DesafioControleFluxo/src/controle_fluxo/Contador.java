package controle_fluxo;



public class Contador   {

	private int primeiroParametro;
	private int segundoParametro;
	
	private int  contagem;

	public Contador(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
		
		
		if(primeiroParametro  > segundoParametro ) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		this.primeiroParametro = primeiroParametro;
		this.segundoParametro = segundoParametro;
		
	}

	public int getPrimeiroParametro() {
		return primeiroParametro;
	}

	public void setPrimeiroParametro(int primeiroParametro) {
		this.primeiroParametro = primeiroParametro;
	}

	public int getSegundoParametro() {
		return segundoParametro;
	}

	public void setSegundoParametro(int segundoParametro) {
		this.segundoParametro = segundoParametro;
	}

	public int getContar() {
		return contagem;
	}
	
	
	public String contar() {
		
	
		
		for(int i = 0; i < (segundoParametro - primeiroParametro); i++ ) {
			
			contagem =+ i;
			System.out.println("Imprimindo o número: " + (contagem +1) );
		}
		return "";
	}
	
	
		
		

}
