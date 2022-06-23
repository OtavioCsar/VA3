package VA3;

public class Arma {
    String nome;
    TipoArma tipo;
    int poderDeAtaque;

    Arma(String aNome, TipoArma aTipo, int poder) {
        nome = aNome;
        tipo = aTipo;
        poderDeAtaque = poder;
    }

    public int dano() {
        if (tipo == TipoArma.ESPADA) {
            return poderDeAtaque * 2;
        }
        if (tipo == TipoArma.MACHADO) {
            return poderDeAtaque * 3;
        }
        return poderDeAtaque;
    }
}
