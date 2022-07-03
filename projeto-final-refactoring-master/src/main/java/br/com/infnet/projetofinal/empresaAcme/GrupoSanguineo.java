package br.com.infnet.projetofinal.empresaAcme;

public enum GrupoSanguineo {
    O(1), A(2), B(3), AB(4);

    private int tipoSangue;

    GrupoSanguineo(int tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public int getTipoSangue() {
        return tipoSangue;
    }
}
