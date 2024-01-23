package uninter;

class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public String getNome() {
        return "Real";
    }

    @Override
    public void info() {
        System.out.println("Moeda: Real");
        System.out.println("Valor: " + valor);
    }
}