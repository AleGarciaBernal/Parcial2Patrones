package EstructurasYoParcial2.Memento.structure;

public class Originator {

    private ConcreteObject concreteObject;

    public void setMemento(ConcreteObject concreteObject){  //Inicializar concreteObject
        System.out.println("Originator-->Set State "+concreteObject.getState());
        this.concreteObject=concreteObject;
    }

    public Memento createMemento(){
        return new Memento(concreteObject);
    }

    public ConcreteObject restoreMemento(Memento m){
        this.concreteObject=m.getConcreteObject();
        //this.concreteObject.showInfo();
        return this.concreteObject;
    }
}

