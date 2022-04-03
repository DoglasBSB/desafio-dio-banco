
public class Main {

    public static void main(String[] args) {


        Cliente joao = new Cliente();
        joao.setNome("Joao");

        ContaCorrente cc = new ContaCorrente(joao);
        ContaPoupanca poupanca = new ContaPoupanca(joao);

        //Deposito
        cc.depositar(120);

        //Transferência
         cc.transferir(100, poupanca);

        //Extratos
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}


