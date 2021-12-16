import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args){

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite um texto qualquer: ");

        String t1 = entradaTeclado.nextLine();
        System.out.println("Seu texto foi: " + t1);

        entradaTeclado.close();
    }
}
