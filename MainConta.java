public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(99999, "vinicius", 1000);
        Conta conta2 = new Conta(88888, "geovanna", 500);
        conta1.depositar(200);
        conta1.getSaldo();
        conta2.sacar(1000);
        conta2.getSaldo();
        conta1.sacar(500);
        conta1.getSaldo();
        conta1.transferir(conta2, 100);
        conta1.getSaldo();
        conta2.getSaldo();
        conta2.transferir(conta1, 1000);
    }
}
