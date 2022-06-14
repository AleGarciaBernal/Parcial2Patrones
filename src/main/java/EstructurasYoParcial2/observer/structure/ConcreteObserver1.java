package EstructurasYoParcial2.observer.structure;

public class ConcreteObserver1 implements IObserver{


    public ConcreteObserver1(){}


    @Override
    public void update(String msg) {
        //Logica dependiendo lo que recibimos
        System.out.println("Concrete observer recibio "+msg);

    }
}
