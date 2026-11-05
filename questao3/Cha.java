public class Cha implements Pedido {

    private static final double PRECO = 5.00;

    @Override
    public String getDescricao() {
        return "Cha";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}