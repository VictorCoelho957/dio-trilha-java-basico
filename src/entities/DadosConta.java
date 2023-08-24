package entities;

public class DadosConta {
	
	public Integer Numero;
	public String Agencia;
	public String NomeCliente;
	public double Saldo;
	
	
	
	public Integer getNumero() {
		return Numero;
	}
	public void setNumero(Integer numero) {
		Numero = numero;
	}
	public String getAgencia() {
		return Agencia;
	}
	public void setAgencia(String agencia) {
		Agencia = agencia;
	}
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	@Override
	public String toString() {
		return "DadosConta [Numero=" + Numero + ", Agencia=" + Agencia + ", NomeCliente=" + NomeCliente + ", Saldo="
				+ Saldo + "]";
	}
	
	
	

}
