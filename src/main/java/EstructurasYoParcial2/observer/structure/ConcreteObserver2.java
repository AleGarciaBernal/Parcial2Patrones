package EstructurasYoParcial2.observer.structure;

public class ConcreteObserver2 implements IObserver{


    public ConcreteObserver2(){}


    @Override
    public void update(String msg) {
        //Logica dependiendo lo que recibimos
        System.out.println("Concrete observer recibio "+msg);

    }
}
