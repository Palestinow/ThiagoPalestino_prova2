public class Leite extends Complemento {

    private static final double PRECO = 2.99;

    public Leite(Pedido pedido) {
        super(pedido, "Leite", PRECO);
    }
}