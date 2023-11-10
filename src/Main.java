import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Lógica de programação");
        curso1.setDescricao("legal");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();

        curso2.setTitulo("JAVA");
        curso2.setDescricao("POO");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Explicações");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Para devs JAVA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVini = new Dev();
        devVini.setNome("Vinícius");
        devVini.inscreverBootcamp(bootcamp);
        devVini.progredir();
        devVini.progredir();
        System.out.println("XP: "+devVini.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("XP: "+devJoao.calcularTotalXp());

        System.out.println("Conteúdos Inscritos de Vinícius: "+devVini.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Vinícius: "+devVini.getConteudosConcluidos());

        System.out.println("Conteúdos Inscritos de João: "+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João: "+devJoao.getConteudosConcluidos());

    }
}
