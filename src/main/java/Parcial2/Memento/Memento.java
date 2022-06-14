package Parcial2.Memento;

public class Memento {
    private Documento documento;

    public Memento(Documento documento){
        this.documento =documento;
    }

    public Documento getDocumento() {
        return documento;
    }
}
