package ifsc.poo;

/* (void) setNome(String nome)
(String) getNome()
(void) setIdade(int idade)
(int) getIdade()
(void) felizAniversario() */

class Pessoa{
    private String nome;
    private int idade;
    private String CPF;

    public boolean setNome(String nome){
        if(nome != null){
            String formatador = nome.trim();
            this.nome = formatador.substring(0, 1).toUpperCase() + formatador.substring(1).toLowerCase(); // Deixa o nome no padrão
            return true;
        } else 
        return false;
    }
    
    public boolean setCpf(String cpf){
        if(cpf.isEmpty() || cpf.isBlank()){
            this.CPF = "123.456.789-10";
            return true;
        } else {
            this.CPF = cpf;
            return false; // usuário entrou com um valor inválido
        }
    }
   
    public boolean setIdade(int idade){
        if(idade > 0){
        this.idade = idade;
        return true;
    } else {
        System.out.println("Entre com uma idade válida!");
        return false;
    }
    }

    public Pessoa(String cpf){
        setCpf(cpf);
    }

    public Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
        this.idade = 0;
    }

    public Pessoa(String nome, String cpf, int idade){
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getCpf(){
        return this.CPF;
    }

    public void felizAniversario(){
        if(this.idade > 0)
        this.idade++;
    }

}