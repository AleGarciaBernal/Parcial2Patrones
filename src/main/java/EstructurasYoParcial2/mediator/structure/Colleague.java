package EstructurasYoParcial2.mediator.structure;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void sendMsg(String msg);
    public abstract void receiveMsg(String msg);
}
