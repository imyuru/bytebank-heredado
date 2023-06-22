
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario eduardo= new Funcionario();
		
		eduardo.setNombre("Eduardo");
		eduardo.setDocumentos("11111111");
		eduardo.setSalario(2000);
		eduardo.setTipo(1);
		System.out.println(eduardo.getNombre());
		System.out.println(eduardo.getBonificacion());

	}

}
