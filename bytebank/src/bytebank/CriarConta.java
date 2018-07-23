package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Este é o saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;
		System.out.println("Este é o saldo da segunda conta: " + segundaConta.saldo);
		
		
		if (primeiraConta == segundaConta) {
			System.out.println("As duas sao a mesma conta pois a segunda é apenas uma referencia da primeira.");		
		} else {
			System.out.println("Sao contas diferentes");
		}

	}

}
