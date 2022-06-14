package Parcial2.Mediator;

import EstructurasYoParcial2.mediator.structure.ConcreteColleague1;
import EstructurasYoParcial2.mediator.structure.ConcreteColleague2;

import java.util.List;

public class Chat implements Mediator{

    private Docente user1; //como son pocos en este caso solo son atriburtos
    private Administrativo user2;
    private Estudiante user3;
/*
    private List<Estudiante> listE;
    private List<Docente> listD;
    private List<Administrativo> listA;

*/

    public void setUser1(Docente user1) {
        this.user1 = user1;
    }

    public void setUser2(Administrativo user2) {
        this.user2 = user2;
    }

    public void setUser3(Estudiante user3) {
        this.user3 = user3;
    }

    public void send(String msg, Persona persona,int aquienenviarestudiante) {
        if(persona==user1){
            user1.receiveMsg(msg);
            user3.receiveMsg(msg);
        }else if(persona==user3&&aquienenviarestudiante==1){
            user1.receiveMsg(msg);
            user2.receiveMsg(msg);
            user3.receiveMsg(msg);

        }else if(persona==user3&&aquienenviarestudiante==2){
            user1.receiveMsg(msg);
        }else if(persona==user3&&aquienenviarestudiante==3){
            user2.receiveMsg(msg);
        }else if(persona==user2){
            user1.receiveMsg(msg);
            user2.receiveMsg(msg);
            user3.receiveMsg(msg);

        }
    }

}
