package VA3;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private String raca;
    private Castelo castelo;
    private Arma arma;
    Float total;
    int maior;

    public List<Tesouro> tesouros = new ArrayList<Tesouro>();
    public List<Masmorra> masmorras = new ArrayList<Masmorra>();

    Jogador(String jNome, String jRaca, Castelo castelo1, Arma arma1) {
        this.setNome(jNome);
        this.setRaca(jRaca);
        this.setCastelo(castelo1);
        this.setArma(arma1);
    }

    public void setNome(String jNome) {
        this.nome = jNome;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String jRaca) {
        this.raca = jRaca;
    }

    public String getRaca() {
        return raca;
    }

    public Castelo getCastelo() {
        return castelo;
    }

    public void setCastelo(Castelo castelo1) {
        this.castelo = castelo1;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma1) {
        this.arma = arma1;
    }

    public void masmorrasVisitadas(Masmorra dungeon1) {
        masmorras.add(dungeon1);
    }

    public void adicionarTesouro(Tesouro tesouro) {
        tesouros.add(tesouro);
    }

    public int retornarTesouroMaiorValor() {
        for (int i = 0; i < tesouros.size(); i++) {
            if (tesouros.get(i).calcularQuantia() > maior)
                maior = (int) tesouros.get(i).calcularQuantia();
        }
        return maior;
    }

    public Float calcularTotal() {
        for (int i = 0; i < tesouros.size(); i++) {
            total = (Float) tesouros.get(i).calcularQuantia();
        }
        return total;
    }

}
