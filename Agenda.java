package aed;

public class Agenda {
    private Fecha fechaActual; 
    private ArregloRedimensionableDeRecordatorios arreglo;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);

    }

    public void agregarRecordatorio(Recordatorio recordatorio) {

        this.arreglo.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String res = fechaActual.toString() + "\n"+ "=====" + "\n";

        for (int i = 0; i < (arreglo.longitud()-1); i++){
            res += arreglo.obtener(i).toString();
            res += "\n";
        }
        return res;
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return fechaActual;
    }

}