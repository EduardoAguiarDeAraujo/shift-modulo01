package Colecoes;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso cursos = new Curso("Dominando as colecoes", "Eduardo Araujo");

        cursos.adiciona(new Aula("Trabalhando com ArrayList", 21));
        cursos.adiciona(new Aula("Criando uma Aula", 20));
        cursos.adiciona(new Aula("Modelando com colecoes", 24));

        Aluno a1 = new Aluno("Katia", 34672);
        Aluno a2 = new Aluno("Rebeca", 5617);
        Aluno a3 = new Aluno("Valeria", 17645);

	    cursos.matricula(a1);
	    cursos.matricula(a2);
	    cursos.matricula(a3);
	    
	    cursos.getAlunos().forEach(aluno -> {
	        System.out.println(aluno);
	    });
	    
	    System.out.println("O aluno " + a1.getNome() + " estah matriculado?");
	    System.out.println(cursos.estaMatriculado(a1));
	    
	    Aluno katia = new Aluno("Katia", 34672);
	    System.out.println("A aluna Katia, estah matriculado? Resposta: " + cursos.estaMatriculado(katia));
	    
   }
}