public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Cliente cliente = new Cliente();
        Empregado empregado = new Empregado();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();


        cliente.setNome("Gabriel");
        cliente.setSexo("Masculino");
        cliente.setIdade(19);
        cliente.setValorDivida(1000);
        cliente.setAnoNascim(2003);

        cliente.saidaDeDados();

        empregado.setNome("Lira");
        empregado.setSexo("Masculino");
        empregado.setIdade(19);
        empregado.setSalario(1000);
        empregado.setMatricula("123456");
        empregado.valorInss();

        gerente.setNome("Maria");
        gerente.setSexo("Feminino");
        gerente.setIdade(30);
        gerente.setSalario(2000);
        gerente.setMatricula("654321");
        gerente.setNomeGerencia("Gerencia de TI");
        gerente.valorInss();

        gerente.saidaDeDados();

        vendedor.setNome("João");
        vendedor.setSexo("Masculino");
        vendedor.setIdade(25);
        vendedor.setSalario(1500);
        vendedor.setMatricula("987654");
        vendedor.setValorVendas(10000);
        vendedor.valorInss();

        vendedor.saidaDeDados();

    }
}
