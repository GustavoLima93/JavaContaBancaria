package bytebank;

public class TestarReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 250;
		
		Conta segundaConta = primeiraConta;		
		segundaConta.saldo = 400;
		
		System.out.println("Esta � o saldo da segunda conta : " + segundaConta.saldo);
		System.out.println("Este � o saldo da primeira conta : " + primeiraConta.saldo);
		
		
		if (primeiraConta == segundaConta) {
			System.out.println("As duas sao a mesma conta pois a segunda � apenas uma referencia da primeira.");
		}
	}

}
