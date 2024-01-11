public class ExemploFor {
    public static void main(String[] args) {

        System.out.println("Cauã está contando carneirinhos para tentar dormir, ele nunca consegue passar de 20...");

        try {
            Thread.sleep(1000); // Atraso inicial de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace(); //Imprime informações sobre a exceção no console.
        }

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");

            if (carneirinhos == 3) {
                break;
            }

            try {
                Thread.sleep(1000); // Atraso de 1 segundo entre cada mensagem
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Cauã dormiu....");
    
    
    
    }
}
