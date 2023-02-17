package Colecoes;

import java.util.Set;

public class TesteBuscaAlunoNoCurso {

	public static void main(String[] args) {

		Curso cursos = new Curso("Curso de colecoes", "Eduardo");

		cursos.adiciona(new Aula("Trabalhando com ArrayList", 21));
		cursos.adiciona(new Aula("Criando uma Aula", 20));
		cursos.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Katia", 34672);
		Aluno a2 = new Aluno("Rebeca", 5617);
		Aluno a3 = new Aluno("Valeria", 17645);

		cursos.matricula(a1);
		cursos.matricula(a2);
		cursos.matricula(a3);
		
		System.out.println("Quem eh o aluno com matricula 5617?");
		Aluno aluno = cursos.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
		
		Aluno a4 = new Aluno("Rebeca Araujo", 5617);

		cursos.matricula(a2);
		cursos.matricula(a4);

		System.out.println("Quem eh o aluno com matricula 5617?");
		aluno = cursos.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
		

		System.out.println("Alunos matriculados: ");
		Set<Aluno> alunos = cursos.getAlunos();
		for (Aluno a : alunos) {
			System.out.println(a);
		}

	}
}
