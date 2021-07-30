package academy.devdojo.maratonajava.jiraya03.exception.runtime.test;

/* Erros do tipo:
   
   - RuntimeExceptions é uma exceção do tipo Unchecked;
*/
public class RuntimeExceptionTest01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object objeto = null;
		int[] num = { 1, 2 };

//		System.out.println(objeto.toString());
		System.out.println(num[2]);
	}

}
