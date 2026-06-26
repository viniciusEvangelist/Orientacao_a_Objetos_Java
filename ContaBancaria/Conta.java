import java.util.Scanner;

public class Conta {
    private int numero;
    private String titular;
    private int saldo;

    public void depositar(int valor){
        saldo += valor;
    }
    public Conta(int numero, String titular, int saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(int valor){
        if(saldo >= valor) {
            saldo -= valor;
        }
        else {
            System.out.println("saldo insuficiente");
        }
    }

    public void transferir(Conta destino, int valor){
        if(saldo >= valor){
            saldo -= valor;
            destino.saldo += valor;
        }
        else {
            System.out.println("saldo insuficiente");
        }
    }

    public void getSaldo(){
        System.out.println("o saldo da conta de "+ titular +" eh igual a "+ saldo);
    }
}
