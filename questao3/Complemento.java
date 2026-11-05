public abstract class Complemento implements Pedido {

    private final Pedido pedido;
    private final String nome;
    private final double preco;

    protected Complemento(Pedido pedido, String nome, double preco) {
        this.pedido = pedido;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " + " + nome;
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + preco;
    }
}