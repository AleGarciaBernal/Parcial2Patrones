package EstructurasYoParcial2.mediator.structure;

public class ConcreteMediator implements Mediator{

    //HACER CAMBIOS AQUI

    //necesitamos almacenar todos los colleagues que se van a comunicar listas o arrays
    //Hacer metodo para agregar

    private ConcreteColleague1 user1; //como son pocos en este caso solo son atriburtos
    private ConcreteColleague2 user2;

    public void setUser1(ConcreteColleague1 user1) {
        this.user1 = user1;
    }

    public void setUser2(ConcreteColleague2 user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String msg, Colleague colleague) {
        if(colleague==user1){
            user2.receiveMsg(msg);
        }else{
            user1.receiveMsg(msg);
        }


        //Logica de quienes reciben y envian mensajes
        //mapas etc


    }
}
