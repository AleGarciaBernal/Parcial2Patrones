package EstructurasYoParcial2.iterator.structure;

import java.util.Stack;

public class ConcreteAggregateC implements IAggregate {

    private Stack<String> stackNames;

    public ConcreteAggregateC(){
        stackNames=new Stack<>();
    }

    public void aregarDatos(String name){
        stackNames.add(name);
    }

    @Override
    public ConcreteIteratorC createIterator() {
        return new ConcreteIteratorC(stackNames);
    }

}
