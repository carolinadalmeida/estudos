package POO;

public class Dados extends TrabalhoFinal{

    public Dados(Pessoa pessoa, Professores professores, String titulo) {
        super(pessoa, professores, titulo);
    }

    public Alunos[] getAlunos(){

        Alunos[] ALunos = new Alunos [5];

        ALunos[0] = new Alunos ("Carol", 20030854);
        ALunos[1] = new Alunos ("Matheus", 20030855);
        ALunos[2] = new Alunos ("Lucas", 20030856);
        ALunos[3] = new Alunos ("João", 20030857);
        ALunos[4] = new Alunos ("Maria", 20030858);

        return ALunos;
    }

    public static void main(String[] args) {
        Dados dados = new Dados(new Pessoa(), new Professores("Fernando Borges", "UCSAL"), "Conclusão de Curso");

        Alunos[] listaDeAlunos = dados.getAlunos();

        System.out.println("Lista de Alunos:");
        for (Alunos aluno : listaDeAlunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
