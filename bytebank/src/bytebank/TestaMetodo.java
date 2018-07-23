package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoGustavo = new Conta();
		
		contaDoGustavo.saldo = 100;
		System.out.println("O saldo da conta do Senhor Gustavo é :" + contaDoGustavo.saldo);
		
		contaDoGustavo.deposita(100);
		System.out.println("O Saldo da conta do Senhor Gustavo apos deposito é :" + contaDoGustavo.saldo);
		
		boolean verificaRetorno = contaDoGustavo.saca(150);
		System.out.println("O Saldo da conta do Senhor Gustavo apos sacar é :" + contaDoGustavo.saldo);
		System.out.println(verificaRetorno);
		
		Conta contaDaIzabella = new Conta();
		contaDaIzabella.deposita(5000);
		System.out.println("O Saldo da conta da Senhorita Izabella apos deposito é :" + contaDaIzabella.saldo);
		
		boolean comprovante = contaDaIzabella.transfere(4000, contaDoGustavo);
		System.out.println("O Saldo da conta da Senhorita Izabella apos Transferencia é :" + contaDaIzabella.saldo);
		System.out.println("O Saldo da conta do Senhor Gustavo apos Transferencia é :" + contaDoGustavo.saldo);
		
		if (comprovante == true) {
			System.out.println("Transferencia concluida com sucesso");
		}else {
			System.out.println("Ocorreu erro com a transferencia");
		}
		

	}

}
