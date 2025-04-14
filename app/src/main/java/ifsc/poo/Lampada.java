package ifsc.poo;

  class Lampada {
    private boolean luz;

    public void light_on(){
        this.luz = true;
    } 

    public void light_off(){
        this.luz = false;
    }

    public boolean verEstado(){
        return this.luz;
    }
}