public class Main {

    public static void main(String[] args) {
        int minutos = 150;

        System.out.println("Tempo de permanencia: " + minutos + " min");
        System.out.printf("Rotativo:   R$ %.2f%n", new Ticket("PCO-1274", minutos, new Rotativo()).calcularValor());
        System.out.printf("Mensalista: R$ %.2f%n", new Ticket("MDB-1244", minutos, new Mensalista()).calcularValor());
        System.out.printf("Conveniado: R$ %.2f%n", new Ticket("PCC-4234", minutos, new Conveniado()).calcularValor());

        System.out.println();
        System.out.println("TESTANDO\n--- Troca de perfil no mesmo ticket ---");
        Ticket ticket = new Ticket("XYZ-9876", minutos, new Rotativo());
        System.out.printf("Placa %s como Rotativo:   R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());

        ticket.setEstrategia(new Conveniado());
        System.out.printf("Placa %s como Conveniado: R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());

        ticket.setEstrategia(new Mensalista());
        System.out.printf("Placa %s como Mensalista: R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());
    }
}
