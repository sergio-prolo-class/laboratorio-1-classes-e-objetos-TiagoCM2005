package ifsc.poo;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private int preco;
    private int desconto;
    private static int total;
    private final String codigo;
    private static final ArrayList<Produto> ultimosProdutos = new ArrayList<>();

    public Produto(String nome, int preco){
        setNome(nome);
        setPreco(preco);
        setDesconto(0);
        total++;
        this.codigo = gerarCodigo(total);
        ultimosProdutos.add(this); // adiciona todo produto novo no array
    } 

    private String gerarCodigo(int numero){
        return String.format("CD:%03d-%03d", numero/1000, numero%1000); // quando o numero for 3, o resto da divisão vai ser 3 e a divisão por 1000 zero.
    }

    public String getCodigo(){
        return this.codigo;
    }

    public static ArrayList<Produto> getUltimosProdutos() {
        return ultimosProdutos;
    } 
    
    public boolean setNome(String nome){
        if(nome != null){
            String formatador = nome.trim();
            this.nome = formatador.substring(0, 1).toUpperCase() + formatador.substring(1).toLowerCase(); // Deixa o nome no padrão
            return true;
        } else 
        return false;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setPreco(int preco){
        if(preco >= 0){
        this.preco = preco;
        return true;
    } else return false;
    }

    public static int getTotal() {
        return total;
    }    

    public float getPreco(){
        return this.preco - (this.preco * desconto/100.f);
    }

    public boolean setDesconto(int desconto){
        if(desconto >= 0){
        this.desconto = desconto;
        return true;
    } else return false;
}

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return String.format("%s: de R$ %.02f por APENAS R$ %.02f !", this.nome, (float) (this.preco), (float) (getPreco()));
    }

}
