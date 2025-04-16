package ifsc.poo;

/* (void) setNome(String nome)
(String) getNome()
(void) setIdade(int idade)
(int) getIdade()
(void) felizAniversario() */

class Pessoa{
    private String nome;
    private int idade;

    public void setNome(String nome){
        if(nome != null){
            String formatador = nome.trim();
            this.nome = formatador = formatador.substring(0, 1).toUpperCase() + formatador.substring(1).toLowerCase(); // Deixa o nome no padrão
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade > 0){
        this.idade = idade;
    } else {
        System.out.println("Entre com uma idade válida!");
    }
    }

    public int getIdade(){
        return this.idade;
    }

    public void felizAniversario(){
        this.idade++;
    }
}