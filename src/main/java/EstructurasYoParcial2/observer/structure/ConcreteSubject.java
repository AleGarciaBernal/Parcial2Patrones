package EstructurasYoParcial2.observer.structure;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Isubject {

    private List<IObserver> observers = new ArrayList<>();

    private String at1;
    private String at2;
    private String at3;

    public ConcreteSubject() {
    }

    public void action1(){
        System.out.println("Concrete Subject 1 ---- realizo action 1");
        this.notifyObservers("Action1 ");
    }

    public void action2(){
        System.out.println("Concrete Subject 1 ---- realizo action 2");
        this.notifyObservers("Action2");
    }


    @Override
    public void attatch(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void detatch(IObserver observer) {
        observers.remove(observer);

    }


    @Override
    public void notifyObservers(String msg) {
        for (IObserver observer:observers) {
            observer.update("");
            
        }

    }
}
