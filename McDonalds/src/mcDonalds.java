import java.util.Scanner; 

public class mcDonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");

        for (String ingrediente : listaIngredientes) {
            System.out.println(ingrediente);
        }
    }
}
