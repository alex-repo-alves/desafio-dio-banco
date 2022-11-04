public class Main {
    public static void main(String[] args) {
        Banco bb = new Banco("Banco do Brasil");
        Cliente cliente = new Cliente("Alex Alves");
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        bb.criarConta(cc);
        bb.criarConta(poupanca);

        for (Conta contas : bb.getContas()) {
            contas.imprimirExtrato();
        }
        
    }
}
