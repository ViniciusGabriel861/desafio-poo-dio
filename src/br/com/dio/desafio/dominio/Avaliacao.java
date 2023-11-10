package br.com.dio.desafio.dominio;

public class Avaliacao {
    private int nota;
    private String comentario;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    @Override
    public String toString() {
        return "Avaliacao{" +
                "nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
    public void avaliarBootcamp(int nota, String comentario){
        if (nota >= 5){
            System.out.println(comentario);

        } else {
            System.out.println("Uma pena que você não gostou do nosso conteúdo, espero que continue para outras experiências melhores");

        }
    }
}
