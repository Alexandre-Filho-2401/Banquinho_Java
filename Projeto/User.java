package Projeto;
import java.util.Scanner;
import java.util.Random;

public class User {
	
	//Scanner para receber os inputs e Random para gerar numero de conta
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		//A principio eu tentei colocar essa parte inteira dentro de uma funcao
		//mas o código deu conflito, futuramente vou corrigir
		System.out.println("Criando conta");
		System.out.print("Insira seu nome: ");
		String nome = scan.next();
		
		System.out.print("Insira seu sobrenome: ");
		String sobrenome = scan.next();
		String fullname = nome+" "+sobrenome;
		String agencia = "067-8";
		String numAgencia = String.format("%04d",rand.nextInt(9999)+1);
		
		Conta conta = new Conta(agencia,fullname,numAgencia);
		System.out.println("Ola "+conta.nomeCliente+", obrigado por criar um conta no nosso banco, sua agencia e "+conta.agencia+", conta "+conta.numAgencia+" e seu saldo de R$"+conta.saldo+" ja esta disponivel para saque!");
		
		boolean w=true;
		while(w) {
			
			System.out.println("[1] Depositar");
			System.out.println("[2] Sacar");
			System.out.println("[3] Verificar Saldo");
			System.out.println("[0] Sair");
			System.out.print(">> ");
			int opcao = scan.nextInt();
			
			switch(opcao) {
				case 1:
					conta.depositar();
					break;
				case 2:
					conta.sacar();
					break;
				case 3:
					System.out.println("Saldo: R$"+conta.saldo);
					break;
				case 0:
					w = false;
				
			}
		}
	}
}