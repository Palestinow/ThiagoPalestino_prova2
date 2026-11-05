

public class Main {

    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("\nTESTANDO\n--- Estoque: 10 -> 8 ---");
        notebook.setQuantidade(8);

        System.out.println("\nTESTANDO\n--- Estoque: 8 -> 4 (Compras deve alertar) ---");
        notebook.setQuantidade(4);

        System.out.println("\nTESTANDO\n--- Estoque: 4 -> 4 (nada muda, ninguem eh avisado) ---");
        notebook.setQuantidade(4);

        System.out.println("\nTESTANDO\n Estoque: 4 -> 0 ---");
        notebook.setQuantidade(0);

        System.out.println("\nTESTANDO\n Estoque: 0 -> 6 (Vendas deve alertar) ---");
        notebook.setQuantidade(6);

        System.out.println("\nTESTANDO\n Removendo Compras ---");
        notebook.removerObservador(compras);

        System.out.println("\nTESTANDO\n--- Estoque: 6 -> 2 (Compras nao recebe mais) ---");
        notebook.setQuantidade(2);

        System.out.println();
        System.out.println("\nTotal de registros na Auditoria: " + auditoria.getRegistros().size());
    }
}
