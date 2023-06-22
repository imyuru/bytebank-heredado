
public class Funcionario {
	
	private String nombre;
	private String documentos;
	private double salario;
	private int tipo;
	
	
	public Funcionario(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumentos() {
		return documentos;
	}
	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getBonificacion() {
		
		if (this.tipo ==1) {
			return this.salario*0.1;
		}else if (this.tipo ==2) {
			return this.salario*0.2;
		}else {
			return 0;
		}
		
		
	}
	
	

}
