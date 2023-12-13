import java.util.Scanner;
import java.util.Locale;

public class SistemaDeMedida {
    public static void main(String[] args) {
        
        Scanner receberMedida = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("// MEDIDAS DISPONIVEIS //");
        System.out.println("PP - P - M - G - GG");
        System.out.println();
        System.out.println("Informe a medida de sua peça de roupa = ");
        String medidaRoupa = receberMedida.nextLine();

        switch (medidaRoupa) {
            case "PP" : {
                System.out.println("Muito Pequeno");
                break;
            }
            case "P" : {
                System.out.println("Pequeno");
                break;
            }
            case "M" : {
                System.out.println("Médio");
                break;
            }
            case "G" : {
                System.out.println("Grande");
                break;
            }
            case "GG" : {
                System.out.println("Muito Grande");
                break;
            }
            default:
                    System.out.println("Medida indisponivel");
        }

    }
}
