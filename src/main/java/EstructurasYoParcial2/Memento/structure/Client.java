package EstructurasYoParcial2.Memento.structure;

public class Client {

    public static void main(String[]args){

        Caretaker caretaker=new Caretaker();
        Originator originator=new Originator();

        ConcreteObject concreteObject;

        concreteObject=new ConcreteObject("Ale Garcia", "1");
        originator.setMemento(concreteObject);//Crear memento
        caretaker.addMemento(originator.createMemento());//Guardando memento
        concreteObject=new ConcreteObject(concreteObject.getAt3()+"\nAle Guzman", "2");
        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento());
        concreteObject=new ConcreteObject(concreteObject.getAt3()+"\nAle Valle", "3");
        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento());
        concreteObject=new ConcreteObject(concreteObject.getAt3()+"\nAle Bernal", "4");
        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento());
        concreteObject=new ConcreteObject(concreteObject.getAt3()+"\nAle Rios", "5");
        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento());

        concreteObject=originator.restoreMemento(caretaker.getMemento(3));
        concreteObject.showInfo();






    }
}
