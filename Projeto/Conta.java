package Projeto;
import java.util.Scanner;

public class Conta {
	
	Scanner scan = new Scanner(System.in);
	String agencia, nomeCliente, numAgencia;
	float saldo = 0.00f;
	
	public Conta(String agen, String nome, String numAgen) {
		 agencia = agen;
		 nomeCliente = nome;
		 numAgencia = numAgen;		
	}
	
	public void sacar() {
		System.out.print("Insisra o valor para sacar: R$");
		float saque = scan.nextFloat();
		saldo-=saque;
	}
	
	public void depositar() {
		System.out.print("Insisra o valor do deposito: R$");
		float deposito = scan.nextFloat();
		saldo += deposito;
	}
	
}
