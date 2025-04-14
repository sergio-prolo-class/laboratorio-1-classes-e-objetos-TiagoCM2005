package ifsc.poo;

/* (void) setNome(String nome)
(String) getNome()
(void) setIdade(int idade)
(int) getIdade()
(void) felizAniversario() */

class Pessoa{
    private String nome;
    private int idade;

    void setNome(String nome){
        if(nome != null){
            this.nome = nome.trim().capitalize();
        }
    }

    String getNome(){
        return this.nome;
    }

    void setIdade(int idade){
        if(idade > 0){
        this.idade = idade;
    } else {
        System.out.println("Entre com uma idade válida!");
    }
    }

    int getIdade(){
        return this.idade;
    }

    void felizAniversario(){
        this.idade++;
    }
}