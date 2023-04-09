public class Cliente extends Pessoa {
    double valorDivida;
    int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public int getAnoNascim() {
        return anoNascim;
    }
    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    public void saidaDeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + Integer.toString(getIdade()));
        System.out.println("Valor da dívida: " + Double.toString(this.valorDivida));
        System.out.println("Ano de nascimento: " + Integer.toString(this.anoNascim));
    }


}
