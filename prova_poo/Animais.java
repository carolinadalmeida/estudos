package prova_poo;

public class Animais {
    private String classe;
    private String raca;
    private int idade;
    private String genero;
    private String historico;
    private String temperamento;


    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "classe='" + classe + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", historico='" + historico + '\'' +
                ", temperamento='" + temperamento + '\'' +
                '}';
    }
}
