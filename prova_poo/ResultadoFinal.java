package prova_poo;

public class ResultadoFinal {

    public static void main(String[] args){
        Animais animais = new Animais();
        animais.setRaca("Daschund");
        animais.setClasse("Mamiferos");
        animais.setIdade(1);
        animais.setGenero("Macho");
        animais.setTemperamento("Dócil");
        animais.setHistorico("Vacinado");

        Adotantes adotantes = new Adotantes();
        adotantes.setNome("Carolina");
        adotantes.setCPF(858095);
        adotantes.setTelefone(7198697);
        adotantes.setPreferencia("Mamifero, macho, dócil e vacinado.");

        Colaboradores colaboradores = new Colaboradores();
        colaboradores.setNome("Caio");
        colaboradores.setSetor("Controle de Animais");
        colaboradores.setAtividades("Processo de Adocao");

        ProcessoAdocao processoAdocao = new ProcessoAdocao();
        processoAdocao.setSituação("Adoção Finizalizada");



        System.out.println("Adotante: " + adotantes.getNome() + "\nCPF: " + adotantes.getCPF() + "\nTelefone: " + adotantes.getTelefone() + "\nPreferencia: " + adotantes.getPreferencia());
        System.out.println("\n___________________________________________________________________________\n");
        System.out.println ("Animal Disp.: " + animais.getRaca() + "\nGenero: " + animais.getGenero() + "\nIdade: " + animais.getIdade() + "\nHistórico Médico: " + animais.getHistorico() + "\nTemperamento: " + animais.getTemperamento());
        System.out.println("\n___________________________________________________________________________\n");
        System.out.println("Colaborador: " + colaboradores.getNome() + "\nSetor: " + colaboradores.getSetor() + "\nAtividade Desempenhada: " + colaboradores.getAtividades());
        System.out.println("\n___________________________________________________________________________\n");
        System.out.println("Situação: " + processoAdocao.getSituação());
    }
}
