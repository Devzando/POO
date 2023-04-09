public class App {
    public static void main(String[] args) throws Exception {
        Heroi heroi = new Heroi();

        heroi.setNome("Gandalf");
        heroi.setVida(100);
        heroi.setVidaMax(100);
        heroi.setMagia(100);
        heroi.setMagiaMax(100);

        heroi.mostrarStatus();
        heroi.receberDano(10);
        heroi.mostrarStatus();
        heroi.usarMagia(10);
        heroi.mostrarStatus();
        heroi.recuperarVida(10);
        heroi.mostrarStatus();
        heroi.recuperarMagia(10);
        heroi.mostrarStatus();
        heroi.ataqueEspecial(10);
        heroi.mostrarStatus();
    }
}
