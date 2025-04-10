package ifsc.poo;

/* (void) setNome(String nome)
(String) getNome()
(void) setIdade(int idade)
(int) getIdade()
(void) felizAniversario() */

class Pessoa{
    String nome;
    int idade;

    void Setnome(String nome){
        if(nome != null)
        this.nome = nome;
    }

    String getnome(){
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