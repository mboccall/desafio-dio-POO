import java.time.LocalDate;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcio:" + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        devMarcio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcio:" + devMarcio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcio:" + devMarcio.getConteudosConcluidos());
        System.out.println("XP:" + devMarcio.calcularTotalXp());

        System.out.println("-------");

        Dev devAngelo = new Dev();
        devAngelo.setNome("Angelo");
        devAngelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Angelo:" + devAngelo.getConteudosInscritos());
        devAngelo.progredir();
        devAngelo.progredir();
        devAngelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Angelo:" + devAngelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Angelo:" + devAngelo.getConteudosConcluidos());
        System.out.println("XP:" + devAngelo.calcularTotalXp());

    }

}