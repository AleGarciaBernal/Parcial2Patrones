package EstructurasYoParcial2.mediator.structure;

public class ConcreteColleague1 extends Colleague{

    //atributos y logica

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String msg) {
        mediator.send(msg,this);

    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println("Concrete Colleague 1 recibio el siguiente mensaje: " + msg);
    }
}
