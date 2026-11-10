package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Condominio implements Iterable<Morador>{

    private List<Morador> moradores = new ArrayList<Morador>();

    public Condominio(Morador... moradores) {
        this.moradores = Arrays.asList(moradores);
    }

    @Override
    public Iterator<Morador> iterator() {
        return moradores.iterator();
    }

}
