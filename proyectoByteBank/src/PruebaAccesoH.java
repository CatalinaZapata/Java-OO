public class PruebaAccesoH {
	public static void main(String[] args) {
		CuentaA cuenta = new CuentaA(0);
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		System.out.println(cuenta.getSaldo());
	}
}
