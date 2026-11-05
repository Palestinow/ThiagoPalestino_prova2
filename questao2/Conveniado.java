public class Conveniado implements EstrategiaTarifa {

    private static final int MINUTOS_GRATIS = 30;
    private static final double VALOR_HORA = 8.00;
    private static final double DESCONTO_PERCENTUAL = 25.0;

    @Override
    public double calcular(int minutosPermanencia) {
        int minutosCobrados = minutosPermanencia - MINUTOS_GRATIS;
        int horas = Rotativo.horasIniciadas(minutosCobrados);
        double valorHoraComDesconto = VALOR_HORA * (1 - DESCONTO_PERCENTUAL / 100.0);
        return horas * valorHoraComDesconto;
    }
}