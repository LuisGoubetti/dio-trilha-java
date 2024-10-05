
public abstract class Conta implements Iconta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++; //proximas contas serão 2,3,4 e etc...
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;	
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;		
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente:%s", cliente.getNome()));
		System.out.println(String.format("Agencia:%d", this.agencia));
		System.out.println(String.format("Numero:%d", this.numero));
		System.out.println(String.format("Saldo:%.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "\nNome:"+ cliente.getNome() + "\nAgencia: " + agencia + "\nNumero da conta: " + numero + "\nSaldo " + saldo + "\n" ;
	}
	
}
