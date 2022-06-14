package EstructurasYoParcial2.observer.structure;

public class Client {

    public static void main(String[]args){
        ConcreteSubject subject=new ConcreteSubject();

        subject.attatch(new ConcreteObserver1());
        subject.attatch(new ConcreteObserver1());
        subject.attatch(new ConcreteObserver2());
        subject.attatch(new ConcreteObserver2());

        subject.action2();


    }

}
