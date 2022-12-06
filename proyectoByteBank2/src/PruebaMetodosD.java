public class PruebaMetodosD {
	public static void main(String[] args) {
		CuentaA miCuentaA = new CuentaA(0);
		miCuentaA.depositar(300);
		miCuentaA.depositar(200);
		System.out.println(miCuentaA.getSaldo());
		
		miCuentaA.retirar(100);
		System.out.println(miCuentaA.getSaldo());
		
		
		CuentaA cuentaDeJimena = new CuentaA(0);
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuentaA);
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible");
		}
		
		System.out.println(cuentaDeJimena.getSaldo());
		System.out.println(miCuentaA.getSaldo());
	}
}
