package VA3;

public class Bau extends Tesouro {
    private int multiplicador;

    Bau(String type, Float value, int mult) {
        setTipo(type);
        setValor(value);
        setMultiplicador(mult);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public float calcularQuantia() {
        return valor * multiplicador;
    }
}
