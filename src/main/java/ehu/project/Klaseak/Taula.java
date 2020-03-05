package ehu.project.Klaseak;

import java.sql.Time;

public class Taula {

    private Integer pos;
    private String izena;
    private Time denbora;

    public Taula(Integer pos,String izena, Time denbora) {
        this.pos=pos;
        this.izena = izena;
        this.denbora = denbora;
    }

    public Integer getPos(){
        return pos;
    }

    public String getIzena() {
        return izena;
    }

    public Time getDenbora() {
        return denbora;
    }
}
