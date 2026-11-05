public class Refri implements Pedido {

    private static final double PRECO = 8.99;

    @Override
    public String getDescricao() {
        return "Refri";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}