package VA3;

public class Ouro extends Tesouro {

    Ouro(String type, Float value) {
        setTipo(type);
        setValor(value);
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

    public float calcularQuantia() {
        return valor;
    }
}
