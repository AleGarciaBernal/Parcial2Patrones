package EstructurasYoParcial2.iterator.structure;

import java.util.Vector;

public class ConcreteAggregateB implements IAggregate {

    private Vector<String> nameVector;
    //private int index;

    public ConcreteAggregateB() {
        nameVector=new Vector<>();
    }

    public void add(String value){
        nameVector.add(value);
    }

    @Override
    public ConcreteIteratorB createIterator() {
        return new ConcreteIteratorB(nameVector);
    }
}
