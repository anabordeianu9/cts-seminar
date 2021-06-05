package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;

public class TestGrupa {

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1078);
		assertEquals(1078,grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundaryLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundaryLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorConditionsMaiMic() {
		Grupa grupa = new Grupa(999);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorConditionsMaiMare() {
		Grupa grupa = new Grupa(1101);
	}
	
	@Test(timeout=200)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1050);
	}
	
	@Test
	public void testConstructorExistenceList() {
		Grupa grupa = new Grupa(1000);
		assertNotNull(grupa.getStudenti());
	}

}
