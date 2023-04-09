public class Heroi {
    private int vida, vidaMax;
    private int magia, magiaMax;
    private String nome;

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVidaMax() {
        return vidaMax;
    }
    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }
    public int getMagia() {
        return magia;
    }
    public void setMagia(int magia) {
        this.magia = magia;
    }
    public int getMagiaMax() {
        return magiaMax;
    }
    public void setMagiaMax(int magiaMax) {
        this.magiaMax = magiaMax;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void receberDano(int dano){
        if(this.vida > 0){
            this.vida -= dano;
        }else{
            System.out.println("O herói já está morto");
        }
    }

    public void usarMagia(int magia){
        if(this.magia > 0){
            this.magia -= magia;
        }else{
            System.out.println("O herói não tem mais magia");
        }
    }

    public void recuperarVida(int vida){
        if(this.vida < this.vidaMax){
            this.vida += vida;
        }else{
            System.out.println("O herói já está com a vida cheia");
        }
    }

    public void recuperarMagia(int magia){
        if(this.magia < this.magiaMax){
            this.magia += magia;
        }else{
            System.out.println("O herói já está com a magia cheia");
        }
    }

    public void mostrarStatus(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida + "/" + this.vidaMax);
        System.out.println("Magia: " + this.magia + "/" + this.magiaMax);
    }

    public void ataqueEspecial(int dano){
        if(this.vida > 0){
            this.vida -= dano * 2;
            this.magia -= 10 * 2;
        }else{
            System.out.println("O herói já está morto");
        }
    }
}
