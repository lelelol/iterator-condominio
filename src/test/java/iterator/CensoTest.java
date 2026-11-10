package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarMoradoresAdimplentes() {
        Condominio condominio = new Condominio(
                new Morador("Marco", true),
                new Morador("Antonio", true),
                new Morador("Jose", false),
                new Morador("Maria", true)
        );
        assertEquals(3, Censo.contarMoradoresAdimplentes(condominio));
    }

    @Test
    void deveContarTotalMoradores() {
        Condominio condominio = new Condominio(
                new Morador("Marco", true),
                new Morador("Antonio", true),
                new Morador("Jose", false),
                new Morador("Maria", true)
        );
        assertEquals(4, Censo.contarTotalMoradores(condominio));
    }

}
