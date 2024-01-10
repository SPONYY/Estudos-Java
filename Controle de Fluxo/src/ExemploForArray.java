public class ExemploForArray {
    public static void main(String[] args) {
        
        //Em arrays o indice de elementos inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

                // Linha 1: Início do bloco try, onde colocamos código que pode gerar exceções.
            try {
                // Linha 2: Pausa a execução da thread atual por 1000 milissegundos (1 segundo).
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Linha 4: Se ocorrer uma exceção do tipo InterruptedException,
                // entra no bloco catch e executa o código dentro dele.
                e.printStackTrace(); // Linha 5: Imprime informações sobre a exceção no console.
            }

        }

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
