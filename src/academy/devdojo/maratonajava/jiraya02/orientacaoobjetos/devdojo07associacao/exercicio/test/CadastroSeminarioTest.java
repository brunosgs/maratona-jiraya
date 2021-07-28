package academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.test;

import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Estudante;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.jiraya02.orientacaoobjetos.devdojo07associacao.exercicio.dominio.Seminario;

/*
  Crie um sistema que gerencie seminários
  O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
  
  - Um aluno poderá estar em apenas um seminário
  - Um seminário poderá ter nenhum ou vários alunos
  - Um professor poderá ministrar vários seminários
  - Um seminário dev ter um local
  
  Campos básicos (excluindo relacionamento)
  seminário: título
  aluno: nome e idade
  professor: nome, especialidade
  local: endereço
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
