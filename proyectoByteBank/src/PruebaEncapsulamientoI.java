public class PruebaEncapsulamientoI {
	public static void main(String[] args) {
		CuentaA cuenta = new CuentaA(0);
		ClienteE cliente = new ClienteE();
		cliente.setNombre("Diego");
		cliente.setDocumento("A101");
		cuenta.setTitular(cliente);
		ClienteE titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
	}
}
