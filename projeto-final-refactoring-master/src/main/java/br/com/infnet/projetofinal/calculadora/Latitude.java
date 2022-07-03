package br.com.infnet.projetofinal.calculadora;

public class Latitude implements Idistancia{
    private Integer latitudeMin;
    private Integer latitudeMax;

    public Integer getLatitudeMin() {
        return latitudeMin;
    }

    public void setLatitudeMin(Integer latitudeMin) {
        this.latitudeMin = latitudeMin;
    }

    public Integer getLatitudeMax() {
        return latitudeMax;
    }

    public void setLatitudeMax(Integer latitudeMax) {
        this.latitudeMax = latitudeMax;
    }

    @Override
    public double distranciaEntrePontos() {
        return Math.pow((latitudeMax - latitudeMin), 2);
    }
}
