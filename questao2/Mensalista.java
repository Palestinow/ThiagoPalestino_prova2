
public class Mensalista implements EstrategiaTarifa {

    private static final double VALOR_FIXO = 200.00;

    @Override
    public double calcular(int minutosPermanencia) {
        return VALOR_FIXO;
    }
}
