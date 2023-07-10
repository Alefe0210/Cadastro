package cadastromidias;

public class Cd extends Midia{
   private int nMusicas;

    public Cd() {
    }
     public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public int getNMusica() {
        return nMusicas;
    }

    public void setNMusica(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Numero de Musicas: " + nMusicas;
    }

    public void inserirDados(int codigo, double preco, String nome, int nMusicas) {
        super.inserirDados(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }
}