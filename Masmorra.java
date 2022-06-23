package VA3;

public class Masmorra {
    String nome;
    String nivel;
    int ouro;

    Masmorra(String mNome, String level, int money) {
        nome = mNome;
        nivel = level;
        ouro = money;
    }

    public void relatorio() {
        System.out.println("Nome:" + nome);
        System.out.println("\nNível:" + nivel);
        System.out.println("\nOuro:" + ouro);
    }

}
