import java.util.Scanner;
import java.util.Locale;

public class CalculoMediaEscolar {
    public static void main(String[] args) {

        Scanner receberNota = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite a nota da primeira prova = ");
        double notaProva1 = receberNota.nextDouble();

        System.out.println("Digite a nota da segunda prova = ");
        double notaProva2 = receberNota.nextDouble();

        double notaMedia = (notaProva1*0.4) + (notaProva2*0.6);

        if(notaMedia >= 7)
            System.out.println("A média do aluno foi " + notaMedia + " = Aprovado");

        else if (notaMedia >= 5 && notaMedia < 7)
            System.out.println("A média do aluno foi " + notaMedia + " = Recuperação");
        

        else
            System.out.println("A média do aluno foi " + notaMedia + " = Reprovado");

    }
}
