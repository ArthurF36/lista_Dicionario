package controle;

public class Termo {
    private final String nome;
    private String desc;

    public Termo(String newNome, String newDesc) {
        this.nome = newNome;
        this.desc = newDesc;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String newDesc) {
        this.desc = this.desc;
    }

    public int compareTo(Termo compara) {
        return this.nome.compareToIgnoreCase(compara.nome);
    }

    public String toString() {
        return "Nome: " + this.nome + " e descrição: " + this.desc;
    }
}