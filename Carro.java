package POO;
public class Carro {

    String nome;
    String marca;
    int ano;
    int vel;

    void acelerar (int aceleracao){
        vel+=aceleracao;
    }

    void reduzir (int reducao){
        vel-=reducao;
    }

    void buzinar(){
        System.out.println("PARABÉNS! Você acaba de alugar um veículo consoco.");
    }
}
