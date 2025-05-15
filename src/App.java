public class App {
    public static void main(String[] args) {

        // primeira conta bancária com número, titular e saldo inicial
        ContaBancaria c1 = new ContaBancaria(1001, "Ana Silva", 500.0);

        // mostra o saldo atual da conta c1
        System.out.printf("Saldo inicial (c1): R$%.2f%n", c1.getSaldo());
    
        // faz um depósito de 150 reais na conta c1
        c1.depositar(150.0);

        // mostra o saldo depois do depósito
        System.out.printf("Após depósito de R$150: R$%.2f%n", c1.getSaldo());

        // tenta sacar 700 reais da conta c1
        boolean sucesso1 = c1.sacar(700.0);

        // mostra se o saque foi bem-sucedido ou não
        System.out.println("Tentativa de saque de R$700: " + (sucesso1 ? "sucesso" : "falha"));

        // mostra o saldo final da conta c1
        System.out.printf("Saldo final (c1): R$%.2f%n%n", c1.getSaldo());



        // segunda conta bancária...
        ContaBancaria c2 = new ContaBancaria(1002, "Bruno Costa", 1000.0);

        System.out.printf("Saldo inicial (c2): R$%.2f%n", c2.getSaldo());

        c2.depositar(200.0);

        System.out.printf("Após depósito de R$200: R$%.2f%n", c2.getSaldo());

        boolean sucesso2 = c2.sacar(500.0);

        System.out.println("Tentativa de saque de R$500: " + (sucesso2 ? "sucesso" : "falha"));

        System.out.printf("Saldo final (c2): R$%.2f%n", c2.getSaldo());

    }
}
