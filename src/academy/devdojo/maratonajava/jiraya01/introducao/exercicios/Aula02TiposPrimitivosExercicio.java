package academy.devdojo.maratonajava.jiraya01.introducao.exercicios;

/* Prática
   
   Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
   
   Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>,
   na data <data>
  
*/
public class Aula02TiposPrimitivosExercicio {

	public static void main(String[] args) {
		String nome = "Bruno";
		String endereco = "Rua Joao dos anjos";
		double salario = 2516.13;
		String dataRecebimento = "12/07/2021";
		String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de "
				+ salario + ", na data " + dataRecebimento;

		System.out.println(relatorio);
	}

}
