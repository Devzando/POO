public class Empregado extends Pessoa {
    double salario;
    String matricula;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public double valorInss(){
        double valorInss = this.salario * 0.11;
        return valorInss;
    }

}
