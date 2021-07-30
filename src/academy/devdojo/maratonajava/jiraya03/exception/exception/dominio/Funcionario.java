package academy.devdojo.maratonajava.jiraya03.exception.exception.dominio;

/* Regras para decla��o do throws na sobrescrita:
   - Quando estiver sobrescrevendo n�o � necess�rio lan�ar nenhuma exception;
   - Pode lan�ar uma ou todas a exceptions que existe na heran�a;
   - Pode ser adicionado qualquer tipo de exception do tipo unchecked que s�o filhas de RuntimeException;
   - N�o pode adicionar exceptions mais genericas do tipo checked mas pode especificar melhor a classe pai.
   
*/
public class Funcionario extends Pessoa {
	@Override
	public void salvar() throws LoginInvalidoException, ArithmeticException {
		System.out.println("Salvando funcionario...");
	}
}
