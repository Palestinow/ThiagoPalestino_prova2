

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements Observador {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = "Produto " + nomeProduto + " -> nova quantidade: " + novaQuantidade;
        registros.add(registro);
        System.out.println("[Auditoria] " + registro);
    }

    public List<String> getRegistros() {
        return registros;
    }
}
