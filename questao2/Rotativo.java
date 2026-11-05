public class Rotativo implements EstrategiaTarifa {

    private static final double VALOR_HORA = 8.00;

    @Override
    public double calcular(int minutosPermanencia) {
        return horasIniciadas(minutosPermanencia) * VALOR_HORA;
    }

    static int horasIniciadas(int minutos) {
        if (minutos <= 0) {
            return 0;
        }
        return (minutos + 59) / 60; // arredonda pra cima
    }
}