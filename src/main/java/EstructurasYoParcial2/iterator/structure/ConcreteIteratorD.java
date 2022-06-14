package EstructurasYoParcial2.iterator.structure;

import java.util.List;

public class ConcreteIteratorD implements Iterator{

    private List<String> nameList;
    private int posicion;

    public ConcreteIteratorD(List<String> nameList){
        this.nameList =nameList;
    }

    @Override
    public Object next() {
        return nameList.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return nameList.size() != 0 && posicion < nameList.size();
    }
}
