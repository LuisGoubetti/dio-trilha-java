import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BOOTCAMP JAVA DEVELOPER");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devLuis = new Dev();
		devLuis.setNome("Luis");
		devLuis.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + devLuis.getConteudosInscritos());
		devLuis.progredir();
		System.out.println("Conteudos concluidos: " + devLuis.getConteudosConcluidos());
		System.out.println("Conteudos inscritos apos: " + devLuis.getConteudosInscritos());
		devLuis.progredir();
		System.out.println("XP:" + devLuis.calcularXp());

		
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);		
		System.out.println("\nConteudos inscritos: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteudos concluidos: " + devJoao.getConteudosConcluidos());
		System.out.println("Conteudos inscritos apos: " + devJoao.getConteudosInscritos());
		System.out.println("XP:" + devJoao.calcularXp());



	}

}
