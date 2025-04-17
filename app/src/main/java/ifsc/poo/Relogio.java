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
    
    public void ajustaHora(byte hora, byte minuto, byte segundo){
        if(hora >= 0 && hora < 24) this.hora = hora;
        if(minuto >= 0 && minuto < 60) this.minuto = minuto;
        if(segundo >= 0 && segundo < 60) this.segundo = segundo;
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
}
