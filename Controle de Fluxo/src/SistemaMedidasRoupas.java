import java.util.Scanner;
import java.util.Locale;

public class SistemaMedidasRoupas {
    
    public static void main(String[] args) {
        
        Scanner receberMedida = new Scanner(System.in).useLocale(Locale.US);
        Scanner receberOpcaoMenu = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(":::::: SELECIONE A ROUPA ::::::");
        System.out.println("1 - Camiseta");
        System.out.println("2 - Calça");
        System.out.println("3 - Shorts");
        System.out.println("4 - Tênis");
        System.out.println("5 - Cueca");
        System.out.println("6 - Meias");
        String opcaoMenu = receberOpcaoMenu.next();

        if (opcaoMenu.equals("1")) {

            System.out.println("Qual o tamanho da camiseta desejada? ");
            String tamanhoCamiseta = receberMedida.next();

            switch (tamanhoCamiseta) {
            case "PP":

                System.out.println("Muito pequeno");
                break;

            case "P":

                System.out.println("Pequeno");
                break;

            case "M":

                System.out.println("Médio");
                break;

            case "G":

                System.out.println("Grande");
                break;

            case "GG":
            
                System.out.println("Muito grande");
                break;

            default:
                System.out.println("INDEFINIDO");
        }
            
        }
        else if (opcaoMenu.equals("2")) {
            
        }

    }

}
