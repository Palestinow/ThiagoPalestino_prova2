public class Espresso implements Pedido {

    private static final double PRECO = 6.99;

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}