package academy.devdojo.maratonajava.jiraya01.introducao.exercicios;

/* Pr�tica
   
   Crie vari�veis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
   
   Eu <nome>, morando no endere�o <endere�o>, confirmo que recebi o sal�rio de <salario>,
   na data <data>
  
*/
public class Aula02TiposPrimitivosExercicio {

	public static void main(String[] args) {
		String nome = "Bruno";
		String endereco = "Rua Joao dos anjos";
		double salario = 2516.13;
		String dataRecebimento = "12/07/2021";
		String relatorio = "Eu " + nome + ", morando no endere�o " + endereco + ", confirmo que recebi o sal�rio de "
				+ salario + ", na data " + dataRecebimento;

		System.out.println(relatorio);
	}

}
