package Parcial2.Mediator;

public class Docente extends Persona {

    private String nombre;
    private int ci;

    public Docente(Mediator mediator) {
        super(mediator);
    }

    public Docente(Mediator mediator, String nombre, int ci) {
        super(mediator);
        this.nombre = nombre;
        this.ci = ci;
    }

    @Override
    public void sendMsg(String msg) {
        mediator.send(msg,this,0);


    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println("Docente recibio el siguiente mensaje: " + msg);

    }
}
