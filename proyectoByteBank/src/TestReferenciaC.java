public class TestReferenciaC {
	public static void main(String[] args) {
		CuentaA primeraCuenta = new CuentaA(0);
		primeraCuenta.depositar(200);
		
		CuentaA segundaCuenta = primeraCuenta;
		segundaCuenta.retirar(100);
		
		System.out.println("Saldo primera "
				+ "cuenta: "+ primeraCuenta.getSaldo());
		
		segundaCuenta.depositar(400);;
		System.out.println("Saldo primera "
				+ "cuenta: "+ primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
	}
}
