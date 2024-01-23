package uninter;

class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public String getNome() {
        return "Euro";
    }

    @Override
    public void info() {
        System.out.println("Moeda: Euro");
        System.out.println("Valor: " + valor);
    }
}