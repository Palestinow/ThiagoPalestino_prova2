public class Pinga implements Pedido {

    private static final double PRECO = 3.99;

    @Override
    public String getDescricao() {
        return "Pinga";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}