package EstructurasYoParcial2.iterator.structure;

public class ConcreteIteratorA implements Iterator{

    //HAY QUE AGREGAR LOGICA--->
    private String[]nameList; //array que almacena Strings
    private int index;

    public ConcreteIteratorA(String[]nameList){
        this.nameList=nameList;
    }

    @Override
    public Object next() {
        return nameList[index++];
    }

    @Override
    public boolean hasNext() {
        return nameList.length!=0 && index<nameList.length;
    }
}
