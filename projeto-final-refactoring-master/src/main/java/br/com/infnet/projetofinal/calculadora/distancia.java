package br.com.infnet.projetofinal.calculadora;

public class distancia {
    public String calculaDistacia(Double distanciaEntrePontosLatitude, Double distanciaEntrePontosLongitude) {
        FormataUtil formata = new FormataUtil();
        return formata.formatarDistancia(Math.sqrt(distanciaEntrePontosLatitude +  distanciaEntrePontosLongitude));
    }
}
