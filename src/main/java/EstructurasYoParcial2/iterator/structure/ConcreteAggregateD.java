package EstructurasYoParcial2.iterator.structure;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregateD implements IAggregate {

    private List<String> nameList;

    public ConcreteAggregateD(){
        nameList =new ArrayList<>();
    }

    public void aregarDatos(String name){
        nameList.add(name);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorD(nameList);
    }
}
