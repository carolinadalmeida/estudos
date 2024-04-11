package POO;

public class Professores extends Pessoa {
    private String departamento;

    public Professores (String nome, String departamento)
    {
        super(nome);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
