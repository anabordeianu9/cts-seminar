package ro.ase.cts.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GrupaFixtureTests.class, TestGrupa.class, TestGrupaWithMocks.class })
public class AllTests {

}
