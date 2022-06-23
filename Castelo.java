package VA3;

public class Castelo {
    private int defesa;
    private int vida;

    Castelo(int def, int life) {
        setDefesa(def);
        setVida(life);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void recebeAtk(Arma arma1) {
        if (arma1.dano() > defesa) {
            vida = vida - arma1.dano();
            System.out.println(vida);
        }
    }
}
