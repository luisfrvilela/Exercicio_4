package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.Contas;

public class ContasTest {
	
	Contas minhaConta;

	@Before
	public void setUp() throws Exception {
		
		minhaConta = new Contas();
		
	}

	@Test
	public void testCalculaQuadradoValorZero() {
		
		assertEquals(0.0,minhaConta.calculaQuadrado(0.0),0.01);
		
	}
	
	@Test
	public void testCalculaQuadradoValorPositivoPequeno() {
		
		assertEquals(16.0,minhaConta.calculaQuadrado(4.0),0.01);
		
	}
	
	@Test
	public void testCalculaQuadradoValorPositivoGrande() {
		
		assertEquals(1000000000000.0,minhaConta.calculaQuadrado(1000000.0),0.1);
		
	}
	
	@Test
	public void testCalculaQuadradoValorNegativoPequeno() {
		
		assertEquals(16.0,minhaConta.calculaQuadrado(-4.0),0.01);
		
	}
	
	@Test
	public void testCalculaQuadradoValorNegativoGrande() {
		
		assertEquals(1000000000000.0,minhaConta.calculaQuadrado(-1000000.0),0.1);
		
	}
	
	@Test
	public void testCalculaCuboValorZero() {
		
		assertEquals(0.0,minhaConta.calculaCubo(0.0),0.01);
		
	}
	
	@Test
	public void testCalculaCuboValorPositivoPequeno() {
		
		assertEquals(64.0,minhaConta.calculaCubo(4.0),0.01);
		
	}
	
	@Test
	public void testCalculaCuboValorPositivoGrande() {
		
		assertEquals(1000000000000000000.0,minhaConta.calculaCubo(1000000.0),0.1);
		
	}
	
	@Test
	public void testCalculaCuboValorNegativoPequeno() {
		
		assertEquals(-64.0,minhaConta.calculaCubo(-4.0),0.01);
		
	}
	
	@Test
	public void testCalculaCuboValorNegativoGrande() {
		
		assertEquals(-1000000000000000000.0,minhaConta.calculaCubo(-1000000.0),0.1);
		
	}

}
