package ifsc.poo;

  class Lampada {
    private boolean luz;
    private static int total;

    public Lampada(){
        this.luz = false;
        this.total++;
    }

    public Lampada(Boolean estado){
        this.luz = estado;
        this.total++;
    }
    public void light_on(){
        this.luz = true;
    } 

    public void light_off(){
        this.luz = false;
    }

    public boolean verEstado(){
        return this.luz;
    }

    public static int verLampadas(){
        return total;
    }
}