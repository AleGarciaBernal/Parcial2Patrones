package Parcial2.Memento;

public class Client {
    public static void main(String[] ardssd) {

        Caretaker caretaker1=new Caretaker();
        Originator originator1=new Originator();

        Documento doc;

        doc=new Documento(" Hola soy Ale");
        originator1.setMemento(doc);
        caretaker1.addMemento(originator1.createMemento());

        doc=new Documento(" Este es mi documento ");
        originator1.setMemento(doc);
        caretaker1.addMemento(originator1.createMemento());

        doc=new Documento(" Sobre la contaminacion ");
        originator1.setMemento(doc);
        caretaker1.addMemento(originator1.createMemento());

        doc=new Documento(" Capitulo 1");
        originator1.setMemento(doc);
        caretaker1.addMemento(originator1.createMemento());

        doc=originator1.restoreMemento(caretaker1.getMementZ());

        System.out.println("*************VALORES ACTUALES ********************");

        doc.showInfo();

    }
}
