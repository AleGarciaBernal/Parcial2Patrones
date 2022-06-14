package EstructurasYoParcial2.iterator.structure;

public class ConcreteAggregateA implements IAggregate{

    //Logica de algun objeto que almacene Objetos

    private String[]nameList; //array que almacena Strings
    private int index;

    ConcreteAggregateA(){ //Constructor-Instanciar nuesto objeto que almacena datos
        nameList=new String[5];
    }

    //Metodo Para agregar Datos

    public void add(String value){
        nameList[index]=value;
        index++;
    }

    //CREAR UN ITERATOR POR CADA AGGREGATE
    @Override
    public ConcreteIteratorA createIterator() {
        return new ConcreteIteratorA(nameList);
    }


}
