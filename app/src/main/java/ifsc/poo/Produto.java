package ifsc.poo;

public class Produto {
    private String nome;
    private int preco;
    private int desconto;

    public void setNome(String nome){
        if(nome != null)
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(int preco){
        if(preco >= 0)
        this.preco = preco;
    }

    public float getPreco(){
        return this.preco - (this.preco * desconto/100.f);
    }

    public void setDesconto(int desconto){
        if(desconto >= 0) 
        this.desconto = desconto;
    }

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return String.format("%s: de R$ %.02f por APENAS R$ %.02f !", this.nome, (float) (this.preco), (float) (getPreco()));
    }

}
