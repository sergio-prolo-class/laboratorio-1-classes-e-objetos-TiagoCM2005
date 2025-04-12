package ifsc.poo;

public class Produto {
    String nome;
    int preco;
    int desconto;

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setPreco(int preco){
        this.preco = preco;
    }

    float getPreco(){
        return (float)this.preco;
    }

    void setDesconto(int desconto){
        this.desconto = (int)(this.preco * desconto/100f);
    }

    int getDesconto(){
        return (this.preco - this.desconto);
    }

    String anuncio(){
        return this.nome + ": de R$" + this.preco + " por APENAS R$" + getDesconto();
    }

}
