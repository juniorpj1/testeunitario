package testeunitarios;

public class Teste {

	public static void main (String[] args){
		//cenario 03: 
		
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Playstation 3 Novo");
		
		leilao.propoe(new Lance(maria, 250.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		
		// executando acao
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		// exibindo saida
		System.out.println(leiloeiro.getMaiorLance());
		System.out.println(leiloeiro.getMenorLance());
	}
	
}
