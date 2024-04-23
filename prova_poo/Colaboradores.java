package prova_poo;

public class Colaboradores {
    private String nome;
    private String setor;
    private String atividades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    @Override
    public String toString() {
        return "Colaboradores{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", atividades='" + atividades + '\'' +
                '}';
    }
}
