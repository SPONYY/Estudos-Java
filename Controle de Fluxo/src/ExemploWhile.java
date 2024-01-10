import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double salario = 1302.0;

        System.out.println("Dinheiro na conta = " + salario);

        while (salario > 0) {
            double valorComidaIfood = valorAleatorio();
            
            System.out.println("Um alimento de " + valorComidaIfood + "R$" + " foi comprado");
            salario = salario - valorComidaIfood;

            if (salario - valorComidaIfood <= 0) {
                break;
            }
        }
        System.out.println("Dinheiro na conta = " + salario);
        System.out.println("Cauã gastou todo seu salario em comida...");
    }

    private static int valorAleatorio(){
        return ThreadLocalRandom.current().nextInt(17, 56);
    }

}
