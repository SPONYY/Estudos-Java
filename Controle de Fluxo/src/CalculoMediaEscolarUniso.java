import java.util.Scanner;
import java.util.Locale;


public class CalculoMediaEscolarUniso {

    public static void main(String[] args) {
        
        Scanner receberNota = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a nota da NP1 = ");
        double notaNp1 = receberNota.nextDouble();

        System.out.println("Digite a nota da NP2 = ");
        double notaNp2 = receberNota.nextDouble();

        double notaMedia = (notaNp1*0.4) + (notaNp2*0.6);

        if(notaMedia >= 6)
            System.out.println("Sua média foi " + notaMedia + " = Aprovado");
        else
            System.out.println("Sua média foi " + notaMedia + " = Reprovado");

    }

}
