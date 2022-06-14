package EstructurasYoParcial2.iterator.structure;

import java.util.Vector;

public class ConcreteIteratorB implements Iterator{

    //HAY QUE AGREGAR LOGICA--->
    private Vector<String> nameVector;
    private int index;

    public ConcreteIteratorB(Vector<String> nameVector){
        this.nameVector=nameVector;
        index=0;
    }

    @Override
    public Object next() {
        return nameVector.get(index++);
    }

    @Override
    public boolean hasNext() { 
        return nameVector.size()!=0 && index<nameVector.size();
    }
}
