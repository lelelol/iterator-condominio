package iterator;

import java.util.Iterator;

public class Censo {

    public static Integer contarMoradoresAdimplentes(Condominio condominio) {
        int quantidade = 0;
        for (Morador morador : condominio) {
            if (morador.isAdimplente()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMoradores(Condominio condominio) {
        int quantidade = 0;
        for (Iterator m = condominio.iterator(); m.hasNext(); ) {
            quantidade++;
            m.next();
        }
        return quantidade;
    }

}
