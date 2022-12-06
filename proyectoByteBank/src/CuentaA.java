class CuentaA {
	private double saldo;
	private int agencia;
	private int numero;
	private ClienteE titular = new ClienteE();
	
	private static int total = 0;
	public CuentaA(int agencia) {
		if(agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		
		System.out.println("Se van creando: " + total + " cuentas.");
	}
	
	public void depositar(double saldo){
		this.saldo += saldo;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	
	public boolean transferir(double valor, CuentaA cuenta){
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	/*Se elimina porque se toma un modelo de 
	 * negocios donde no se quiere dejar que se modifique la agencia, 
	 * si no solo es manipulable al mopmento de la creacion
	 * 
	 public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No estan permitidos numeros negativos");
		}
	}*/
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(ClienteE titular) {
		this.titular = titular;
	}
	
	public ClienteE getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return CuentaA.total;
	}
	
	
	
	
}
