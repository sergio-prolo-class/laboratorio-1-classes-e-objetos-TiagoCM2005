package ifsc.poo;

/* Métodos:
(void) setLargura(float largura)
(void) setAltura(float altura)
(float) getArea()
(float) getPerimetro()
Na aplicação principal (App.java), teste sua classe da seguinte forma:
(a) Crie um retângulo com 5 de largura e 4 de altura
(b) Sua área é 20? Seu perímetro é 18?
(c) Crie uma lista de 10 retângulos gerados aleatoriamente
(d) Imprima a maior razão área sobre perímetro da lista */

class Retangulo {
    private float largura;
    private float altura;
    
    private static float maior_area;
    private static float menor_perimetro;

    private static Retangulo ret_maior_area = null;
    private static Retangulo ret_menor_perimetro = null;

    public Retangulo(float largura, float altura){
        if(largura > 0 && altura > 0){
            this.largura = largura;
            this.altura = altura;
        } else {
            this.largura = 1;
            this.altura = 1;
        }
        atualizaDados();
    }

    /* public void setLargura(float largura){
        this.largura = Math.abs(largura);
    }

    public void setAltura(float altura){
        this.altura = Math.abs(altura);
    } */

    public float getArea(){
        return this.largura*altura;
    }

    public float getPerimetro(){
        return (2*(this.altura + this.largura));
    }

    private void atualizaDados(){
        if(this.getArea() > maior_area){
            maior_area = this.getArea();
            ret_maior_area = this;
        }
        if(this.getPerimetro() < menor_perimetro){
            menor_perimetro = this.getPerimetro();
            ret_menor_perimetro = this;
        }
    }

    public static Retangulo getMaiorArea(){ // retorna o retângulo com a maior área
        return ret_maior_area;
    }

    public static Retangulo getMenorPerimetro(){ // retorna o retângulo com o menor perímetro
        return ret_menor_perimetro;
    }

    public static float getMaiorAreaValor(){ // retorna o valor da maior área
        return maior_area;
    }

    public static float getMenorPerimetroValor(){ // retorna o valor do menor perímetro
        return menor_perimetro;
    }


}