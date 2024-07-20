import com.banco_digital.model.Cliente;
import com.banco_digital.model.Conta;
import com.banco_digital.model.ContaCorrente;
import com.banco_digital.model.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        cc.depositar(100.0);
        cc.transferir(100.0, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}