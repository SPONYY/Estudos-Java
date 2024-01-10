import java.util.Scanner;
import java.util.Locale;

public class SistemaMedidasRoupas {
    
    public static void main(String[] args) {
        
        Scanner receberMedida = new Scanner(System.in).useLocale(Locale.US);
        Scanner receberOpcaoMenu = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(":::::: SELECIONE O TIPO DE ROUPA ::::::");
        System.out.println("1 - Camisetas");
        System.out.println("2 - Calças");
        System.out.println("3 - Shorts");
        System.out.println("4 - Tênis");
        System.out.println("5 - Cueca");
        System.out.println("6 - Meias");
        String opcaoMenu = receberOpcaoMenu.next();

        if (opcaoMenu.equals("1")) {

            System.out.println(":::::: Tamanhos de camisetas disponiveis ::::::");
            System.out.println("PP -- P -- M -- G -- GG");
            System.out.println();
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

            case "pp":

                System.out.println("Muito pequeno");
                break;

            case "p":

                System.out.println("Pequeno");
                break;

            case "m":

                System.out.println("Médio");
                break;

            case "g":

                System.out.println("Grande");
                break;

            case "gg":
            
                System.out.println("Muito grande");
                break;
            case "Pp":

                System.out.println("Muito pequeno");
                break;

            case "Gg":
            
                System.out.println("Muito grande");
                break;

            default:
                System.out.println("INDEFINIDO");
            }
            
        }
        else if (opcaoMenu.equals("2")) {

            System.out.println(":::::: Tamanhos de calças disponiveis ::::::");
            System.out.println("34 -- 36 -- 38 -- 40 -- 42");
            System.out.println();
            System.out.println("Qual o tamanho da calça desejada? ");
            String tamanhoCalca = receberMedida.next();

            switch (tamanhoCalca) {
            case "34":

                System.out.println("Calça tamanho 34");
                break;

            case "36":

                System.out.println("Calça tamanho 36");
                break;

            case "38":

                System.out.println("Calça tamanho 38");
                break;

            case "40":

                System.out.println("Calça tamanho 40");
                break;

            case "42":
            
                System.out.println("Calça tamanho 42");
                break;

            default:
                System.out.println("Tamanho indisponivel");
            }
            
        }

    }

}
