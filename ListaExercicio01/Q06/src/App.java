public class App {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();

        arvore.setNome("Pau Brasil");
        arvore.setIdade(99);
        arvore.setIdadeMax(100);
        arvore.setAltura(10);

        System.out.println("Nome: " + arvore.getNome());
        System.out.println("Idade Inicial: " + arvore.getIdade());
        System.out.println("Idade Máxima Inicial: " + arvore.getIdadeMax());
        System.out.println("Altura Inicial: " + arvore.getAltura());

        arvore.Envelhecer(10);
        if(arvore.getIdade() > arvore.getIdadeMax()){
            System.out.println("Árvore morreu");
        }else{
            System.out.println("Idade nova: " + arvore.getIdade());
            System.out.println("Altura nova: " + arvore.getAltura());
        }
    }
}
