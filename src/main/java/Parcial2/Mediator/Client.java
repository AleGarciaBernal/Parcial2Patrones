package Parcial2.Mediator;

public class Client {

    public static void main(String[]args){

        Chat mediator=new Chat();

        Docente c1=new Docente(mediator);
        Administrativo c2=new Administrativo(mediator);
        Estudiante c3=new Estudiante(mediator);

        mediator.setUser1(c1);
        mediator.setUser2(c2);
        mediator.setUser3(c3);

        c1.sendMsg("Hola Estudiantes");



    }
}
