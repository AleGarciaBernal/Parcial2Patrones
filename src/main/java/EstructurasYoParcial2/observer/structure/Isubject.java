package EstructurasYoParcial2.observer.structure;

public interface Isubject {

    void attatch(IObserver observer); //Agregar observadores

    void detatch(IObserver observer); //quitar observadores

    void notifyObservers(String msg); //puede cambiar

}
