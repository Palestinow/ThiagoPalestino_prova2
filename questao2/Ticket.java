public class Ticket {

    private final String placa;
    private final int minutosPermanencia;
    private EstrategiaTarifa estrategia;

    public Ticket(String placa, int minutosPermanencia, EstrategiaTarifa estrategia) {
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.estrategia = estrategia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }

    /** Troca o perfil de cobrança em tempo de execução (RQ2.6). */
    public void setEstrategia(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValor() {
        return estrategia.calcular(minutosPermanencia);
    }
}
