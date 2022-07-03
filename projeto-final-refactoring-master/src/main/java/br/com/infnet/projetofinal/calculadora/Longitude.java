package br.com.infnet.projetofinal.calculadora;

public class Longitude implements Idistancia{
    private Integer longitudeMin;
    private Integer longitudeMax;

    public Integer getLongitudeMin() {
        return longitudeMin;
    }

    public void setLongitudeMin(Integer longitudeMin) {
        this.longitudeMin = longitudeMin;
    }

    public Integer getLongitudeMax() {
        return longitudeMax;
    }

    public void setLongitudeMax(Integer longitudeMax) {
        this.longitudeMax = longitudeMax;
    }

    @Override
    public double distranciaEntrePontos() {
        return Math.pow((longitudeMax - longitudeMin), 2);
    }
}
