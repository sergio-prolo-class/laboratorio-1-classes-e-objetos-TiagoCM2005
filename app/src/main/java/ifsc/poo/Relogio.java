package ifsc.poo;
//• Métodos:
// (void) ajustaHora(byte hora, byte minuto, byte segundo)
// (String) getHora()
// (void) avancaHora()
// (void) avancaMinuto()
// (void) avancaSegundo()

public class Relogio {
    private byte hora;
    private byte minuto;
    private  byte segundo;
    

    public Relogio(byte hora, byte minuto, byte segundo){
        ajustaHora(hora, minuto, segundo);
    }

    public Relogio(byte hora, byte minuto){
        ajustaHora(hora, minuto);
    }

    public Relogio(byte hora){
        ajustaHora(hora);
    }
    public void ajustaHora(byte hora, byte minuto, byte segundo){
        if(hora >= 0 && hora < 24){ 
            this.hora = hora;
        } else this.hora = 0;
        if(minuto >= 0 && minuto < 60){ 
        this.minuto = minuto;
        } else this.minuto = 0;
        
        if(segundo >= 0 && segundo < 60){  
        this.segundo = segundo;
        } else this.segundo = 0;
    }

    public void ajustaHora(byte hora, byte minuto){
        ajustaHora(hora, minuto, (byte) 0);
    }

    public void ajustaHora(byte hora){
        ajustaHora(hora, (byte) 0 , (byte) 0);
    }

    public String getHora(){
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    public void avancaHora(){
        this.hora = (byte)(hora + 1 % 24);
        if(this.hora == 24) this.hora = 0;
    }

    public void avancaMinuto(){
        this.minuto++;
        if(this.minuto >= 60){ // Caso o minuto passe de 60 ou chegue em 60
            this.minuto = 0; // Minuto volta para 0
            avancaHora(); // E avança a hora
        }
    }

    public void avancaSegundo(){
        this.segundo++;
        if(this.segundo >= 60){
            this.segundo = 0;
            avancaMinuto();
        }
    }

    public String getHoras2(){
        byte hora12 = (byte)(this.hora % 12);
        if(this.hora > 11){
           return String.format("%02dpm %02dm %02ds", hora12, this.minuto, this.segundo);
        } else {
            return String.format("%02dam %02dm %02ds", hora12, this.minuto, this.segundo);
        }
    }

    public void sicroniza(){
        // falta terminar!!
    }

    public void diferencia(Relogio outro){
        int dif_hora = this.hora - outro.hora;
        int dif_min = this.minuto - outro.minuto;
        int dif_seg = this.segundo - outro.segundo;
    
        System.out.println("Diferença em horas: " + Math.abs(dif_hora));
        System.out.println("Diferença em minutos: " + Math.abs(dif_min));
        System.out.println("Diferença em segundos: " + Math.abs(dif_seg));

        int tempo1 = this.hora * 3600 + this.minuto * 60 + this.segundo;
        int tempo2 = outro.hora * 3600 + outro.minuto * 60 + outro.segundo;
    
        int diferenca = Math.abs(tempo1 - tempo2);
    
        System.out.println("Diferença total em segundos: " + diferenca);
    }
}

