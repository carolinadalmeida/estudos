package prova_poo;

public class Adotantes {

     private String nome;
     private String preferencia;

    private int CPF;
    private int telefone;

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Adotantes{" +
                "nome='" + nome + '\'' +
                ", CPF=" + CPF +
                ", telefone=" + telefone +
                '}';
    }
}
