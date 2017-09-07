package testeunitarios;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AvaliadorTestAntiga {

	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;

	// novo método que cria o avaliador
	@Before
	public void criaAvaliador() {
		this.leiloeiro = new Avaliador();
		this.joao = new Usuario("Joao");
		this.jose = new Usuario("Jose");
		this.maria = new Usuario("Maria");
	}

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {

		// Cenário 03:
		// 3 lances em ordem crescente
		// Retirado por causa do criaAvaliador @Before
		//Usuario jose = new Usuario("Jose");
		//Usuario joao = new Usuario("Joao");
		//Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Playstation 3 Novo");

		
		
		leilao.propoe(new Lance(maria, 250.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.00));

		// Executando a ação
		//Avaliador leiloeiro = new Avaliador(); Retirado pelo @Before
		leiloeiro.avalia(leilao);

		// COmparando a saida com esperado
		double maiorEsperado = 400;
		double menorEsperado = 250;

		// invocando método auxiliar - Retirado por causa do @Before
		// criaAvaliador();
		// leiloeiro.avalia(leilao);

		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);

	}

	@Test
	public void deveEntenderLancesEmOrdemCrescenteComOutrosValores() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Playstation 3 Novo");

		leilao.propoe(new Lance(maria, 1000.0));
		leilao.propoe(new Lance(joao, 2000.0));
		leilao.propoe(new Lance(jose, 3000.0));

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		assertEquals(3000, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);

	}

	@Test
	public void deveEntenderLeilaoComApenasUmLance() {

		//Usuario joao = new Usuario("Joao");
		//Avaliador leiloeiro = new Avaliador();
		
		Leilao leilao = new Leilao("Playstation 3 Novo");

		leilao.propoe(new Lance(joao, 1000.0));

		leiloeiro.avalia(leilao);

		// Assert.assertEquals(1000, leiloeiro.getMaiorLance(), 0.0001);
		// Assert.assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);

		// invocando método auxiliar - Retirado por causa do @Before
		// criaAvaliador();
		// leiloeiro.avalia(leilao);

		// veja que não precisamos mais da palavra Assert!
		assertEquals(1000, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);

	}

	@Test
	public void deveEncontrarOsTresMaioresLances() {
		//Usuario joao = new Usuario("João");
		//Usuario maria = new Usuario("Maria");
		//Avaliador leiloeiro = new Avaliador();
		/*
		Leilao leilao = new Leilao("Playstation 3 Novo");
		leilao.propoe(new Lance(joao, 100.0));
		leilao.propoe(new Lance(maria, 200.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(maria, 400.0));
		leiloeiro.avalia(leilao);
		List<Lance> maiores = leiloeiro.getTresMaiores();
		// invocando método auxiliar - Retirado por causa do @Before
		// criaAvaliador();
		// leiloeiro.avalia(leilao);
		assertEquals(3, maiores.size());
		assertEquals(400, maiores.get(0).getValor(), 0.00001);
		assertEquals(300, maiores.get(1).getValor(), 0.00001);
		assertEquals(200, maiores.get(2).getValor(), 0.00001); */
		
		
		
	}

}