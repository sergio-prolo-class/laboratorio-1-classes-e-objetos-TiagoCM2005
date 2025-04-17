
package ifsc.poo;
import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private String genero, genero2;
    private int tot_pagina;
    private String capitulo;
    //Fantasia, Aventura, Romance, Mistério, Terror, Auto-ajuda e Pedagógico.
    private Scanner teclado_in = new Scanner(System.in);
    private ArrayList<String> cap = new ArrayList<>();
    private ArrayList<Integer> pag_inicial = new ArrayList<>();

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        if(autor != null){
            String formatador = autor.trim();
            this.autor = formatador = formatador.substring(0, 1).toUpperCase() + formatador.substring(1).toLowerCase(); // Deixa o nome no padrão
        }
    }

    public void setGenero(String genero){
        if(genero.equalsIgnoreCase("Fantasia") || genero.equalsIgnoreCase("Aventura") || genero.equalsIgnoreCase("Romance") || genero.equalsIgnoreCase("Mistério") || genero.equalsIgnoreCase("Terror") || genero.equalsIgnoreCase("Auto-ajuda") || genero.equalsIgnoreCase("Pedagógico")){
            this.genero = genero;
        } else {
            System.out.println("Gênero inválido!");
        }
    }

    public void setGenero(String genero, String genero2){
            if(genero.equalsIgnoreCase("Fantasia") || genero.equalsIgnoreCase("Aventura") || genero.equalsIgnoreCase("Romance") || genero.equalsIgnoreCase("Mistério") || genero.equalsIgnoreCase("Terror") || genero.equalsIgnoreCase("Auto-ajuda") || genero.equalsIgnoreCase("Pedagógico")){
                this.genero = genero;
            }  else {
                System.out.println("Gênero inválido!");
            }
            if(genero2.equalsIgnoreCase("Fantasia") || genero2.equalsIgnoreCase("Aventura") || genero2.equalsIgnoreCase("Romance") || genero2.equalsIgnoreCase("Mistério") || genero2.equalsIgnoreCase("Terror") || genero2.equalsIgnoreCase("Auto-ajuda") || genero2.equalsIgnoreCase("Pedagógico")){
                this.genero2 = genero2;
            } else {
                System.out.println("Gênero inválido!");
            }
    }


    public void setPagina(int pagina){
        
    }

    public void setCapitulo() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Qual o nome do capítulo " + i + "?");
            String name_cap = teclado_in.nextLine();
    
            if (name_cap.equalsIgnoreCase("fim")) break; // Verifica se o usuário digitou a palavra finalizado do loop;
    
            System.out.println("Qual a página que começa o capítulo " + i + "?");
            int num_list = teclado_in.nextInt();
            teclado_in.nextLine(); // Para evitar que o Scanner leia a quebra de linha após o número
    
            cap.add(name_cap);       // Lista de nomes de capítulos
            pag_inicial.add(num_list); // Lista de páginas iniciais
        }
    }
    
}
