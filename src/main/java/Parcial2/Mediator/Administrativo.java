package Parcial2.Mediator;

public class Administrativo extends Persona{

    private String nombre;
    private String cargo;
    private int nroPorDefecto=0;

    public Administrativo(Mediator mediator) {
        super(mediator);
    }

    public Administrativo(Mediator mediator, String nombre, String cargo) {
        super(mediator);
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public void sendMsg(String msg) {
        mediator.send(msg,this,0);

    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println("Administrativo recibio el siguiente mensaje: " + msg);

    }
}
