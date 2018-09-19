package ar.com.jsdrake.practicas;

public class Apartamento extends Casa {

    private short   numeroInterno;

    public Apartamento(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                       float impuesto, double metrosCubicos, boolean hipotecada, short numeroInterno) {
        super(calle, seccion, numero, precio, fechaConstruccion, impuesto, metrosCubicos, hipotecada);
        this.numeroInterno = numeroInterno;
    }

    public short getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(short numeroInterno) {
        this.numeroInterno = numeroInterno;
    }
}
