package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.Contas;
import contas.ContasNaoConfiavel;

public class ContasNaoConfiavelTest {
	
	ContasNaoConfiavel novoCalculo;
	Contas minhaConta;

	@Before
	public void setUp() throws Exception {
		
		novoCalculo = new ContasNaoConfiavel();
		minhaConta = new Contas();
		
	}

	@Test
	public void testCalculaQuadradoValorZero() {
		
		assertEquals(minhaConta.calculaQuadrado(0.0),novoCalculo.calculaQuadrado(0.0),0.01);
		
	}
	
	@Test
	public void testCalculaQuadradoValorPositivoPequeno() {
		
		assertEquals(minhaConta.calculaQuadrado(4.0),novoCalculo.calculaQuadrado(4.0),0.01);
		
	}
	
	@Test
	public void testCalculaQuadradoValorPositivoGrande() {
		
		assertEquals(minhaConta.calculaQuadrado(1000000.0),novoCalculo.calculaQuadrado(1000000.0),0.1);
		
	}
	
	@Test
	public void testCalculaQuadradoValorNegativoPequeno() {
		
		assertEquals(minhaConta.calculaQuadrado(-4.0),novoCalculo.calculaQuadrado(-4.0),0.01);
		
	}
	
	@Test
	public void testCalculaQuadradoValorNegativoGrande() {
		
		assertEquals(minhaConta.calculaQuadrado(-1000000.0),novoCalculo.calculaQuadrado(-1000000.0),0.1);
		
	}
	
	@Test
	public void testCalculaCuboValorZero() {
		
		assertEquals(minhaConta.calculaCubo(0.0),novoCalculo.calculaCubo(0.0),0.01);
		
	}
	
	@Test
	public void testCalculaCuboValorPositivoPequeno() {
		
		assertEquals(minhaConta.calculaCubo(4.0),novoCalculo.calculaCubo(4.0),0.01);
		
	}
	
	@Test
	public void testCalculaCuboValorPositivoGrande() {
		
		assertEquals(minhaConta.calculaCubo(1000000.0),novoCalculo.calculaCubo(1000000.0),0.1);
		
	}
	
	@Test
	public void testCalculaCuboValorNegativoPequeno() {
		
		assertEquals(minhaConta.calculaCubo(-4.0),novoCalculo.calculaCubo(-4.0),0.01);
		
	}
	
	@Test
	public void testCalculaCuboValorNegativoGrande() {
		
		assertEquals(minhaConta.calculaCubo(-1000000.0),novoCalculo.calculaCubo(-1000000.0),0.1);
		
	}

}
