
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente= new Gerente();
		
		gerente.setNombre("maria");
		gerente.setDocumentos("11111111");
		gerente.setSalario(2000);
		gerente.setTipo(2);
		gerente.setContraseña(1);
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.autenticar(1));


	}

}
