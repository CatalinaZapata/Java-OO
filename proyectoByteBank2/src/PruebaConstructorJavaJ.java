public class PruebaConstructorJavaJ {
	public static void main(String[] args) {
		CuentaA cuenta1 = new CuentaA(101);
		CuentaA cuenta2 = new CuentaA(102);
		CuentaA cuenta3 = new CuentaA(103);
				
		System.out.println(CuentaA.getTotal());
	}
}
