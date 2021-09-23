package folder;

public class Cantor {
    String nome;
    String banda;
    public Cantor(String nome, String nomeBanda){
        this.nome = nome;
        this.banda = nomeBanda;
    }
    public String getBanda() {
        return banda;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNomeBanda(String nomeBanda) {
        this.banda = nomeBanda;
    }
}
