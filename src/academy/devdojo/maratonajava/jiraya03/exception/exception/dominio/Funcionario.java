package academy.devdojo.maratonajava.jiraya03.exception.exception.dominio;

/* Regras para declação do throws na sobrescrita:
   - Quando estiver sobrescrevendo não é necessário lançar nenhuma exception;
   - Pode lançar uma ou todas a exceptions que existe na herança;
   - Pode ser adicionado qualquer tipo de exception do tipo unchecked que são filhas de RuntimeException;
   - Não pode adicionar exceptions mais genericas do tipo checked mas pode especificar melhor a classe pai.
   
*/
public class Funcionario extends Pessoa {
	@Override
	public void salvar() throws LoginInvalidoException, ArithmeticException {
		System.out.println("Salvando funcionario...");
	}
}
