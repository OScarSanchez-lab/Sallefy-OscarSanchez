package core;
public class Note {
    private int frecuencia;
    private int tiempo;
    private WaveType timbre;

    public Note(int frecuencia, int tiempo, WaveType timbre){
        this.frecuencia = frecuencia;
        this.tiempo =  tiempo;
        this.timbre = timbre;
    }

    public int getFrecuencia(){
        return frecuencia;
    }
    public int getTiempo(){
        return tiempo;
    }
    public WaveType getTimbre(){
        return timbre;
    }
}
