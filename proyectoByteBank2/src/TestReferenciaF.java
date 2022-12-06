public class TestReferenciaF {
	public static void main(String[] args) {
		ClienteE diego = new ClienteE();
			diego.getNombre();
			diego.getDocumento();
			diego.getTelefono();
		
		CuentaA cuentaDeDiego = new CuentaA(0);
		//cuentaDeDiego.setAgencia();
		
		System.out.println(cuentaDeDiego.getTitular().getDocumento());
		System.out.println(cuentaDeDiego.getTitular());
		System.out.println(diego);
		System.out.println(cuentaDeDiego.getAgencia());
		
		
	}
}
