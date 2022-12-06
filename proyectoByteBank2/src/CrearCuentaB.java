public class CrearCuentaB {
	public static void main(String[] args) {
		CuentaA primeraCuenta = new CuentaA(0);
		primeraCuenta.depositar(400);
		System.out.println(primeraCuenta.getSaldo());
		
		CuentaA segundaCuenta = new CuentaA(0);
		segundaCuenta.depositar(400);
		System.out.println(segundaCuenta.getSaldo());
		
		if (primeraCuenta.getSaldo() == segundaCuenta.getSaldo()) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
	}
}
