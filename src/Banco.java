import java.util.ArrayList;
import java.util.List;


public class Banco{

    private String nome;
	private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void criarConta(Conta conta){
        contas.add(conta);
        System.out.println(String.format("Conta número %d criada para %s", conta.getNumero(), conta.getCliente().getNome()));
    }

    public void removeConta(Conta conta) {
        contas.remove(conta);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
