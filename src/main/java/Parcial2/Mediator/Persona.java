package Parcial2.Mediator;


public abstract class Persona{
    protected Mediator mediator;

    public Persona(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void sendMsg(String msg);
    public abstract void receiveMsg(String msg);
}


