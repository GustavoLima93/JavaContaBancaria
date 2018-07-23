package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoGustavo = new Conta();
		
		contaDoGustavo.saldo = 100;
		System.out.println("O saldo da conta do Senhor Gustavo � :" + contaDoGustavo.saldo);
		
		contaDoGustavo.deposita(100);
		System.out.println("O Saldo da conta do Senhor Gustavo apos deposito � :" + contaDoGustavo.saldo);
		
		boolean verificaRetorno = contaDoGustavo.saca(150);
		System.out.println("O Saldo da conta do Senhor Gustavo apos sacar � :" + contaDoGustavo.saldo);
		System.out.println(verificaRetorno);
		
		Conta contaDaIzabella = new Conta();
		contaDaIzabella.deposita(5000);
		System.out.println("O Saldo da conta da Senhorita Izabella apos deposito � :" + contaDaIzabella.saldo);
		
		boolean comprovante = contaDaIzabella.transfere(4000, contaDoGustavo);
		System.out.println("O Saldo da conta da Senhorita Izabella apos Transferencia � :" + contaDaIzabella.saldo);
		System.out.println("O Saldo da conta do Senhor Gustavo apos Transferencia � :" + contaDoGustavo.saldo);
		
		if (comprovante == true) {
			System.out.println("Transferencia concluida com sucesso");
		}else {
			System.out.println("Ocorreu erro com a transferencia");
		}
		

	}

}
