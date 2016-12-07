package Pacote;

/**
 * Created by Douglas on 06/12/2016.
 */
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Douglas", "Brasil", 26, 1.62f, 68.4f, 40, 10, 5);
        l[1] = new Lutador("Dayani ", "Polonia", 20, 1.50f, 50.0f, 20, 40, 20);
        l[2] = new Lutador("Kevin ", "França", 11, 1.55f, 55.0f, 30, 40, 20);
        l[3] = new Lutador("Mateus ", "Canada", 33, 1.67f, 57.0f, 40, 40, 20);
        l[4] = new Lutador("Marcos ", "Italia", 25, 1.69f, 59.0f, 44, 40, 20);
        l[5] = new Lutador("Neno ", "Portugal", 55, 1.55f, 58.0f, 70, 40, 20);

        l[3].setVitorias(90);
        l[3].status();
    }

}
