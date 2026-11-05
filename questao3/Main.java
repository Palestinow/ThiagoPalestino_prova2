public class Main {

    public static void main(String[] args) {
        // teste 1: Espresso com Leite e Chantilly
        Pedido p1 = new Chantilly(new Leite(new Espresso()));

        // teste 2: Chá com Calda
        Pedido p2 = new Calda(new Cha());

        // teste 3: Espresso com Calda repetida duas vezes e Leite
        Pedido p3 = new Leite(new Calda(new Calda(new Espresso())));
        // teste 4: Pinga
        Pedido p4 = new Pinga();
        // teste 5: refri com laranja
        Pedido p5 = new Laranja(new Refri());


        imprimir(1, p1);
        imprimir(2, p2);
        imprimir(3, p3);
        imprimir(4, p4);
        imprimir(5, p5);
    }

    private static void imprimir(int numero, Pedido pedido) {
        System.out.printf("Pedido %d: %s | Total: R$ %.2f%n",
                numero, pedido.getDescricao(), pedido.getPreco());
    }
}