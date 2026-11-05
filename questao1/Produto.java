

import java.util.ArrayList;
import java.util.List;


public class Produto {

    private final String nome;
    private int quantidade;
    private final List<Observador> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarObservador(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

     public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == this.quantidade) {
            return;
        }
        this.quantidade = novaQuantidade;
        notificar();
    }

    private void notificar() {
         for (Observador o : new ArrayList<>(observadores)) {
            o.atualizar(nome, quantidade);
        }
    }
}
