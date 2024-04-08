package POO;

public class carroTeste {

    public static void main (String[] args){

        Carro c1 = new Carro();
        c1.nome = "Argo";
        c1.ano = 2024;
        c1.marca = "Fiat";
        c1.vel = 10;

        c1.buzinar();
        System.out.println("O seu veículo é: " + c1.nome + "\nMontadora: " + c1.marca + "\nAno de fabricação: " + c1.ano );
        System.out.println("Velocidade atual: " + c1.vel + "Km/h");
        
    }

}
