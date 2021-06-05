package ro.ase.cts.teste;

import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.experimental.categories.*;
import ro.ase.cts.categoriiteste.TesteGetPromovabilitate;
import ro.ase.cts.categoriiteste.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses(TestGrupa.class, TestGrupaWithMocks.class)
@Categories.IncludeCategory(TesteGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
