package Parcial2.Memento;

public class Originator {
    private Documento state;

    public void setMemento(Documento state){
        System.out.println("Originator> set state");
        this.state=state;
    }

    public Memento createMemento(){
        return  new Memento(state);
    }

    public Documento restoreMemento(Memento m){
        this.state= m.getDocumento();
        return this.state;
    }

}
