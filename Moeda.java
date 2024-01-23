package uninter;

abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract String getNome();

    public abstract void info();

    public double converterParaReal() {
        return valor; // Conversão para Real 
    }
}