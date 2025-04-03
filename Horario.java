package aed;

public class Horario {
    private int hora; 
    private int minutos;

    public Horario(int hora, int minutos) {
       this.hora = hora;
       this.minutos = minutos;
    }

    public int hora() {
        return hora;
    }

    public int minutos() {
        return minutos;
    }

    @Override
    public String toString() {
        String hora_String = Integer.toString(hora);
        String minutos_String = Integer.toString(minutos);
        String res = hora_String + ":" + minutos_String;
        return res;
    }

    @Override
    public boolean equals(Object otro) {
        boolean otroIsNull = (otro == null);
        boolean claseDistinta = otro.getClass() != this.getClass();

        if (otroIsNull || claseDistinta) {
            return false;
        }
        Horario otroHorario = (Horario) otro; 

        return ((hora == otroHorario.hora) && (minutos == otroHorario.minutos));
    }
}