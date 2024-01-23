package uninter;

class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String getNome() {
        return "Dólar";
    }

    @Override
    public void info() {
        System.out.println("Moeda: Dolar");
        System.out.println("Valor: " + valor);
    }
}