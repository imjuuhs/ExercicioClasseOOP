public class ContaBancaria {
    
    // atributos
    private int numeroConta;
    private String titular;
    private double saldo;
    

    // método construtor
    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // getter e setter para numeroConta
    public int getNumeroConta() {                        // permite ACESSAR o número da conta de fora da classe
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {       // permite modificar o número da conta de fora da classe 
        this.numeroConta = numeroConta;
    }


    // getter e setter para titular                     // permite ACESSAR o nome do titular de fora da classe
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {            
        this.titular = titular;
    }


    // apenas getter para saldo                         
    public double getSaldo() {                         // só leitura; o saldo só pode ser alterado por métodos da classe
        return saldo;
    }


    // método para depositar valor (aumenta o saldo se o valor for positivo)
    public void depositar(double valor) {               
        if (valor > 0) {
            saldo += valor;
        }
    }

    // método para sacar valor (com verificação de saldo)
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}

