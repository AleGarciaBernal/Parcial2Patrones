package Parcial2.Mediator;


public class Estudiante extends Persona {

    private int matricula;
    private String nombre;

    public Estudiante(Mediator mediator) {
        super(mediator);
    }

    public Estudiante(Mediator mediator, int matricula, String nombre) {
        super(mediator);
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void sendMsg(String msg) {
        mediator.send(msg,this,1);


    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println("Estudiante recibio el siguiente mensaje: " + msg);

    }
}
