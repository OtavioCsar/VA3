package VA3;

public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma("Excalibur", TipoArma.ESPADA, 5);

        /* Tesouros */
        Tesouro reliquia = new Ouro("Tesouro", 1f);
        Tesouro caixa = new Bau("Caixa", 100f, 2);
        Tesouro bau = new Bau("Grande bau", 500f, 1);
        /*-------- */

        Castelo castelo1 = new Castelo(5, 30);

        Jogador jogador1 = new Jogador("Heroi", "Humano", castelo1, arma1);
        jogador1.adicionarTesouro(reliquia);
        jogador1.adicionarTesouro(caixa);
        jogador1.adicionarTesouro(bau);
        Masmorra dungeon1 = new Masmorra("Caverna", "2", 1);
        /*  */
        System.out.println(arma1.dano());
        dungeon1.relatorio();
        System.out.println(jogador1.calcularTotal());
        System.out.println(jogador1.retornarTesouroMaiorValor());

    }
}
