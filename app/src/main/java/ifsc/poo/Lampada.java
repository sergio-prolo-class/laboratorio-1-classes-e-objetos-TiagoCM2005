package ifsc.poo;

  class Lampada {
    boolean luz;

    void light_on(){
        this.luz = true;
    } 

    void light_off(){
        this.luz = false;
    }

    boolean verEstado(){
        return this.luz;
    }
}