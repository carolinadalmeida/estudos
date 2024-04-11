package POO;

public class Final {
    public static void main(String[] args){
        Dados dados = new Dados(new Pessoa(), new Professores("Fernando Borges", "- UCSAL"), "Título do Trabalho");
        Titulo titulo = new Titulo("Trabalho de Conclusão de Curso");
        Professores professores = new Professores("Fernando Borges", " - UCSAL");

        Alunos[] listaDeAlunos = dados.getAlunos();

        System.out.println(titulo.getNome());
        System.out.println("Professor: " + professores.getNome());
        System.out.println("Alunos Aprovados:\n");
        for (Alunos aluno : listaDeAlunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
