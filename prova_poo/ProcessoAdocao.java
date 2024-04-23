package prova_poo;

public class ProcessoAdocao {
    private String situação;
    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    @Override
    public String toString() {
        return "processoAdocao{" +
                "situação='" + situação + '\'' +
                '}';
    }
}

