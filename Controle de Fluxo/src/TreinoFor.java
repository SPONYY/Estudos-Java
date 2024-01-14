import java.util.Scanner;
import java.util.Locale;

public class TreinoFor {
    
    public static void main(String[] args) {

        Scanner receberOpcaoMenu = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(":::::: SELECIONE A OPÇÂO ::::::");
        System.out.println("1 - Todos os números pares e impares separados até...");
        System.out.println("2 - Maior número entre os 10");
        System.out.println("3 - ");
        System.out.println("4 - ");
        String opcaoMenu = receberOpcaoMenu.next();

        if (opcaoMenu.equals("1")) {
            System.out.println("Vamos apresentar todos os números pares e impares inteiros de seus respectivos iniciais até o número informado pelo usuário");
            System.out.println();
            paresEImparesContar();
        }
        else if (opcaoMenu.equals("2")) {
            System.out.println("Forneça 10 números e apresentaremos o maior entre eles");
            System.out.println();
            acharOMaiorNumero();
        }
    }

        public static void paresEImparesContar(){
            Scanner receberNumeroInteiro = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite um número inteiro = ");
            int numero = receberNumeroInteiro.nextInt();
            System.out.println();

            if (numero>=1) {
                System.out.println("Todos os números impares de 1 até " + numero + " = ");
                System.out.println();
                forNumerosImpares(numero);
                System.out.println();

                System.out.println("Todos os números pares de 2 até " + numero + " = ");
                System.out.println();
                forNumerosPares(numero);
                
            }else{System.out.println("Informe um número maior ou igual a 1");}
        }

        public static void forNumerosPares(int numero){
            for (int numeroInicial = 2 ; numeroInicial <= numero; numeroInicial+=2) {
                System.out.println(numeroInicial + " ");
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e) {
                    e.printStackTrace(); //Imprime informações sobre a exceção no console.
                }
            }
        }
        
        public static void forNumerosImpares(int numero){
            for (int numeroInicial = 1 ; numeroInicial <= numero; numeroInicial+=2) {
                System.out.println(numeroInicial + " ");

                try {
                    Thread.sleep(200);
                }catch (InterruptedException e) {
                    e.printStackTrace(); //Imprime informações sobre a exceção no console.
                }
            }

        }

        public static void acharOMaiorNumero(){
            Scanner receberNumeroInteiro = new Scanner(System.in).useLocale(Locale.US);
            int maior = Integer.MIN_VALUE;

            for (int i = 1; i <= 10; i++) {
                
                System.out.println("Digite o " + i + "º número: ");
                int numero = receberNumeroInteiro.nextInt();

                if (numero > maior) {
                    maior = numero;
                }
            }
            System.out.println();
            System.out.println("O maior número é o: " + maior);

        }
}
