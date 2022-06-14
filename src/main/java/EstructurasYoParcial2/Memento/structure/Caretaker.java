package EstructurasYoParcial2.Memento.structure;

import java.util.ArrayList;
import java.util.List;

public class Caretaker { //Aqui sonn los cambios mas grandes

    private List<Memento>mementoList=new ArrayList<>(); //aqui se gurdan los estados guardados del objeto/guardar objeto)(?)

    public void addMemento(Memento m){
        mementoList.add(m);
    }

    public Memento getMemento(int index){ //Forma de obtner objetos de nuestro almacenador de datos
        return mementoList.get(index);
    }
}
