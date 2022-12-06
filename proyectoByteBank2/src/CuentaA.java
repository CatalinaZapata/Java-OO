class CuentaA {
	private double saldo;
	private int agencia = 1;
	private int numero;
	private ClienteE titular = new ClienteE();
	
	private static int total;
	 
	public CuentaA(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Se van creando: " + total + " cuentas.");
		
		total++;
		
		
	}
	
	public void depositar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
		
	public boolean transferir(double valor, CuentaA cuenta){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}
	}
	
	public int getNumero() {
		return numero;
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
