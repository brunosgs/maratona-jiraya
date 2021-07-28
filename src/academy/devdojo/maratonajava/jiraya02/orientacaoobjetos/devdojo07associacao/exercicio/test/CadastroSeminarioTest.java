package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Estudante;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Seminario;

/*
  Crie um sistema que gerencie semin�rios
  O sistema dever� cadastrar semin�rios, estudantes, professores e local onde ser� realizado
  
  - Um aluno poder� estar em apenas um semin�rio
  - Um semin�rio poder� ter nenhum ou v�rios alunos
  - Um professor poder� ministrar v�rios semin�rios
  - Um semin�rio dev ter um local
  
  Campos b�sicos (excluindo relacionamento)
  semin�rio: t�tulo
  aluno: nome e idade
  professor: nome, especialidade
  local: endere�o
*/
public class CadastroSeminarioTest {

	public static void main(String[] args) {
		Local local = new Local("Rua das laranjeiras");

		Estudante estudante01 = new Estudante("Ana", 25);
		Estudante[] estudantes = { estudante01 };

		Professor professor01 = new Professor("Barba Branca", "Pirata");
		Seminario seminario01 = new Seminario("Onde achar one piece", estudantes, local);
		Seminario[] seminarios = { seminario01 };

		professor01.setSeminarios(seminarios);
		professor01.imprime();

	}

}
