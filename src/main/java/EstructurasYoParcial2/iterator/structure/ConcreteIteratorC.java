package EstructurasYoParcial2.iterator.structure;

import java.util.Stack;

public class ConcreteIteratorC implements Iterator{

    private Stack<String> stackNames;
    private int posicion;

    public ConcreteIteratorC(Stack<String> autos){
        this.stackNames =autos;
    }

    @Override
    public Object next() {
        return stackNames.get(posicion++);
    }

    @Override
    public boolean hasNext() {
       return stackNames.size() != 0 && posicion< stackNames.size();
    }
}
