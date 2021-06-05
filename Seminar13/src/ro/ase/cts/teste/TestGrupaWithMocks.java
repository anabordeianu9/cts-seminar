package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categoriiteste.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;

public class TestGrupaWithMocks {

	@Category(TesteUrgente.class)
	@Test
	public void testAdaugareStudent() {
		StudentDummy student = new StudentDummy();
		Grupa grupa = new Grupa(1078);
		
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getStudenti().size());
	}
	
	@Test
	public void testGetPromovabilitate() {
		StudentStub student = new StudentStub();
		Grupa grupa = new Grupa(1078);
		
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testGetPromovabilitateRightWithFake() {
		//10 studenti - 7 integralisti si 3 restantieri
		Grupa grupa = new Grupa(1078);
		
		for(int i=0;i<7;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		
		for(int i=0;i<3;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.7,grupa.getPromovabilitate(),0.01);
	}
	

}
