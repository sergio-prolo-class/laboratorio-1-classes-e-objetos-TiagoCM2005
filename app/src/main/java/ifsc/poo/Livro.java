package ifsc.poo;

import java.util.Scanner;
import java.util.ArrayList;

public class Livro {
    String titulo;
    String autor;
    String genero;
    int pagina;
    String capitulo;
    //Fantasia, Aventura, Romance, Mistério, Terror, Auto-ajuda e Pedagógico.
    Scanner teclado_in = new Scanner(System.in);

    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    void setAutor(String autor){
        this.autor = autor;
    }

    void setGenero(String genero){
        // Um swtich para verificar qual genero foi digitado pelo usuario.
        // Eh preciso verificar qual meio para ler os dois digitos do usuario;
    }

    void setPagina(int pagina){
        this.pagina = pagina;
    }

    void setCapitulo(String capitulo){
        Arraylist<String> capitulos = new ArrayList<>();
        for(int i = 1; i <= 30; i++){
            System.out.println("Qual o nome do captiulo " + i + " ?");
            String cap = teclado_in.nextLine();

            if (cap.equalsIgnoreCase("fim")) break;


        }
    }


}
