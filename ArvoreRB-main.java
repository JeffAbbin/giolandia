import java.util.*;

class main {
    public static void main(String args[]) {

        Random gerador = new Random(); // Para gerar números aleatórios
        int chave;

        Arvore a = new Arvore();

        // Inserir nodos
        a.adiciona(1000);
        a.adiciona(750);
        a.adiciona(890);
        a.adiciona(1600);
        a.adiciona(1450);
        a.adiciona(900);
        // Remover nodos
        a.remove(1450);

         a.grafico();
         a.inorderWalk();
    }
}
