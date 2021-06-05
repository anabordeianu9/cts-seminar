package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categoriiteste.TesteGetPromovabilitate;
import ro.ase.cts.categoriiteste.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1078);
		assertEquals(1078,grupa.getNrGrupa());
	}
	
	@Category(TesteUrgente.class)
	@Test
	public void testConstructorBoundaryLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Category(TesteUrgente.class)
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
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1078);
		for(int i = 0; i < 8; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for(int i = 0; i < 2; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.8, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1078);
		for(int i = 0; i < 8; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateLimitaInferioara() {
		Grupa grupa = new Grupa(1078);
		for(int i = 0; i < 8; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateInverse() {
		int nrIntegralisti = 31;
		int nrRestantieri = 2;
		Grupa grupa = new Grupa(1078);
		
		for(int i = 0; i < nrIntegralisti; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		
		for(int i = 0; i < nrRestantieri; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(nrIntegralisti, grupa.getPromovabilitate() * grupa.getStudenti().size(), 0.001);
	}
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1078);
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateCardinalityAreRestanta() {
		Grupa grupa = new Grupa(1078);
		Student student = new Student();
		student.adaugaNota(4);
		grupa.adaugaStudent(student);
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateCardinalityNuAreRestanta() {
		Grupa grupa = new Grupa(1078);
		Student student = new Student();
		student.adaugaNota(10);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}

}
