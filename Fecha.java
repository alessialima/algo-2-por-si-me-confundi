package aed;

public class Fecha {
    private int dia;
    private int mes; 

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        dia = fecha.dia;
        mes = fecha.mes;
    }

    public Integer dia() {
        return dia;
    }

    public Integer mes() {
        return mes;
    }

    public String toString() {
        String dia_String = Integer.toString(dia);
        String mes_String = Integer.toString(mes);
        String res = dia_String + "/" + mes_String;
        return res; 
    }

    @Override
    public boolean equals(Object otra) {
        boolean otraIsNull = (otra == null);
        boolean claseDistinta = otra.getClass() != this.getClass();

        if (otraIsNull || claseDistinta) {
            return false;
        }
        Fecha otraFecha = (Fecha) otra;

        return ((dia == otraFecha.dia) && (mes == otraFecha.mes));
    }

    public void incrementarDia() {
        int res = dia + 1;
        int aux = mes + 1;

        if (res <= diasEnMes(mes)) {
            this.dia = res;
        }
        else{
            if (mes == 12){
                this.dia = 1;
                this.mes = 1;
            }
            else {
                this.dia = 1;
                this.mes = aux;
            }
        }

    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }
}