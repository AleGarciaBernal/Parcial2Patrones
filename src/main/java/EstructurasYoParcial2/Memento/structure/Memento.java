package EstructurasYoParcial2.Memento.structure;

public class Memento {

    private ConcreteObject concreteObject;

    public Memento(ConcreteObject concreteObject){
        this.concreteObject=concreteObject;
    }

    public ConcreteObject getConcreteObject() {
        return concreteObject;
    }


}
