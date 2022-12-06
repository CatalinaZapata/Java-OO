public class TestReferenciaG {
	public static void main(String[] args) {
		CuentaA cuentaDeDiego = new CuentaA(0);
			//ClienteE cliente = new ClienteE();
			//cuentaDeDiego.titular = new ClienteE();
			//cuentaDeDiego.titular.nombre = "Diego";
		System.out.println(cuentaDeDiego.getTitular().getNombre());
	}
}
