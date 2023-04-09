public class Gerente extends Empregado {
    String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public void saidaDeDados(){
        System.out.println("Nome: " + getNome().toString());
        System.out.println("Idade: " + Integer.toString(getIdade()));
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Valor do INSS: " + Double.toString(valorInss()));
        System.out.println("Nome da gerência: " + this.nomeGerencia);
    }
}
