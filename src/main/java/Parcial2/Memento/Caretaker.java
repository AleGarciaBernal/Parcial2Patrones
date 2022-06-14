package Parcial2.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    // objeto que almacena momentos/stados ---> LIST
    private List<Memento> stateList = new ArrayList<>();


    public void addMemento(Memento m){
        stateList.add(m);
    }

    public Memento getMementZ(){
        return stateList.get((stateList.size()-1)-1);


    }

    public Memento getMementoY(){
        return stateList.get((stateList.size()-1)+1);
    }



}
