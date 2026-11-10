package iterator;

public class Morador {

    private String nome;
    private boolean adimplente;

    public Morador(String nome, boolean adimplente) {
        this.nome = nome;
        this.adimplente = adimplente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdimplente() {
        return adimplente;
    }

    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }
}
