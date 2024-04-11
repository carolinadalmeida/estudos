package POO;

import java.util.Arrays;

public class TrabalhoFinal  {


    public TrabalhoFinal(Pessoa pessoa, Professores professores, String titulo) {
        this.pessoa = pessoa;
        this.professores = professores;
        this.Titulo = titulo;
        this.alunos = new Alunos[5];
    }

    public Pessoa pessoa;
    public Alunos[] alunos;
    public Professores professores;
    String Titulo;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    @Override
    public String toString() {
        return "TrabalhoFinal{" +
                "pessoa=" + pessoa +
                ", alunos=" + Arrays.toString(alunos) +
                ", professores=" + professores +
                ", titulo='" + Titulo + '\'' +
                '}';
    }
}


