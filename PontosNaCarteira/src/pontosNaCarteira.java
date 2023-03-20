import java.util.Scanner; 
public class pontosNaCarteira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a velocidade do carro?");
        int velocidade = leitor.nextInt();
        System.out.println("Quantas multas ele tem?");
        int multas = leitor.nextInt();


        int multasContadas = multas+1;
             if (multasContadas>2 & velocidade>80){
                System.out.println( multasContadas + " multas. Levou pontos na carteira");
             }else if(multas==1 & velocidade>80){
                System.out.println( multasContadas + " multas. Nao levou pontos na carteira");
             }else if (multas==2 & velocidade>80) {
                System.out.println( multasContadas + " multas. Nao levou pontos na carteira" );
             } else if(velocidade<=80 || velocidade>0){
               System.out.println( multas + " multas. Nao levou pontos na carteira" );
             }
        }
    }

