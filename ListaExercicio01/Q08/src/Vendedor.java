public class Vendedor extends Empregado {
    double valorVendas;
    int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public int getQntVendas() {
        return qntVendas;
    }
    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public void saidaDeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + Double.toString(getSalario()));
        System.out.println("Valor das vendas: " + Double.toString(this.valorVendas));
        System.out.println("Quantidade de vendas: " + Integer.toString(this.qntVendas));
    }
}
