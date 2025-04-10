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
    float largura;
    float altura;

    void setLargura(float largura){
        this.largura = largura;
    }

    void setAltura(float altura){
        this.altura = altura;
    }

    float getArea(){
        return this.largura*altura;
    }

    float getPerimetro(){
        return (2*(this.altura + this.largura));
    }

    
}