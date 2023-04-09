public class Arvore {
    int idade, idadeMax;
    String nome;
    double altura;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdadeMax(){
        return this.idadeMax;
    }

    public void setIdadeMax(int idadeMax){
        this.idadeMax = idadeMax;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void Envelhecer(int anos){
        if(this.idade < this.idadeMax){
            this.idade += anos;
            this.altura += 0.5;
        }
    }

}
