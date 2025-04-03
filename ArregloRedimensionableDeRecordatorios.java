package aed;


class ArregloRedimensionableDeRecordatorios {
    private int longitud;
    private Recordatorio[] recordatorio;

    public ArregloRedimensionableDeRecordatorios() {
        this.recordatorio = new Recordatorio[0];
        this.longitud = 0;
    }

    public int longitud() {
        return longitud;
    }

    public void agregarAtras(Recordatorio i) {
            Recordatorio[] recordatorio_new = new Recordatorio[longitud() + 1];

            if (longitud() != 0){

                for (int j = 0; j < this.recordatorio.length; j++) {
                    recordatorio_new[j] = this.recordatorio[j];
                    
                }
                recordatorio_new[recordatorio_new.length - 1] = i; 
                this.longitud += 1;
                recordatorio = recordatorio_new.clone();
            }
            else {
                recordatorio_new[0] = i;
                longitud = 1;
                recordatorio = recordatorio_new.clone();
            }
    }

    public Recordatorio obtener(int i) {
        return recordatorio[i];
    }

    public void quitarAtras() {
       
        if (longitud() != 0){
            Recordatorio[] recordatorio_new = new Recordatorio[longitud() - 1];
            for (int j=0; j<(longitud()-1);j++){
                recordatorio_new[j] = recordatorio[j];
            }
            longitud -= 1;
            recordatorio = recordatorio_new;
        }
        else {
            longitud = 0;
        }

    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        recordatorio[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.recordatorio = vector.recordatorio.clone();
        this.longitud = vector.longitud;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios recordatorio_new = new ArregloRedimensionableDeRecordatorios(this);
        return recordatorio_new;
    } 
}