import java.util.Scanner; 

public class pontosNaCarteira2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        System.out.println("Qual a velocidade do carro?");
        int multas = leitor.nextInt();
        System.out.println("Quantas multas ele tem?");
        
        if (velocidade > 80) {
            multas++;
        }
        if (multas >= 3) {
            System.out.println(multas + " multas. Levou pontos na carteira");
        } else {
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
    }
}